import java.util.Arrays;

public class Homework1 {

  // Count number from 1 to 100 (fixed range)
  // If the number is the multiple of 3, stores "i is the multiple of 3" in a String Array
  // If the number is the multiple of 5, stores "i is the multiple of 5" in a String array
  // If the number is the multiple of 3 and 5, store " i is the multiple of 3 and 5"
  // Show the String format of the actual numerical value in a String array

  public static void main(String[] args) {
    String[] result = new String[100];

    multipleOf(result);

    // neat way to show string array
    // use for each loop
    for (String element : result) 
      System.out.println(element);
  }


  public static void multipleOf(String[] result) {

    for (int i = 0; i < result.length; i++) {
      if ( (i + 1) % 5 == 0 && (i+ 1) % 3 == 0 ) {
        result[i] = String.valueOf(i+1) + " is the multiple of 3 and 5";
      } else if ( (i + 1) % 3 == 0 ) { 
        result[i] = String.valueOf(i+1) + " is the multiple of 3";
      } else if ( (i + 1) % 5 == 0) { 
        result[i] = String.valueOf(i+1) + " is the multiple of 5";
      } else {      
        result[i] = String.valueOf(i+1);
      }

    }

  }

}
