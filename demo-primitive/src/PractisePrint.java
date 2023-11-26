public class PractisePrint {
  
  public static void main(String[] args) {

    System.out.println(2.323);      // print double
    System.out.println(123);        // print int
    System.out.println("Hello");    // print String
    System.out.println('C');        // print char
    
    boolean isTrue = true;
    System.out.println(isTrue);     // print variable

    System.out.println();

    System.out.println("\\t");
    System.out.println("\\tThis is Thomas. ->");
    System.out.println("\tThis is Thomas");
    System.out.println();

    System.out.println("\\n");
    System.out.println("This is Thomas.\\nNice to meet you. ->");
    System.out.println("This is Thomas.\nNice to meet you.");
    System.out.println();

    System.out.println("\\\"");
    System.out.println("This is \\\"Thomas\\\". Nice to meet you. ->");
    System.out.println("This is \"Thomas\". Nice to meet you.");
    System.out.println();

    System.out.println("\\\\");
    System.out.println("This is \\\\Thomas\\\\. Nice to meet you. ->");
    System.out.println("This is \\Thomas\\. Nice to meet you.");
    System.out.println();

    System.out.println("System.out.println(\"Thomas\")");
    System.out.println("System.out.println(\"Wong\") ->");
    System.out.println("Thomas");
    System.out.println("Wong");
    System.out.println();

    System.out.println("System.out.print(\"Thomas\")");
    System.out.println("System.out.print(\"Wong\") ->");
    System.out.print("Thomas");
    System.out.print("Wong");
  }

}
