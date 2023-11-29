public class DemoWrapper {
    public static void main(String[] args) throws Exception {

        // Class of primitive
        // Data type -> class name
        // Int -> Integer
        // int value -> autobox

        Integer i2 = 10;                              // auto-box, 3 is int value -> autobox, Integer class object                                 // auto-unbox
        Integer i4 = new Integer(6);
        Integer i5 = Integer.valueOf(3);            // Shall use .valueOf()
        int i1 = 3;

        System.out.println(i4);         // 6
        System.out.println(i2);         // 10
        int result = i4.compareTo(i2);  // equals returns 0, greater than returns 1, less than return -1
        System.out.println(result);      
        int result2 = i2.compareTo(i4); // 
        System.out.println(result2);

        if (i2.compareTo(i4) == 0) { // i2 and i4 is Integer Class Object
            System.out.println("true");
        } else
            System.out.println("false");

        // DO NOT use operator on object!!!
        // if (i2 == i4) {                             // Do not use == to compare Integer class
        //     System.out.println("true");
        // } else {
        //     System.out.println("false");

        // }

        // double -> Double
        Double d1 = Double.valueOf(1.03);   // 
        Double d2 = 1.03;                   // autobox, BAD PRACTISE!!!
        Double d3 = new Double(1.03d);
        double d4 = 1.03;                   // primitive assignment. OK

        System.out.println("Double d2 = " + d1);

        Integer i6 = Integer.valueOf(15);                      
        Double d5 = Double.valueOf(i4);
        System.out.println("Integer -> Double: " + d5); 
        
        // Long

        // Long -> integer, downcast?, cannot do! how to fix
        // Long -> long can convert
        // Int -> int can convert

        Long l1 = Long.valueOf(10L);
        long l4 = l1;
        l4 = Long.valueOf(20L);
        l4 = (long) l1;                 // autobox
        System.out.println("long l4 = " + l4);
        
        // IMPORTANT: 
        // Long -> Integer
        Long l10 = Long.valueOf(10L); 
        Integer i10 = Integer.valueOf((int) (long) l10);
        System.out.println("Long -> Integer: " + i10);
        
        // Long -> int
        Long l11 = Long.valueOf(20L);
        int int1 = (int) (long) l11;
        System.out.println("Long -> int: " + int1); 
        
        // Integer -> Long
        Integer i11 = Integer.valueOf(21);
        Long L12 = Long.valueOf((long) (int) i11);
        System.out.println("Integer -> Long: " + i11);

        // Integer -> long
        Integer int4 = Integer.valueOf(40);
        long l12 = (long) (int) int4;
        System.out.println("Integer -> long: " + l12);


        // Character
        Character c1 = Character.valueOf('A');          // self-box, explicitly box
        Character c2 = 'A';                             // auto-box, NOT GOOD!
        Character c3 = new Character('A');
        char c4 = 'A';                                  // primitive assignment

        System.out.println("Character c1 = '" + c1 + "'");
        
        // Character -> char
        Character c5 = Character.valueOf('D');
        char c6 = (char) c5;
        System.out.println("Character -> char: "  + c5);
        
        // char -> Character
        char c7 = 'Z';
        Character c8 = Character.valueOf(c7);
        System.out.println("char -> Character: "+ c8);

        // boolean -> Boolean

        Boolean isOkay = true;
        Boolean isPassed = true;                    // autoBox
        Boolean isPassed2 = Boolean.valueOf(true);  // self-box
        Boolean isPassed3 = new Boolean(true);

        System.out.println("Boolean isPassed2 = " + isPassed2);

    }
}
