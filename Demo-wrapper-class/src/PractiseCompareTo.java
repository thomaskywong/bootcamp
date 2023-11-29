public class PractiseCompareTo {


  public static void main(String[] args) {
    
    Character c1 = Character.valueOf('A');
    Character c2 = Character.valueOf('Z');

    System.out.println(c1.compareTo(c2));     // returns -1? returns -25
    System.out.println(c2.compareTo(c1));     // returns 25
    System.out.println(c1.compareTo(c1));     // returns 0
    System.out.println();


    Long l1 = Long.valueOf(21L);
    Long l2 = Long.valueOf(-10L);
    
    System.out.println(l1.compareTo(l2));     // returns 31? returns 1
    System.out.println(l2.compareTo(l1));     // returns -1
    System.out.println(l1.compareTo(l1));     // returns 0
    System.out.println();

    Double d1 = Double.valueOf(10.9d);
    Double d2 = Double.valueOf(-23.4d);
    
    System.out.println(d1.compareTo(d2));     // returns 31? returns 1
    System.out.println(d2.compareTo(d1));     // returns -1
    System.out.println(d1.compareTo(d1));     // returns 0
    System.out.println();

     
    

  }
  
}
