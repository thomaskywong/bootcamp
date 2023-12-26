package src.practisepriorityqueue;

import java.util.PriorityQueue;

public class PractisePriorityQueue {

  public static void main(String[] args) {

    Customer c1 = new Customer("Joe");
    Customer c2 = new Customer("Mary");
    Customer c3 = new Customer("Keith");
    Customer c4 = new Customer("Thomas");
    
    PriorityQueue<Customer> customers = new PriorityQueue<>();

    customers.add(c1);
    customers.add(c2);
    customers.add(c3);
    customers.add(c4);

    // Order defined by Comparable Interface method compareTo() overrided in Customer class
    // auto sorting in accending order
    System.out.println(customers); // [name=Joe, name=Mary, name=Keith, name=Thomas]

    // Order defined by Comparator object injected into PriorityQueue constructor by Constructor Injection
    
    // Comparator<Customer>. SortByName implements Comparator<Customer>
    SortByName sortByName = new SortByName();

    PriorityQueue<Customer> customers2 = new PriorityQueue<>(sortByName);
    customers2.add(c1);
    customers2.add(c2);
    customers2.add(c3);
    customers2.add(c4);

    System.out.println(customers2); // [name=Thomas, name=Mary, name=Keith, name=Joe]



  }

}
