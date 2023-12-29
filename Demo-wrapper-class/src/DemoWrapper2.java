public class DemoWrapper2 {

  public static void main(String[] args) {

    // int -> Integer
    int i1 = 3;
    Integer i2 = 3; // auto box
    int i3 = i2; // auto un box

    Integer i4 = new Integer(5); // Constructor
    Integer i5 = Integer.valueOf(3); // static method

    int result = i4.compareTo(i2); // 5 > 3, return 1

    Double d1 = 1.8d;
    Double d2 = 1.9d;

    // For object, use method to compareTo
    if (d1.compareTo(d2) < 0) { // if d1 is less than d2

    } else if (d1.compareTo(d2) == 0) { // if d1 is equal to d2

    } else {
    }

    Integer i = 0;
    i++;
    System.out.println(i);

  }

}


