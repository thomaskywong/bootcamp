public class DataTypeDotDotDot {

  public static int sum(Integer... integers) {
    int sum = 0;
    for (Integer i : integers) {
      sum += i;
    }

    return sum;
  }

  public static int sum1(int... integers) {
    int sum = 0;
    for (int i : integers) {
      sum += i;
    }

    return sum;
  }

  public static int sum2(int[] integers) {
    int sum = 0;
    for (int i : integers) {
      sum += i;
    }

    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum2(new int[]{1, 2, 3, 4, 5}));
  }

}
