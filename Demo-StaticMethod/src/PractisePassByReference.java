import java.util.Arrays;

public class PractisePassByReference {

  public static void main(String[] args) {
    String[] names = new String[] {"Chan", "Wong", "Lee", "Ng", "Au Yang", "Wang", "Ho", "Chueng"};
    int arraySize = names.length;

    // System.out.println(arraySize);

    nameSort(names);
    System.out.println(Arrays.toString(names));

  }


  public static void nameSort(String[] names) {
    int minIndex = 0;
    String min = names[minIndex];

    for (int i = 0; i < names.length - 1; i++) {
      for (int j = 0; j < names.length - i - 1; j++) {
        if (names[j + i + 1].compareTo(names[i]) < 0) {
          minIndex = j + i + 1;
          String temp = names[i];
          names[i] = names[minIndex];
          names[minIndex] = temp;
        }

      }
    }
    return;
  }
  
}
