public class DemoIntArray {
    public static void main(String[] args) {
        // integer array
        int x1 = 1;
        int x2 = 7;
        int x3 = 12;

        // define an array (container) to store a list of int number
        // This array (container) can only store in number
        int[] array = new int[3];
        // assignment. assign a value to the specific space
        array[0] = x1;
        array[1] = x2;
        array[2] = x3;

        for (int i = 0; i < 3; ++i)
            System.out.print(array[i] + " ");
        System.out.println();

        int length = 10;
        int[] array2 = new int[length];

        for (int i = 0; i < length - 2; i++) {
            array2[i] = 2 * i;
        }

        System.out.print("{ ");
        for (int i = 0; i < length; i++) {
            System.out.print(array2[i]);
            if (i < length - 1)
                System.out.print(", ");
        }
        System.out.print(" }");
        System.out.println();

        try {
            array2[length] = 10;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of array range");
        }

        int a; // local variable must be either initialized or assigned with value before using.
        a = 1;
        System.out.println(a);

        // when array is used, default value is automatically assigned to empty array without assignment or initialization

        int[] array3 = new int[5];
        int[] array4 = new int[] {1, -3, 5, -7 , 9};
        int[] array5 = new int[5];

        // invalid assignment. can only assign value into each element of array
        //array5 = {1, 2, 3, 4, 5};

        // valid assignment to each element of array

        // double type array
        double [] array6 = new double[] {1d, 2d, 3, 4.5, 100_000};
        
        // use array.length to check the length
        System.out.println("array length: " + array.length);

        // array supports for loop
        System.out.print("Array 4: ");
        for (int element : array4)
            System.out.print(element + " ");

        System.out.println();
        int[] temp = array4;                            // temporary store array
        array4 = new int[20];                           // allocate new storage with new size
        
        System.out.println("new size of array4: " + array4.length);
        for (int i = 0; i < temp.length; i++){          // copy each element of temporary to new array
            array4[i] = temp[i];
        }

        System.out.print("new array4 :");
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }
    }
}
