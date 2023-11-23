public class DemoForLoop {
    public static void main(String[] args) {
        /*
         * int x = 2; // 2 x 2 x 2 (multiply 2 for multiple times)
         * 
         * // for (counter initialization; counter's continue condition; counter's movement) {} // step 1: initialize counter i = 0 // step 2: check if counter's condition is true // step 3: implment codes
         * inside the for loop block // 3.1: x *= 2 // 3.2: printline the x value // step 4: implement counter's moverment, i++ // step 5: go to step 2, upto the counter's condition is false // step 6: once
         * the counter's condition is false, jump out from for-loop
         * 
         * // Step 1: int i = 0; // Step 2: i < 4 ? i is 0 // Step 3: yes -> x*=2 (=4) // Step 4: sysout // Step 5: i++ // Step 6: i < 4 ? i is 1 // step 7: yes -> x*=2 (=8) // step 8: sysout // step 9: i++
         * // step 10: i < 4 ? i is 2 // step 11: yes -> x*=2 (=8) // step 12: sysout // step 13: i++ // step 14: i < 4 ? i is 3 // step 15: yes -> x*= (=16) // step 16: sysout // step 17: i++ // step 18: i <
         * 4 ? i is 4 // step 19: exit from loop
         * 
         * for (int i = 0; i < 4; i++) { // i value within for-loop 0,1,2,3
         * 
         * x *= 2; System.out.print("i = " + i); System.out.println("; x = " + x); System.out.println();
         * 
         * }
         * 
         * // For loop: 0 + 1 + 2 + 3 + 4 ... + 10 -> total ( "0 to 10" has 11 elements) int total = 0; for (int j = 0; j < 11; j++) { total = total + j; System.out.println("j = " + j + "; total = " + total);
         * // total ends up 55 }
         * 
         * System.out.println(); System.out.println(); total = 0; // For loop: 0 + 2 + 4 + 6 + 8 + 10 -> total ( "0 to 10 even number") for (int k = 0; k < 11; k++) { // k < 11 includes 10 if (k % 2 == 0) {
         * total += k; System.out.println("k = " + k + "; total = " + total); // 30 } } System.out.println(
         * 
         * ); total = 0; // add from 1 to 100 for (int n = 0; n < 100; n++) { total += (n + 1); System.out.println("total = " + total); }
         */

        // Example 4
        // 0 - 100
        // i) 0 - 50, sum1 = sum of odd number
        // ii) 51 - 100 sum2 = sum of even number
        // total - sum1 *sum2
        int sum1 = 0;
        int sum2 = 0;
        int total = 0;
        for (int a = 0; a < 101; a++) {
            if (a <= 50 && a % 2 == 1) { // a = 0 - 50 and a is odd numeber
                sum1 += a;
                System.out.println("a = " + a + "; sum1 = " + sum1);
            } else if (a > 50 && a % 2 == 0) {
                sum2 += a;
                System.out.println("a = " + a + "; sum2 = " + sum2);
            }

        }
        total = sum1 * sum2;
        System.out.println(
                "sum1 = " + sum1 + "; sum2 = " + sum2 + "; total = " + total);
        System.out.println();
        sum1 = 0;
        sum2 = 0;
        total = 0;
        for (int a = 0; a < 101; a++) {
            if (a <= 50) { // a = 0 - 50, sum up all odd numeber
                if (a % 2 == 0)
                    continue;
                sum1 += a;
                System.out.println("a = " + a + "; sum1 = " + sum1);
            } else if (a > 50) { // a = 51 - 100, sum up all even number
                if (a % 2 == 1)
                    continue;
                sum2 += a;
                System.out.println("a = " + a + "; sum2 = " + sum2);
            }

        }

        total = sum1 * sum2;
        System.out.println(
                "sum1 = " + sum1 + "; sum2 = " + sum2 + "; total = " + total);



        // continue
        // sum up all odd number (0 - 100)
        System.out.println();
        int sum = 0;
        for (int i = 0; i < 101; i++) { // i = 0, 1, 2... 100
            if (i % 2 == 0)
                continue; // go to next iternation if even number
            sum += i; // BEST PRACTISE, see what is being implemented if not skipped
                      // execute this implementation if odd number or (i%2==0) is false
            System.out.println("i = " + i + "; sum = " + sum);
        }
        System.out.println("sum = " + sum);

        System.out.println();
        // break
        // exit from loop if the condition is fulfilled
        // 1. sum up all odd number (0-100)
        // 2. sum <= 200
        // show the sum
        // !!! must review !!!
        int sum3 = 0;
        int count = 0;
        for (int i = 0; i < 201; i++) {
            // sum3 += i // cannot put summation action here, since sum3 + i may exceeds 200 before checking condition!
            if (i%2 == 0)           // skip all even number
                continue;
            if (sum3 + i <= 200) {
                sum3 += i;
                count = i;
            } else 
                break;
            
            System.out.println("i = " + i + "; sum3 = " + sum3);
        }
        System.out.println("Final value: i = " + count + " sum3 = " + sum3);
        System.out.println();

    }
}
