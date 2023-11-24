public class PractiseCharFound {
  public static void main(String[] args) {


    int n = -1;
    char target = 'd';
    String str = "abc pol ijk def xyz";

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        n = i;
        break;
      }
    }

    if (n == -1)
      System.out.println("Not Found");
    else
      System.out.println(
          "Found \'" + target + "\' at the " + (n + 1) + "th character");


  }
}
