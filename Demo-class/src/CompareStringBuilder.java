public class CompareStringBuilder {

  public static long stringConcat() {

    long start = System.currentTimeMillis();
    String s = "";
    for (int i = 0; i < 1_000_000; i++) {
      s = s.concat("a");                    // String method
    }
    long end = System.currentTimeMillis();

    return end - start;

  }

  public static long stringBuilderConcat() {

    long start = System.currentTimeMillis();
    StringBuilder s = new StringBuilder("");

    for (int i = 0; i < 1_000_000; i++) {
      s = s.append("a");                    // String method
    }
    long end = System.currentTimeMillis();

    return end - start;

  }

  public static void main(String[] args) {
    System.out.println(stringConcat());               // 55228
    System.out.println(stringBuilderConcat());        // 16
  }

}
