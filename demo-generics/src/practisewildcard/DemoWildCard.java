package practisewildcard;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class DemoWildCard {

  public static void displayName(List<? extends ParentClass> list) {
    // <? extends ParentClass> - used to get items using ParentClass method
    // ? cannot be casted to any class. Therefore can only accept "ParentClass"
    int size = list.size();
    for (int i = 0; i < size; i++) {
      // Can call parent's method only
      System.out.println(list.get(i).getName()); // ? extends ParentClass -> ParentClass and all ChildClass.
      // System.out.println(list.get(i).getName2()); // compilation error. cannot call Child class methods. since object can be ParentClass
      list.get(i).method();
    }

  }

  public static <T extends ParentClass> void displayName2(List<T> list) {

    int size = list.size();
    // Can call Parent's methods only!
    for (int i = 0; i < size; i++) {
      System.out.println(list.get(i).getName()); // can call parent class methods only
      list.get(i).method();
      // System.out.println(list.get(i).getName2()); // compilation error
    }

  }

  public static void callMethod(List<? super ChildClass> list) {

    int size = list.size();

    for (ParentClass p : list.toArray(new ParentClass[size])) {
      p.method();
      if (p instanceof ChildClass) {
        ChildClass p2 = (ChildClass) p;
        p2.method2();
      }
    }
  }


  public static void main(String[] args) {

    ParentClass p1 = new ParentClass();
    ParentClass p2 = new ParentClass();

    ChildClass c1 = new ChildClass();
    ChildClass c2 = new ChildClass();


    List<ParentClass> list1 = new ArrayList<>(List.of(p1, p2, c1, c2));
    List<ChildClass> list2 = new ArrayList<>(List.of(c1, c2));


    displayName(list1); // <T extends ParentClass> List<T> can accepts List<ParentClass> and List<ChildClass>
    System.out.println(); // can only call ParentClass method

    displayName(list2); // OK, List<? extends ParentClass> can accepts List<ParentClass> and List<ChildClass>
    System.out.println(); // can only call ParentClass method, or overriden ChildClass Method

    callMethod(list1); // List<? super ChildClass> can accepts List<ParentClass> and List<ChildClass>
    System.out.println();
    callMethod(list2);
    System.out.println();



  }

}
