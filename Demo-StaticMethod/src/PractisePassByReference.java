import java.util.Arrays;

public class PractisePassByReference {

  public static void main(String[] args) {
    String[] names = new String[] {"Chan", "Wong", "Lee", "Ng", "Au Yang",
        "Wang", "Ho", "Chueng"};
    int arraySize = names.length;

    // System.out.println(arraySize);

    nameSort(names);
    System.out.println(Arrays.toString(names));

  }


  public static void nameSort(String[] names) {
    int minIndex;
    String min = null;

    for (int i = 0; i < names.length - 1; i++) {
      minIndex = i;
      min = names[i];
      for (int j = 0; j < names.length - i - 1; j++) {
        if (names[j + i + 1].compareTo(min) < 0) {
          minIndex = j + i + 1;
          min = names[j + i + 1];
        }
      }
      String temp = names[i];
      names[i] = names[minIndex];
      names[minIndex] = temp;
    }
    return;
  }

}
