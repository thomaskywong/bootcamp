public class DemoWhileLoop {
    public static void main(String[] args) throws Exception {
        // For loop example
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
        System.out.println();

        // while loop example
        int i = 0;
        sum = 0;
        while (i < 5) {
            sum += i;
            i++;
        }

        // System.out.println("sum = " + sum);

        // continue, break
        // 1, 3, 5 , 7 ,9
        int j = 0;
        while (j++ < 10) {

            if (j % 2 == 0)
                continue;

            System.out.print(j + " ");
        }
        System.out.println();

        // if j > 5 -> break
        // 1, 3, 5
        j = 0;
        while (j++ < 10) {

            if (j % 2 == 0)
                continue;
            if (j > 5)
                break;
            System.out.print(j + " ");
        }

        // 2 conditions checking
        // either x == 0 or y == 0 will break the while loop
        int x = 10;
        int y = 5;
        while (x > 0 && y > 0) {
            System.out.println("x = " + x + ", y = " + y);
            x--;
            y--;
        }
        System.out.println();
        System.out.println();

        // 1 1 2 3 5 8 13 ....< 1000
        sum = 0;
        int a1 = 1;
        int a2 = 0;

        while ((a1 + a2) < 1000) {
            sum = a1 + a2;
            a2 = a1;
            a1 = sum;
        }

        System.out.println("sum = " + sum);



    }
}
