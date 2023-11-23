import java.text.NumberFormat;

public class DemoSwitch {

  public static void main(String[] args) {
    // (if, else-if, else) consists of comparison (>, <, >=, <=, ==, !=) and logical operators (&&, ||, !)
    // single value comparison (==)
    // switch statement
    char grade = 'B';
    // without break, all statements below the fullfilled condition will be executed.
    switch (grade) {              
      case 'A':
        System.out.println("A");
        //break;
      case 'B':
        System.out.println("B");
        //break;
      case 'C':
        System.out.println("C");
        //break;
      case 'D':
        System.out.println("D");
        //break;
      case 'E':
        System.out.println("E");
        //break;
      default:
        System.out.println("F");

    }

    System.out.println();
    
    grade = 'A';
    // use "break" to limit the execution up to statment "break"
    switch (grade) {              
      case 'A':
        System.out.println("A");
        break;
      case 'B':
        System.out.println("B");
        break;
      case 'C':
        System.out.println("C");
        break;
      case 'D':
        System.out.println("D");
        break;
      case 'E':
        System.out.println("E");
        break;
      default:
        System.out.println("F");

    }
    System.out.println();

    NumberFormat percent = NumberFormat.getPercentInstance();

    char vipGrade = 'G'; // G /S /N   Gold 20%, Silver 10%, N 0%
    double discount = 0.0d;

    switch (vipGrade) {
      case 'G':
        discount = 0.2d;
        break;
      case 'S':
        discount = 0.1d;
        break;
      case 'N':
      default:            // other characters (characters other than 'G', 'S', 'N')

    }

    System.out.println("VIP Grade = " + vipGrade + "; discount = " + percent.format(discount));




  }
  
}
