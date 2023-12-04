public class DemoMath {

  public static void main(String[] args) {
    // pow(a,b) -> a ^ b, return double

    System.out.println(Math.pow(2.0, 10)); // 1024
    System.out.println(Math.pow(2.0, -1)); // 0.5
    System.out.println(Math.pow(2.0, -2)); // 0.25
    System.out.println(Math.pow(-2.0, 3)); // -8.0

    // abs(a) -> absolute value of a
    System.out.println(Math.abs(-3.2)); // 3.2
    System.out.println(Math.abs(3.2)); // 3.2

    // ceil(a) -> ceiling of a
    System.out.println(Math.ceil(3.33)); // 4.0

    // floor(a) -> floor of a
    System.out.println(Math.floor(3.33)); // 3.0

    // round(a) -> rounding to closest long
    System.out.println(Math.round(4.499999)); // 4
    System.out.println(Math.round(4.500000)); // 5

    int[] arr = new int[] {-2, 20, 100, -40};

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Max = " + max);

    // .max(a, b)  -> return highest value between a and b
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }

    System.out.println("Max = " + max);

    // .min(a, b)  -> return highest value between a and b
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      min = Math.min(min, arr[i]);
    }

    System.out.println("Min = " + min);

    // sqrt(a)  -> square root of a
    System.out.println(Math.sqrt(81));      // 9     
    System.out.println(Math.sqrt(-81));     // 9 i

    // double d1 = Math.sqrt(-81);
    // if (Double.isNaN(d1))
    //   System.out.println("Imaginary number.");

    double num = -81;
    if (num < 0) {
      System.out.println(Math.sqrt(Math.abs(num)) + "i");
    }


    // random number from 1 - 10
    int random2 = (int) (Math.random() * 10 + 1);
    System.out.println(random2);

    int y = 7;
    y += 3.5;               // 3.5 -> 3, y =  y + 3 -> 10
    System.out.println(y);
    y = (int) (y + 3.5);    // cannot do auto down cast     


  }


}
