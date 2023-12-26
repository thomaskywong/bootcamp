public class DemoIntArray {
    public static void main(String[] args) {

        int[] arr = new int[] {2, 5, 7, 4};

        int sum = 0;

        for (int element : arr) {
            sum += element;
        }

        System.out.println(sum);

        // 2-dimension array

        int[][] array = new int[][] {{2, 4, 100}, {9, 2, 1000}, {90, 2, 10},
                {9, 100, 1000}};
        sum = 0;

        for (int[] row : array) {
            for (int col : row) {
                sum += col;
            }
        }

        System.out.println(sum);

        sum = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print("row = " + row + ", col = " + col + "\n");
                sum += array[row][col];
            }
        }

        System.out.println(sum); // 1117

        System.out.println(array[1][2]); // 1000
        System.out.println(array[0][1]); // 4
        System.out.println();


        sum = 0;

        int[][] array2 = new int[][] {{2, 4, 100}, {9, 2, 1000}, {90, 2, 10},
                {9, 100, 1000}};
        // sum up the elements with odd row index and even column index
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0){
                continue;
            }
            for (int j = 0; j < array2[i].length; j++) {
                if (j % 2 == 0)
                    sum += array2[i][j];
            }
        }

        System.out.println("sum = " + sum); // 2018



    }
}
