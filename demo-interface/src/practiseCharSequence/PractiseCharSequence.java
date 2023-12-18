package practiseCharSequence;

public class PractiseCharSequence{

  public static void main(String[] args) {
    
    StringBuilder str = new StringBuilder("This is Thomas.");

    str.append("Nice to meet you!");  // method of StringBuilder
    System.out.println(str.toString()); // method of toString() Override interface
    
    // Up cast 
    CharSequence str2 = str;      // wrap String pointer into CharSquence

    String string1 = str2.toString();  // Override interface method .toString()
    char char1 = str2.charAt(0);// Override interface method .charAt()
    CharSequence charS1 = str2.subSequence(0, 15); // Override interface method .subSequence( , )
    int length1 = str.length();   // Override interface method .length()
    
    System.out.println(string1);  
    System.out.println(char1); 
    System.out.println(charS1); 
    System.out.println(length1);   



    
  }

}