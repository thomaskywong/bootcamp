
public class PractiseStringMethod {

  public static void main(String[] args) {
    
    String str1 = "Hello";
    String str2 = " World!";
    // concatenation
    System.out.println(" '+' concatenate operator");
    System.out.println("str1 = \""+ str1 + "\"" );
    System.out.println("str2 = \""+ str2 + "\"" );
    System.out.println("str1 + str2 -> \"" + (str1+str2) + "\"");
    System.out.println();

    System.out.print("str1 + str2 + \"This is Thomas.\" -> ");
    String str3 = str1 + str2 + " This is Thomas.";
    System.out.println(str3);     // Hello World! This is Thomas.
    System.out.println();

    System.out.println("+= operator to append string");
    String greeting = "Good morning ";
    greeting += "Thomas.";          // Good morning Thomas.
    
    System.out.println("String greeting = \"Good morning \";");
    System.out.println("greeting += \"Thomas\";");
    System.out.println(greeting);

    System.out.println("+ operator can concatenate different primitive datatypes other than String");
    System.out.println();
    System.out.println("+ boolean value:");
    boolean b1 = true;
    System.out.println("boolean b1 = true;");
    System.out.println("\"The answer is \" + b1");
    System.out.println("The answer is " + b1);
    System.out.println();

    System.out.println("+ integer value:");
    int int1 = 10;
    System.out.println("int int1 = 10;");
    System.out.println("\"The number of student is \" + int1");
    System.out.println("The number of student is " + int1);
    System.out.println();

    System.out.println("+ double value:");
    double d1 = 3.1415;
    System.out.println("double d1 = 3.1415;");
    System.out.println("\"The value of PI is approximately \" + d1");
    System.out.println("The value of PI is approximately " + d1);
    System.out.println();

    System.out.println("+ char:");
    char grade = 'C';
    System.out.println("char grade = 'C';");
    System.out.println("\"He has got an \" + grade + \" in English.\"");
    System.out.println("He has got an " + grade + " in English.");
    System.out.println();


    // .length() method
    System.out.println(".length() method returns the length of string");
    System.out.println("Hello: " + str1.length());    // 5 
    System.out.println(" World!: " + str2.length());  // 7
    System.out.println("Hello World! This is Thomas.: " + str3.length());  // 28
    System.out.println();
    System.out.println("\"str.length()-1\" indicates the last index of the string");
    System.out.println("The last char of str1");
    System.out.println("str1 = \"" + str1 + "\"");
    System.out.println("str1.charAt(str1.length()-1) returns '" + str1.charAt(str1.length()-1) +"'");

    // .charAt(index) method. Index of the first element is 0
    System.out.println("\nDemo of .charAt() method. Index starts from 0.");
    System.out.println("str1.charAt(i) method returns the char of string at index i");
    System.out.println("str1 = \"" + str1 + "\"");
    for (int i = 0; i < str1.length(); ++i) 
      System.out.println("str1.charAt(" + i + ") is " + str1.charAt(i));
    System.out.println();

    // .equals method. return true if the content of two strings are the same.
    // if a given string "xxxxx" is being compare. always use the given string to call
    // the .equals(str) method. Since str string variable may point to null 
    System.out.println(".equals(str) method");
    String string1 = "Hello";
    String string2 = "Hello";
    String string3 = "hello";
    System.out.println("string1 = \"" + string1 + "\", string2 = \"" + string2 + "\"");
    System.out.println("string1.equals(string2) returns " + string1.equals(string2));
    System.out.println();
    System.out.println("string1 = \"" + string1 + "\", string3 = \"" + string3 + "\"");
    System.out.println("string1.equals(string3) returns " + string1.equals(string3));
    System.out.println("string2 = \"" + string2 +"\"");
    System.out.println("\"Hello\".equals(string2) returns " + "Hello".equals(string2));
    System.out.println("Always is the fixed string \"xxx\" to call .equals() method!!");
    System.out.println();
    // .toLowerCase() method returns the given string in all lower case letters.
    System.out.println(".toLowerCase() method returns string in all lower case letters");
    System.out.println("string1 = \"" + string1 + "\"");
    System.out.println("string1.toLowerCase() returns \"" + string1.toLowerCase() +"\"");
    System.out.println();

    // .toUpperCase() method returns the given string in all upper case letters.
    System.out.println(".toUpperCase() method returns the given string in all upper case letters.");
    System.out.println("string1 = \"" + string1 + "\"");
    System.out.println("string1.toUpperCase() returns \"" + string1.toUpperCase() +"\"");
    System.out.println();
    System.out.println("String is immutable. Once toUpperCase() is called, new string will be stored in different location");
    System.out.println("str1 = \"" + str1 + "\"");
    System.out.println("str1.hashCode() = " + str1.hashCode());
    System.out.println("str1.toUpperCase() = \"" + str1.toUpperCase() + "\"");
    System.out.println("str1.toUpperCase().hashCode() = " + str1.toUpperCase().hashCode());
    System.out.println();

    // .isEmpty() method checks if the string is an empty string. return true of the string is empty
    System.out.println(".isEmpty() method checks if the string is an empty string. Return true if empty string");
    str1 = "";
    str2 = " ";
    System.out.println("str1 = \"" + str1 +"\"");
    System.out.println("str1.isEmpty() returns " + str1.isEmpty());
    System.out.println("str2 = \"" + str2 +"\"");
    System.out.println("str2.isEmpty() returns " + str2.isEmpty());
    System.out.println();
    // .indexOf("xxx") methods returns the index on the string where the string "xxx" occurs
    str1 = "Hello";
    str2 = "World!";
    System.out.println(".indexOf(\"xxx\") methods returns the index on the string where the string \"xxx\" occurs");
    System.out.println("str1 = \"" + str1 +"\"");
    System.out.println("str1.indexOf(\"lo\") returns " + str1.indexOf("lo"));
    System.out.println("str2 = \"" + str2 +"\"");
    System.out.println("str2.indexOf(\"W\"') returns " + str2.indexOf("W"));
    System.out.println("\nreturn -1 if the string or char is not found.");
    System.out.println("str1 = \"" + str1 +"\"");
    System.out.println("str1.indexOf(\"W\"') returns " + str1.indexOf("W"));
    System.out.println();

    // .replace('a', 'b') methods return character 'a' with character 'b'
    System.out.println();
    System.out.println(".replace('a', 'b') method replace character 'a' with character 'b'");
    str1 = "This is Thomas.";
    System.out.println("str1 = \"" + str1 +"\"");
    System.out.println("str1.replace('o', 'i') returns \"" + str1.replace('o', 'i') +"\"");
    System.out.println();

    // .startsWith("xxx") method returns true if the string starts with "xxx"
    System.out.println(".startsWith(\"xxx\") method returns true if the string starts with \"xxx\"");
    str1 = "This is Wong!";
    System.out.println("str1 = \"" + str1 + "\"");
    System.out.println("str1.startsWith(\"T\") returns " + str1.startsWith("T")); 
    System.out.println("str1.startsWith(\"t\") returns " + str1.startsWith("t")); 
    System.out.println("str1.toLowerCase().startsWith(\"this\") returns " + str1.toLowerCase().startsWith("this")); 
    System.out.println();

    // .endsWith("xxx") method returns true if the string ends with "xxx"
    System.out.println(".endsWith(\"xxx\") method returns true if the string ends with \"xxx\"");
    str1 = "This is Thomas";
    System.out.println("str1 = \"" + str1 + "\"");
    System.out.println("str1.endsWith(\"Thomas\") returns " + str1.endsWith("Thomas")); 
    System.out.println("str1.endsWith(\"thomas\") returns " + str1.endsWith("thomas")); 
    System.out.println("str1.toUpperCase().endsWith(\"THOMAS\") returns " + str1.toUpperCase().endsWith("THOMAS")); 
    System.out.println();

  }

}
