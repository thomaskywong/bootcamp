public class DemoRecursion {
    public static void main(String[] args) {
        // 1 + 2 + 3 + 4 + 5
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);

        System.out.println("recursion sum=" + sum(5));

        int m = 19;
        System.out.println("recursion product=" + product(m));

        long product = 1L;
        if (m % 2 == 0) {
            for (int i = 2; i <= m; i = i + 2) {
                product *= i;
            }
        } else {
            for (int i = 1; i <= m; i = i + 2) {
                product *= i;
            }
        }
        System.out.println("product=" + product);


    }

    // recusion: given int n, n + (n-1) + (n-2) + (1);
    // step1: 5 + sum(4)
    // step2: 5 + 4 + sum(3)
    // step3: 5 + 4 + 3 + sum(2)
    // step4: 5 + 4 + 3 + 2 + sum(1)
    // step5: 5 + 4 + 3 + 2 + 1
    // step6: 5 + 4 + 3 + 3
    // step7: 5 + 4 + 6
    // step8: 5 + 10
    // step9: return 15
    public static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // given n,
    // if n is odd return n * (n-2) * (n-4) * ... * 1
    // if n is even return n * (n-2) * (n-4) * ... * 2
    public static long product(long n) {
        if (n <= 1) {
            return 1;
        }       
        if (n == 2) {
            return 2;
        }
        return n * product(n - 2);
    }
}
