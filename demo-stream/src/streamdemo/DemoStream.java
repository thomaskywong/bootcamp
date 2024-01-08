package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
        public static void main(String[] args) {
                List<Cat> cats = new ArrayList<>(List.of(new Cat("Bobo", 13),
                                new Cat("Chestnut", 4), new Cat("Arron", 8)));

                // stream() to filter starts with "D" 77 age<2
                List<Cat> result = cats.stream()
                                .filter(x -> x.getName().startsWith("D"))
                                .filter(x -> x.getAge() < 2)
                                .collect(Collectors.toList());
                System.out.println(result);


                List<Cat> result2 = cats.stream()
                                .filter(x -> x.getName().startsWith("B")
                                                || x.getName().startsWith("C"))
                                .filter(x -> x.getAge() < 15)
                                .collect(Collectors.toList());
                System.out.println(result2);

                // Filter Cat, and return List<String> only
                List<String> catName = cats.stream()
                                .filter(x -> x.getName().startsWith("B")
                                                || x.getName().startsWith("A"))
                                .map(x -> x.getName())
                                .collect(Collectors.toList());

                System.out.println(catName);

                // Filter Cat, and return List<Integer> only
                List<Integer> catAge =
                                cats.stream().filter(x -> x.getAge() < 15)
                                                .map(x -> x.getAge())
                                                .collect(Collectors.toList());

                System.out.println(catAge);
                System.out.println(cats);

                // Convert List<Cat> to List<Dog>
                List<Dog> dogs = cats.stream().filter(e -> e.getAge() <= 10)
                                .map(e -> {
                                        return new Dog(e.getName(), e.getAge());
                                }).collect(Collectors.toList());
                System.out.println(dogs);
                System.out.println();

                System.out.println(cats);

                // Use for loop to demonstrate Convert List<Cat> to List<Dog>
                List<Dog> dogs2 = new ArrayList<>();

                for (Cat cat : cats) {
                        if (cat.getAge() <= 10)
                                dogs2.add(new Dog(cat.getName(), cat.getAge()));
                }
                System.out.println(dogs2);

                List<Staff> staffs = new ArrayList<>(
                                List.of(new Staff("John", 20000),
                                                new Staff("Mary", 10000)));

                double sum = 0.0d;
                double max = 0.0d;

                for (Staff staff : staffs) {
                        sum += staff.getSalary();
                        if (staff.getSalary() > max)
                                max = staff.getSalary();
                }

                System.out.println("sum=" + sum);
                System.out.println("max=" + max);

                // Stream approach
                // get salary with double
                List<Integer> listOfSalary =
                                staffs.stream().map(x -> x.getSalary()) // intermediate operation
                                                .collect(Collectors.toList()); // terminate operation

                System.out.println(listOfSalary);

                double total = staffs.stream().map(x -> x.getSalary()) // (intermediate operation)
                                .mapToDouble(d -> d) // double to Double for .sum() method (intermediate operation)
                                .sum(); // Double Stream methods (terminate operation)
                System.out.println("Sum of salary= " + total);

                long countOfStaff = staffs.stream().count(); //
                System.out.println(countOfStaff);

                // .collect(Collectors.toSet())
                List<Cat> cats3 = new ArrayList<>(List.of(new Cat("DEF", 3),
                                new Cat("DEF", 3), new Cat("IHJ", 5)));
                System.out.println(cats3);

                Set<Cat> cats4 = cats3.stream().collect(Collectors.toSet());
                System.out.println(cats4);

                // distinct -> remove duplicated elements
                // .distinct()
                List<Cat> cats5 = cats3.stream().distinct()
                                .collect(Collectors.toList());
                System.out.println(cats5);

                // Prepare 2 customers, each of them has his own Addresses
                List<Customer> customers = new ArrayList<>();

                Customer c1 = new Customer("Kwun Tong", "Kowloon");
                Customer c2 = new Customer("Tuen Mun", "N.T.");


                customers.add(c1);
                customers.add(c2);
                System.out.println(customers);
                System.out.println();

                System.out.println();
                System.out.println("flatMap()");
                // Retrieve all addresses from a list of customers
                List<Customer.Address> addresses = customers.stream()
                                .flatMap(c -> c.getAddresses().stream()) // [..., ..., ...] from Stream<Customer> to Stream<Address>
                                .collect(Collectors.toList());

                System.out.println(addresses);
                System.out.println();

                List<List<Customer.Address>> listOfAddress =
                                customers.stream().map(c -> c.getAddresses()) // [[], [], [] ...]
                                                .collect(Collectors.toList());

                System.out.println(listOfAddress);

                List<List<Integer>> integersList = new ArrayList<>(List.of(
                                new ArrayList<>(List.of(1, 3, 5)),
                                new ArrayList<>(List.of(2, 4, 6))));
                System.out.println(integersList);
                System.out.println();

                List<Integer> integers = integersList.stream()
                                .flatMap(e -> e.stream()).sorted()
                                .collect(Collectors.toList());
                System.out.println(integers);

                // Use .flatMap(e -> e.stream()) method
                // step 1: convert a list e to a stream.
                // step 2: combine a list of stream into a single element
                List<Integer> integers2 = integersList.stream()
                                .flatMap(e -> e.stream())
                                .sorted((x, y) -> y > x ? 1 : -1)
                                .collect(Collectors.toList());
                System.out.println(integers2);
                System.out.println();

                // List<String>
                List<Cat> catList = new ArrayList<>(List.of(
                                new Cat("Jenny", 10), new Cat("Bobo", 16),
                                new Cat("Karis", 8), new Cat("Andy", 14)));
                // return a list of cat names with age > 9, order by the sage of cats
                List<String> names = catList.stream()
                                .filter(x -> x.getAge() > 9)
                                .sorted((x, y) -> y.getAge() > x.getAge() ? -1
                                                : 1)
                                .map(e -> e.getName())
                                .collect(Collectors.toList());
                System.out.println(names);

                String name = catList.stream().filter(x -> x.getAge() > 9)
                                .sorted((x, y) -> y.getAge() > x.getAge() ? -1
                                                : 1)
                                .map(e -> e.getName())
                                .collect(Collectors.joining(", "));
                System.out.println(name);
                System.out.println();

                // .anyMatch()
                boolean hasBobo = catList.stream()
                                .anyMatch(x -> x.getName().contains("Bobo"));
                System.out.println(hasBobo);

                boolean hasAndy = catList.stream()
                                .anyMatch(x -> "Andy".equals(x.getName()));
                System.out.println(hasAndy);
                System.out.println();

                // Collectors.partitioningBy( Lambda expression )
                // .collect(Collectors.partitioningBy( Predicate lambda expression ))
                Map<Boolean, List<Cat>> catsMap = catList.stream()
                                .collect(Collectors.partitioningBy(
                                                x -> x.getAge() > 10));
                System.out.println(catsMap);
                System.out.println();

                // .mapToInt(e -> e.getAge())
                sum = 0;
                sum = catList.stream().mapToInt(e -> e.getAge()).sum();
                System.out.println(sum);

                // Stream type
                // Stream closely communicate with List
                // Stream implements Collections
                Stream<Cat> sc = Stream.of(new Cat("Jenny", 10),
                                new Cat("Bobo", 16), new Cat("Karis", 8),
                                new Cat("Andy", 14));
                List<Cat> lc = sc.filter(e -> e.getAge() > 10)
                                .collect(Collectors.toList());
                System.out.println(lc);
                System.out.println();

                Stream<Cat> sc2 = Stream.ofNullable(null);
                sc2.forEach(e -> {
                        System.out.println("hello");
                }); // empty Stream is an object, NOT a null pointer

                Cat c01 = null;
                Stream.of(c01); 
                // Cannot pass "null" as argument of Stream.of() method.
                // Stream<Cat> sc3 = Stream.of(null); // Runtime exception - NullPointerException

                
                
        }

}
