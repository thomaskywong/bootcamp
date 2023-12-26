import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        ArrayList<String> strings2 = new ArrayList<>();
        // .add(index, object) add or insert element at given index. the size of arraylist shall includes the given index
        // index has to be in order, or indexOutOfBoundsException
        System.out.println(".add(index, E element)");
        strings2.add(0, "Elizabeth");
        strings2.add(1, "Trevor");
        strings2.add(2, "Emily");
        // strings2.add(4, "Thomas"); // cannot jump index
        for (int i = 0; i < strings2.size(); i++) {
            System.out.println(strings2.get(i));
        }
        System.out.println();

        // .add(Object) add element into ArrayList
        System.out.println(".add(E element)");
        strings.add("ABC");
        strings.add("IJK");
        strings.add("XYZ");
        System.out.println(strings); // [ABC, IJK, XYZ]
        System.out.println();

        // .add(index, Object) add or insert element at given index in ArrayList
        System.out.println(".add(index, element)");
        strings.add(1, "OOO");
        System.out.println(strings); // [ABC, OOO, IJK, XYZ]
        System.out.println();

        // .remove(Object) remove the given object from ArrayList at any given index
        // Arraylist will be resized.
        // return true if success. return false if not found
        System.out.println(".remove(Object object)");
        System.out.println(strings.remove("IJK")); // true
        System.out.println(strings.remove("abc")); // false
        System.out.println(strings.remove(3.0f)); // false. will not throw exception if type not match!
        System.out.println(strings); // [ABC, OOO, XYZ]
        System.out.println("Size : " + strings.size());
        System.out.println();

        // .remove(index) remove the object from the given index of ArrayList. Compilation error if index out of bound
        System.out.println(".remove(Index index)");
        strings.remove(1);
        // strings.remove(4); // out of bound. throw exception. runtime error
        System.out.println(strings); // [ABC, XYZ]
        System.out.println();

        // .get(index) return object of ArrayList from given index. runtime error if out of bound
        System.out.println(".get(index)");
        System.out.println(strings.get(1)); // XYZ
        // System.out.println(strings.get(2)); // out of bound. throw exception
        System.out.println();

        // .set(index, Object) reassign element at given index of ArrayList
        // runtime error or throw exception of out of bound
        System.out.println(".set(index, object)");
        strings.set(1, "FGH");
        // strings.set(2, "SSS"); // throw exception if out of bound
        System.out.println(strings); // [ABC, FGH]
        System.out.println();


        // for each loop to iterate each element of ArrayList
        System.out.println(
                "for each loop to iterate each element in given type of ArrayList");
        for (String s : strings) {
            System.out.println(s); // ABC FGH
        }
        System.out.println();


        // List.of("xxx", "yyy", ... ) provide an immutable list of objects. Used to initialze the ArrayList
        System.out.println("List.of(xxx,yyy,zzz)");
        ArrayList<String> newElements =
                new ArrayList<>(List.of("YUI", "789", "hjk", "+_)"));
        System.out.println();

        // .addAll(List Object) append the list object into the end of ArrayList
        System.out.println(".addAll(List)");
        strings.addAll(newElements);
        System.out.println(strings); // [ABC, FGH, YUI, 789, hjk, +_)]
        System.out.println();

        // .size() return the size of the current ArrayList length
        System.out.println(".size()");
        System.out.println(strings.size()); // 6
        System.out.println();

        // .isEmpty() return true if the ArrayList is empty. return false if not empty
        // use to peek if empty before .get(0) or .remove(0)
        System.out.println(strings.isEmpty()); // false
        System.out.println();


        // .indexOf(Object) return the index value of ArrayList that contains the given Object. return -1 if not found
        System.out.println(".indexOf(object), return index of occurance or -1");
        System.out.println(strings.indexOf("hjk")); // 4
        System.out.println(strings.indexOf(3.0f)); // -1
        System.out.println();

        strings.add("789");
        // .lastIndexOf(Object) return the last occurance index value of ArrayList that contains the given Objects. return -1 if not found
        System.out.println(".lastIndexOf(Object)");
        System.out.println(strings.lastIndexOf("789")); // 6
        System.out.println(strings.lastIndexOf("erf")); // -1
        System.out.println();

        // .contains(Object) check if the given Object is in ArrayList. return true if found. return false if not found
        System.out.println(".contains(Object)");
        System.out.println(strings.contains("789")); // true
        System.out.println(strings.contains("erf")); // false
        System.out.println();

        System.out.println(strings); // [ABC, FGH, YUI, 789, hjk, +_), 789]
        // .containsAll(List) check if all elements in List is contains in ArrayList
        System.out.println(".containsAll(List)");
        ArrayList<String> list01 = new ArrayList<>(List.of("ABC", "YUI"));
        ArrayList<String> list02 = new ArrayList<>(List.of("ABC", "DEF"));
        System.out.println(strings.containsAll(list01)); // true
        System.out.println(strings.containsAll(list02)); // true
        System.out.println();


        System.out.println("ArrayList can be printed out like string without calling special methods");
        System.out.println("System.out.println(ArrayList al)");
        System.out.println(strings); // .toString() is overriden by ArrayList class. [ABC, FGH, YUI, 789, hjk, +_), 789]
        System.out.println();

        // subList( start index (inclusive), end index (exclusive)). 
        // Object the new ArraysList from start index up to end index - 1 (exclusive)
        // Save object reference by interface type of reference List<>
        System.out.println(".subList(start index, end index). Store return object in List<> pointer");
        List<String> string2 = strings.subList(1, 5); // from index 1 to index 4
        System.out.println(string2); // [FGH, YUI, 789, hjk] !!! exclude index 5!!!

        ArrayList<String> anotherList =
                new ArrayList<>(List.of("1234", "2345", "0000"));
        // .addAll( List ) add all element in List into the end of the ArrayList
        System.out.println(".addAll(List)");
        strings.addAll(anotherList);
        System.out.println(strings); // [ABC, FGH, YUI, 789, hjk, +_), 789, 1234, 2345, 0000]
        System.out.println();

        // .addAll(index, List) insert all element in List at the index of the ArrayList
        System.out.println(".addAll(index, List)");
        strings.addAll(1, anotherList);
        System.out.println(strings); // [ABC, 1234, 2345, 0000, FGH, YUI, 789, hjk, +_), 789, 1234, 2345, 0000]
        System.out.println();

        // .removeAll(List) remove all elements contains in List from the ArrayList
        System.out.println(".removeAll(List)");
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

        // arrList2.set(1, "Happy"); // runtime error, java.lang.UnsupportedOperationException
        // arrList2.add("Joe"); // java.lang.UnsupportedOperationException

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
