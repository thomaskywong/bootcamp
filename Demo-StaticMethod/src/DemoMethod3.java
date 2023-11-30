import java.util.Arrays;

public class DemoMethod3 {

  public static void main(String[] args) {
    
    int[] arr = new int[] {3, 5, 10};
    int[] arr2 = null;
    
    System.out.println(Arrays.toString(arr));
    System.out.println("sum = " + sum(arr));
    System.out.println();

    // Example of pass by reference
    System.out.println(Arrays.toString(arr));
    addOne(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();
    

    // Example of pass by value
    String str = "Thomas";
    System.out.println("str = " + str);

    String result = concatHello(str);
    System.out.println("str = " + str);
    System.out.println("result = " + result);
  }

  public static int sum(int[] arr) {

    if (arr == null) {
      System.out.println("Empty Array!");
      return 0;
    }

    int sum = 0;
    for (int i = 0; i < arr.length; i++) 
      sum += arr[i];
    
    return sum;
  }
  
  // Wrong Approach
  //   public static int[] addOne(int[] arr) {

  //   if (arr == null) {
  //     System.out.println("Empty Array!");
  //     return null;
  //   }

  //   for (int i = 0; i < arr.length; i++) 
  //     arr[i] += 1;
    
  //   return arr;
  // }
  
  // Pass by reference
  // Right approach, pass by reference
  public static void addOne(int[] arr) {

    if (arr == null) {
      System.out.println("Empty Array!");
      return;
    }

    for (int i = 0; i < arr.length; i++) 
      arr[i] += 1;
    
    return;
  }

  // Pass by value
  public static String concatHello(String s) {
    s = s.concat("hello");
    return s;
  }

  // Primitive + Wrapper Classes + String (17 type) -> pass by value
  // Array, object -> pass by reference

}
