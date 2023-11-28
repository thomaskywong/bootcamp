import java.util.Arrays;

public class DemoCounting {

  // 
  public static void main(String[] args) {
    int[] numbers = new int[] {10, 2, 5, 5, 200, 2000, 2000, 5, 5,  2, 2};

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length -1; ++i){
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }

    int[] counter = new int[max + 1];

    for (int i = 0; i < numbers.length; i++){
      int index = numbers[i];
      counter[index]++;
    }

    int maxCount = Integer.MIN_VALUE;
    int maxCountNum = 0;
    for (int i = 0; i < counter.length; ++i){
      if (counter[i] > maxCount) {
        maxCount = counter[i];
        maxCountNum = i; 
      }
    }
    System.out.println("maxCountNum = " + maxCountNum + ", maxCount = " + maxCount);
    System.out.println();
    System.out.println();

    
    String str = "abcabcdpolxyzaazzzzz";
    // ASCII: 'a' = 97; 'z' = 123
    // assume only 'a' to 'z'
    int[] count = new int['z' - 'a' + 1];
    int ascii = 0;
    for (int i = 0; i < str.length(); ++i) {
      ascii = str.charAt(i);
      count[ascii-'a']++;
    }

    int maxCount2 = 0;
    int maxCountChar = 0;

    for (int i = 0; i < count.length; i++) {
      if (count[i] > maxCount2) {
        maxCount2 = count[i];
        maxCountChar = i + 'a';
      }  
    }

    System.out.print("maxCountChar = '" + (char) maxCountChar + "', " );
    System.out.println("maxCount = " + maxCount2);




  }
  
}
