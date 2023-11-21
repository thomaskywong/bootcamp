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
    System.out.println(str1.equals("hello"));   // check if str1 is "hello"
    str1 = str1 + " world";                     // concatenation
    System.out.println(str1);                   // "hello world"
    str1 += " Thomas";                          // concatenation
    System.out.println(str1);   

    // +=, +  

  }
}
