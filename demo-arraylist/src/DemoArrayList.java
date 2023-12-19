import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        ArrayList<String> strings2 = new ArrayList<>();

        // .add(Object) add element into ArrayList
        strings.add("ABC");
        strings.add("IJK");
        strings.add("XYZ");
        System.out.println(strings); // [ABC, IJK, XYZ]
        System.out.println();

        // .add(index, Object) add element at index of ArrayList
        strings.add(1, "OOO");
        System.out.println(strings); // [ABC, OOO, IJK, XYZ]
        System.out.println();

        // .remove(Object) remove the given object from ArrayList. return true if success. return false if not found
        System.out.println(strings.remove("IJK")); // true
        System.out.println(strings.remove("abc")); // true
        System.out.println(strings); // [ABC, OOO, XYZ]
        System.out.println();

        // .remove(index) remove the object from the given index of ArrayList. Compilation error if index out of bound
        strings.remove(1);
        System.out.println(strings); // [ABC, XYZ]
        System.out.println();

        // .get(index) return object of ArrayList from given index. compilation error if out of bound
        System.out.println(strings.get(1)); // XYZ
        System.out.println();

        // .set(index, Object) insert or append element at given index of ArrayList
        strings.set(1, "FGH");
        System.out.println(strings); // [ABC, FGH]
        System.out.println();


        // for each loop to iterate each element of ArrayList
        for (String s : strings) {
            System.out.println(s); // ABC FGH
        }
        System.out.println();


        // List.of("xxx", "yyy", ... ) a list of objects. Used to initialze the ArrayList
        ArrayList<String> newElements =
                new ArrayList<>(List.of("YUI", "789", "hjk", "+_)"));

        // .addAll(List Object) append the list object into the ArrayList
        strings.addAll(newElements);
        System.out.println(strings); // [ABC, FGH, YUI, 789, hjk, +_)]
        System.out.println();

        // .size() return the size of the current ArrayList length
        System.out.println(strings.size()); // 6
        System.out.println();

        // .isEmpty() return true if the ArrayList is empty. return false if not empty
        System.out.println(strings.isEmpty()); // false
        System.out.println();


        // .indexOf(Object) return the index value of ArrayList that contains the given Object. return -1 if not found
        System.out.println(strings.indexOf("hjk")); // 4
        System.out.println();

        strings.add("789");
        // .lastIndexOf(Object) return the last index value of ArrayList that contains the given Objects. return -1 if not found
        System.out.println(strings.lastIndexOf("789")); // 6
        System.out.println(strings.lastIndexOf("erf")); // -1
        System.out.println();

        // .contains(Object) check if the given Object is in ArrayList. return true if found. return false if not found
        System.out.println(strings.contains("789")); // true
        System.out.println(strings.contains("erf")); // false
        System.out.println();

        System.out.println(strings); // [ABC, FGH, YUI, 789, hjk, +_), 789]
        // .containsAll(List) check if all elements in List is contains in ArrayList
        ArrayList<String> list01 = new ArrayList<>(List.of("ABC", "YUI"));
        ArrayList<String> list02 = new ArrayList<>(List.of("ABC", "DEF"));
        System.out.println(strings.containsAll(list01)); // true
        System.out.println(strings.containsAll(list02)); // true
        System.out.println();


        System.out.println(strings); // .toString() is overriden by ArrayList class. [ABC, FGH, YUI, 789, hjk, +_), 789]
        System.out.println();

        // subList( start index (inclusive), end index (exclusive)). Save object reference by interface type of reference List<>
        List<String> string2 = strings.subList(1, 5);
        System.out.println(string2); // [FGH, YUI, 789, hjk] !!! exclude index 5!!!

        ArrayList<String> anotherList =
                new ArrayList<>(List.of("1234", "2345", "0000"));
        // .addAll( List ) add all element in List into the ArrayList
        strings.addAll(anotherList);
        System.out.println(strings); // [ABC, FGH, YUI, 789, hjk, +_), 789, 1234, 2345, 0000]
        System.out.println();

        // .addAll(index, List) add all element in List at the index of the ArrayList
        strings.addAll(1, anotherList);
        System.out.println(strings); // [ABC, 1234, 2345, 0000, FGH, YUI, 789, hjk, +_), 789, 1234, 2345, 0000]
        System.out.println();

        // .removeAll(List) remove all elements contains in List from the ArrayList
        strings.removeAll(anotherList);
        System.out.println(strings); // [ABC, FGH, YUI, 789, hjk, +_), 789]
        System.out.println();
        strings.addAll(anotherList);
        strings.add("HJIHK");
        System.out.println(strings); // [ABC, FGH, YUI, 789, hjk, +_), 789, 1234, 2345, 0000, HJIHK]
        System.out.println();

        // .retainAll(List) remove all other elements that is not in the given List from the ArrayList
        ArrayList<String> aList = new ArrayList<>(List.of("789", "1234"));
        strings.retainAll(aList);
        System.out.println(strings); // [789, 789, 1234]
        System.out.println();

        // .isEmpty() return true if the Arraylist is an empty array. return false if not empty
        System.out.println(".isEmpty()");
        if (!strings.isEmpty()) {
            System.out.println("The string is not empty.");
        }
        System.out.println();

        // create a list of elements
        List<String> arrList1 =
                new ArrayList<>(List.of("John", "Mary", "Peter")); // Object of ArrayList
        List<String> arrList2 = List.of("John", "Mary", "Peter"); // List is immutabable. cannot add or remove

        arrList1.add("Sally"); // can add. call ArrayList object's instance method
        arrList1.remove("John"); // can remove. call ArrayList object's instance method

        arrList2.set(1, "Happy"); // runtime error, java.lang.UnsupportedOperationException
        arrList2.add("Joe"); // java.lang.UnsupportedOperationException

        // List<> is the interface implemented by ArrayList.
        // ArrayList<> object in List<> type of reference pointer could call ArrayList<> methods by overriding

        List<String> list2 = new ArrayList<>(List.of("1234", "2345", "0000"));
        System.out.println(list2); // [1234, 2345, 0000]
        System.out.println(list2.size()); // 3
        System.out.println(list2.get(0)); // 1234
        System.out.println(list2.remove(0)); // 1234 is removed
        System.out.println(list2); // [2345, 0000]
        list2.add("777");
        System.out.println(list2); // [2345, 0000, 777]
        List<String> list3 = new ArrayList<>(List.of("2345", "0000"));
        System.out.println(list2.containsAll(list3)); // true



    }
}
