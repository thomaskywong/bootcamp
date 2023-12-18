package topmostclass;

public class ClassType {

  public static void main(String[] args) {

    Integer i1 = Integer.valueOf(2);
    Number n1 = i1;

    // .getClass() obtain the name of Class
    System.out.println(i1.getClass()); // class java.lang.Integer

    // Class<?> pointer type that store the type of Class reference
    Class<?> classType = i1.getClass();
    System.out.println(classType.getName()); // java.lang.Integer

    Class<?> classType2 = n1.getClass();
    System.out.println(classType2.getName()); // class java.lang.Integer

    System.out.println(i1 instanceof Integer); // true
    System.out.println(n1.getClass().equals(i1.getClass()));

    Class<?> type1 = i1.getClass();
    Class<?> type2 = n1.getClass();
    System.out.println(type1.getName());
    System.out.println(type2.getName());

    if (type1.getName().equals(type2.getName())) {
      System.out.println("They are the same class objects");
    }

    if (i1.getClass().getName().equals(n1.getClass().getName())) {
      System.out.println("They are the same class objects (2)");
    }

    if (i1 instanceof Integer) {
      System.out.println("They are the same class objects (3)");

    }

    System.out.println(i1.getClass().getName());


  }

}
