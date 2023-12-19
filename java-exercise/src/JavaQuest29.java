/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    // code here ...
    char[] digits = String.valueOf(n).toCharArray();
    StringBuilder reverse = new StringBuilder("");

    int count = 0;
    for (int i = 0; i < digits.length; i++) {
      reverse.append(String.valueOf(digits[digits.length - 1 - i]));
      count++;
      if (count == 3 & i != digits.length -1) {
        reverse.append(",");
        count=0;
      }
    }
    reverse.append("$");
    StringBuilder output = reverse.reverse();

    return output.toString();
  }

}
