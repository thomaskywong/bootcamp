public class Challenge1{
  public static void main(String[] args) {
    int numericGrade = 20;
    char letterGrade ='F';

    numericGrade /= 10;

    switch (numericGrade) {
      case 10:
      case 9:
        letterGrade = 'A';
        break;
      case 8:
        letterGrade = 'B';
        break;
      case 7:
        letterGrade = 'C';
        break;
      case 6:
        letterGrade = 'D';
        break;
      case 5:
        letterGrade = 'E';
        break;
      default:

    }
    System.out.println("letterGrade: " + letterGrade);
  }
}