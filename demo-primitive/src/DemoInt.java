public class DemoInt {
    public static void main(String[] args)  {

        // System.out.println(2);
        // System.out.println(2.3);
        // System.out.println("hello");

        // variable: i, year
        // declare i as integer
        // assign value 2 to the variable i
         int i = 2;

        // declare variable
        int level;      // declare
        level = 10;     // assign value
        System.out.println(level);

        level = 20;     // reassign value
        System.out.println(level);

        int dayOfMonth = 21;
        int monthOfYear = 11;
        int year = 2023;
        System.out.println(dayOfMonth +"//"+monthOfYear+"//"+year);
        
        int hour;
        hour = 12;
        int minute;
        minute = 28;
        System.out.println(hour + ":" + minute);
        level = 10;
        
        // Step 1: 10 + 3
        // Step 2: 13 -> level
        level = level + 3;  // level = 13

        level += 3;         // level = level + 3 (=16)
        System.out.println(level);
        level -= 7;         // level = level - 7 (=9)
        System.out.println(level);
        level *= 2;         // level = level * 2 (=18)
        System.out.println(level);
        level /= 5;         // level = level / 5 (=3)
        System.out.println(level);      // 18 / 5 = 3.6 -> 3  (REMARK!!! takes the integer value only)

        // primitive types
        // byte(8 bits), short (16 bits), int(32 bits), long (64 bits)
        // byte (-128 ~ 127), short (-32768 ~ 32767), int (-2.14E9 ~ 2.14E9), long (-9E18 ~ 9E18) 
        // byte i = 128 // is out of range
        // System.out.println(Math.pow(2,64)/2);

        // Long integer, use "L" at the end to indicate long integer
        long num = 9_000_000_000_000_000_000L;      // use notation L to indicate the number is long
        System.out.println(num);

        int i5 = 100;   //  by default the type of any integer number is int
        byte b6 = 100;  //  Java implicitly downcast or convert from int -> byte. ie. (byte) 100
        short s7 = 100; //  Java implicitly downcast or convert from int -> short ie. (short) 100

        long l1 = -1_000_000_000L;
        l1 += 10L;
        System.out.println(l1);              
        l1 += 10;
        System.out.println(l1);

        // int num2 = (int) l1;  // l1 is long, cannot downcast from long to int
        // System.out.println(num2);

        int result;
        int k = 10;
        System.out.println("int k = 10: " + k);     // k = 10

        result = k--;        // k-1
        System.out.println("k--: " + result);        // show k first, then k = k-1, = 10

        result = --k;        // k-1
        System.out.println("--k: " + result);        // k = k-1 first, then show k, = 8

        result = k++;        // k++        
        System.out.println("k++: " + result);        // show k first, then k = k + 1,  = 8

        result = ++k;        // k+1                 // k = k + 1 first, then show k,  = 10
        System.out.println("++k: " + result);

        int m = 17 % 3;     // 10 modulus 3 = remainder of 10 / 3 = 1
        System.out.println(m);

        int result2 = (5 + 3) / 2 % 3;      //   8 / 2 % 3 = 1
        System.out.println(result2);

        int result3 = 5 + 3 / 2 % 3;      //    5 + 1 % 3 = 6
        System.out.println(result3);

        int result4 = 10;                    // result4 = 10
        result4 *= 2;                        // result4 = result4 * 2 = 20
        System.out.println(result4);
        result4 /= 4;                        // result4 =result4 / 4 = 5
        System.out.println(result4);
        result4 += 2;                        // result4 = result4 + 2 = 7
        System.out.println(result4);
        result4 -= 4;                        // result4 =result4 - 4 = 3
        System.out.println(result4);
    }
}
