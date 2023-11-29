import java.util.Arrays;

public class DemoForEachLoop {

  public static void main(String[] args) {
    
    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer integer : integers){
      System.out.println("integer = " + integer);
      integer = integer * -1;
      System.out.println("integer * -1 = " + integer);
      System.out.println();

    }
    System.out.println(Arrays.toString(integers));

    // System.out.println();
    // for (int j = 0; j < integers.length; j++) {
    //   System.out.println("integers[j] = " + integers[j]);
    // }

    System.out.println();

    String str = "abc,def,ijk,xyz";
    String[] arr = str.split(",");
    
    System.out.println(str);
    System.out.println(Arrays.toString(arr));
    for (String token : arr){
      System.out.println("token = " + token);
    }

  }
  
}
