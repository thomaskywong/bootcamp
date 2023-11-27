import java.util.Arrays;

public class DemoStringArray {
  public static void main(String[] args) {
    
    String[] strings = new String[] {"abc", "ijk", "xyz"};

    String[] strings2 = new String[3];
    strings2[0] = "abc";
    strings2[1] = "ijk";
    strings2[2] = "xyz";

    System.out.println("Size of string array = " + strings2.length);
    System.out.println();

    // strings[0] = abcijk
    // strings[1] = ijkxyz
    // strings[2] = xyz!
    
    for (int i = 0; i < strings2.length; i++) {
        if (i < strings2.length-1) {
          strings[i] = strings2[i].concat(strings2[i+1]); 
        } else {
          strings[i] = strings2[i].concat("!");
        }
        System.out.println(strings[i]);
    }

     for (int i = 0; i < strings2.length; i++) {

        if (i == strings2.length-1) {
          strings[i] = strings2[i].concat("!");           
          System.out.println(strings[i]);
          continue;
        }

        strings[i] = strings2[i].concat(strings2[i+1]); 
//        System.out.println(strings[i]);

    }
    
    System.out.println( Arrays.toString(strings));





  }
}
