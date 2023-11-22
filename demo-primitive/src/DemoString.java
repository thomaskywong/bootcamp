public class DemoString {
  public static void main(String[] args){
    String firstName;
    String lastName;
    String emailAddress;

    firstName = "Thomas";
    lastName = "Wong";
    emailAddress = "thomaskywong@yahoo.com";

    // System.out.println(firstName + " " + lastName);
    // System.out.println("Email: " + emailAddress);

    //String operation: concatentate 
    String fullName = "Mr. "+ firstName + " " + lastName;
    String emailStr = "Email: " + emailAddress;
    System.out.println(fullName); // "Mr. Thomas Wong"
    System.out.println(emailStr); // "thomaskywong@yahoo.com"

    // process operation inside "()" first, then proceed the method
    // Step 1: "Mr. " + lastName + " " + firstName -> "Mr.Wong Thomas"
    // Step 2: System.out.println() -> print out
    System.out.println("Mr. " + lastName + " " + firstName);

    String str1 = "hello";
    System.out.println(str1.length());          // length of the string object

    str1 = str1 + " world";                     // concatenation
    System.out.println(str1);                   // "hello world"
    str1 += " Thomas";                          // concatenation
    System.out.println(str1);   

    // +=, +  

    // String.equals()
    // String is not primitive type, cannot use == to compare the values
    String str3 = "Hello";
    String str4 = "Hello";
    String str5 = "hello";

    if (str3.equals(str4)) 
      System.out.println("str3 is equal to str4");
     
    

    System.out.println(str3.equals(str4));      // check if str3 matches with str4 (true)
    
    // Best Practise:
    // always use "string".equals(variable) to compare fix string with String variable
    System.out.println("hello".equals("str5"));   // check if str5 is "hello" (true)
    // never use variable.equals("string")
    // System.out.println(str5.equals("Hello"));   // Never put known string as argment of equals()

    System.out.println(str3.equals(str5));      // check if str3 matches with str5 (false)

    str1 = "Hello world";
    for (int i = 0; i < str1.length(); i++) {
      System.out.println("Index: " +i + ": " +str1.charAt(i));        
    }

    // Approach 1:
    int lastIndex = str1.length() -1;
    System.out.print("The last character is: ");
    System.out.println(str1.charAt(lastIndex));
    
    // Approach 2:
    System.out.println();
    System.out.println(str1);
    System.out.print("The last character is: ");
    System.out.println(str1.charAt(str1.length() - 1));

    

  }
}
