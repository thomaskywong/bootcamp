package exception;
public class DemoCheckedException {
    public static void main(String[] args)  {
        
        // the most popular runtime exceptions

        // String s = null;
        // s.length(); // java.lang.NullPointerException

        int x = 0;
        // clarify with client once x = 0; what to do
        double average = 100/x; // java.lang.ArithmeticException

        // Object s2 = "hello";
        // Double result = (Double) s2; // java.lang.ClassCastException

        // int[] arr = new int[3];
        // System.out.println(arr[3]);     // java.lang.ArrayIndexOutOfBoundsException

    }
}
