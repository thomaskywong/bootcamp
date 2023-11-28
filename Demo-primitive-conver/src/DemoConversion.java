public class DemoConversion {
    public static void main(String[] args) {
        
        // Upcasting
        // byte -> short -> int -> long
        // Java is strong type
        // NO PRECISION LOSS
        byte i1 = 2;
        short s1 = i1;   // OK, upcast, NO PRECISION LOSS
        int k1 = s1;    // OK, upcast, NO PRECISION LOSS
        int k2 = i1;     // OK, upcast, NO PRECISION LOSS
        long l1 = k1;   // OK, upcast, NO PRECISION LOSS
        
        // Downcasting
        // long -> int -> short -> byte
        // POTENTIAL PRECISION LOSS!!
        long l2 = 4L;
        l2 = 40_000;                        // implicit upcast int -> long
        short s2 = (short) l2;              // downcast, precision loss occur

        System.out.println("s2 = " + s2);   // overflow occurs

        short s3 = 130;
        byte b2 = (byte) s3;                // overflow = - -126
        System.out.println(b2);             // 127 -> -128 -> -127 -> -126

        int i2 = 130;
        short s4 = (short) i2;              // explicit downcast
        System.out.println(s4);             // potential precision loss

        byte b3 = 127;                      // within range, int -> byte downcast

        float f1 = (float) 1.3d;            // double -> float, downcast,explicit downcast
        double d1 = 5.2f;                   // upcast, implicit upcast

        float f2 = 3.5f;
        long l3 = (long) f2;                // downcast

        float f3 = 10L;                     // upcast OK

        // char -> int, upcast
        int i3 = 'a';                        // char -> int upcast

        int i4 = 65610;                     // 65610 - 65535
        char c3 = (char) i4;                // int -> char downcast, may cause precision loss

        int diff = 65610 - 65535;
        System.out.println("65610 - 65535 = " + diff);
        System.out.println("c3 (int) = " + (int) c3);
        System.out.println("c3 (char) = " + c3);
    }
}
