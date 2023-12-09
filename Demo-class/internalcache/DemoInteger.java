// package Demo-class.internalcache;

public class DemoInteger {
  public static void main(String[] args) {

    Integer i1 = 127; // auto-box. 128 is int. Auto-box to Integer
    Integer i2 = new Integer(127);

    System.out.println(i1 == i2); // false. Since new object by "new"
    System.out.println(i1.equals(i2)); // true. same value
    System.out.println(i1.compareTo(i2) == 0); // true. same value
    System.out.println();

    Integer i3 = 127;
    System.out.println(i1 == i3); // true. same object in Integer cache. (-128 to 127)
    System.out.println(i1.equals(i2)); // true. same value
    System.out.println(i1.compareTo(i2) == 0); // true. same value
    System.out.println();

    Integer i6 = -128;
    Integer i7 = -128;
    System.out.println(i6 == i7); // true. within Integer cache range. (-128 to 127)
    System.out.println(i6.equals(i7)); // true. same value
    System.out.println(i6.compareTo(i7) == 0); // true. same value
    System.out.println();

    Integer i4 = 128;
    Integer i5 = 128;
    System.out.println(i4 == i5); // false. Out of Integer cache range. (-128 to 127)
    System.out.println(i4.equals(i5)); // true. same value
    System.out.println(i4.compareTo(i5) == 0); // true. same value
    System.out.println();



    // Same cache range for Byte, Short and Long
    Byte b1 = 127;
    Byte b2 = new Byte((byte) 127);
    System.out.println("new Byte():");
    System.out.println(b1 == b2); // false. Since new object by "new"
    System.out.println(b1.equals(b2)); // true. same value
    System.out.println(b1.compareTo(b2) == 0); // true. same value
    System.out.println();
    
    Byte b21 = Byte.valueOf((byte)127);
    System.out.println(b1 == b21); // true. Since .valueOf check in Byte cache 
    System.out.println(b1.equals(b21)); // true. same value
    System.out.println(b1.compareTo(b21) == 0); // true. same value
    System.out.println(); 

    Byte b3 = (byte) 127;
    System.out.println(b1 == b3); // true. same object in Byte cache. (-128 to 127)
    System.out.println(b1.equals(b2)); // true. same value
    System.out.println(b1.compareTo(b2) == 0); // true. same value
    System.out.println();

    Byte b6 = (byte) -128;
    Byte b7 = (byte) -128;
    System.out.println(b6 == b7); // true. within Byte cache range. (-128 to 127)
    System.out.println(b6.equals(b7)); // true. same value
    System.out.println(b6.compareTo(b7) == 0); // true. same value
    System.out.println();
    
    Boolean n1 = true;
    Boolean n2 = true;
    System.out.println("Boolean cache");
    System.out.println(n1 == n2); // true. within Boolean cache range. (true or false)
    System.out.println(n1.equals(n2)); // true. same value
    System.out.println(n1.compareTo(n2) == 0); // true. same value
    System.out.println();

    Boolean n3 = new Boolean(false);
    Boolean n4 = false;
    System.out.println("new Boolean");
    System.out.println(n3 == n4); // false. new object
    System.out.println(n3.equals(n4)); // true. same value
    System.out.println(n3.compareTo(n4) == 0); // true. same value
    System.out.println();

    Character c1 = (char) 127;
    Character c2 = (char) 127;
    System.out.println(c1);
    System.out.println(c2);
    System.out.println("Character cache");
    System.out.println(c1 == c2); // false. new object
    System.out.println(c1.equals(c2)); // true. same value
    System.out.println(c1.compareTo(c2) == 0); // true. same value
    System.out.println();   
 
    Float f1 = 127f;
    Float f2 = 127f;
    System.out.println("Float and Double does not have internal cache");
    System.out.println(f1 == f2); // false. new object
    System.out.println(f1.equals(f2)); // true. same value
    System.out.println(f1.compareTo(f2) == 0); // true. same value
    System.out.println();  

  }

}
