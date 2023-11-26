public class PractiseArrayDeclare {

  public static void main(String[] args) {
    // boolean array
    System.out.println("boolean array:");
    int len = 10;
    boolean[] booleanArray1 = new boolean[len];
    for (int i = 0; i < booleanArray1.length; i++) {
      System.out.print(booleanArray1[i] + " ");
    }
    System.out.println();

    boolean[] booleanArray2 =
        new boolean[] {true, false, true, true, false, true, false};
    for (int i = 0; i < booleanArray2.length; i++) {
      System.out.print(booleanArray2[i] + " ");
    }
    System.out.println();
    System.out.println();

    // byte array
    System.out.println("Byte Array:");
    byte[] byteArray1 = new byte[len];
    for (int i = 0; i < byteArray1.length; i++) {
      System.out.print(byteArray1[i] + " ");
    }
    System.out.println();

    byte[] byteArray2 = new byte[] {0, 1, 2, 10, -10, -128, 127};
    for (int i = 0; i < byteArray2.length; i++) {
      System.out.print(byteArray2[i] + " ");
    }
    System.out.println();
    System.out.println();

    // short array
    System.out.println("short array:");
    short[] shortArray1 = new short[len];
    for (int i = 0; i < shortArray1.length; i++) {
      System.out.print(shortArray1[i] + " ");
    }
    System.out.println();
    System.out.println();

    // int array
    System.out.println("int array:");
    int[] intArray1 = new int[len];
    for (int i = 0; i < intArray1.length; i++) {
      System.out.print(intArray1[i] + " ");
    }
    System.out.println();

    int[] intArray2 = new int[] {0, 1, -2, 3, -4, -5, -6};
    for (int i = 0; i < intArray2.length; i++) {
      System.out.print(intArray2[i] + " ");
    }

    System.out.println();
    System.out.println();

    // long array
    System.out.println("long array:");
    long[] longArray1 = new long[len];
    for (int i = 0; i < longArray1.length; i++) {
      System.out.print(longArray1[i] + " ");
    }
    System.out.println();

    long[] longArray2 = new long[] {0L, -2L, 4L, -6L, 8, -10};
    for (int i = 0; i < longArray2.length; i++) {
      System.out.print(longArray2[i] + " ");
    }

    System.out.println();
    System.out.println();

    // float array
    System.out.println("float array:");
    float[] floatArray1 = new float[len];
    for (int i = 0; i < floatArray1.length; i++) {
      System.out.print(floatArray1[i] + " ");
    }
    System.out.println();

    float[] floatArray2 =
        new float[] {0.0f, -0.1f, 3.5f, -100.5f, 2.55f, 3.232f};
    for (int i = 0; i < floatArray2.length; i++) {
      System.out.print(floatArray2[i] + " ");
    }
    System.out.println();
    System.out.println();

    // double array
    System.out.println("double array:");
    double[] doubleArray1 = new double[len];
    for (int i = 0; i < doubleArray1.length; i++) {
      System.out.print(doubleArray1[i] + " ");
    }
    System.out.println();
    
    double[] doubleArray2 =
        new double[] {0.0, -10.1, 23.5, -3100.5, 42.55, 53.232};
    for (int i = 0; i < doubleArray2.length; i++) {
      System.out.print(doubleArray2[i] + " ");
    }
    System.out.println();
    System.out.println();

    // char array
    System.out.println("char array:");
    char[] charArray1 = new char[len];
    for (int i = 0; i < charArray1.length; i++) {
      System.out.print(charArray1[i] + " ");
    }
    System.out.println();

    char[] charArray2 = new char[] {'a', '@', '3', ' ', '_', 'C'};
    for (int i = 0; i < charArray2.length; ++i) {
      System.out.print(charArray2[i] + " ");
    }
    System.out.println();
    System.out.println();

    // String array
    System.out.println("String array:");
    String[] stringArray1 = new String[len];
    for (int i = 0; i < stringArray1.length; i++) {
      System.out.print(stringArray1[i] + " ");
    }
    System.out.println();
    System.out.println();

    String[] stringArray2 = new String[] {"Apple", "Orange", "Strawberry", "Grape", "Bananna", "Mango"};
    for (int i = 0; i < stringArray2.length; ++i) {
      System.out.print(stringArray2[i] + " ");
    }
    System.out.println();
    System.out.println();

    for (int i = 0; i < stringArray2.length; ++i) {
      stringArray1[i] = stringArray2[i];
    }
    for (int i = 0; i < stringArray1.length; i++) {       
      System.out.print(stringArray1[i] + " ");
    }

  }
}
