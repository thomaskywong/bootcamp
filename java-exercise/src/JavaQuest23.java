/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static boolean sameNumberOfVowels(String s) {

    // code here
    if (s.length() % 2 != 0) {
      throw new IllegalArgumentException(
          "The length of the given string has to be even!");
    }

    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < s.length() / 2; i++) {
      if (isVowel(s.charAt(i))) {
        count1++;
      }
      if (isVowel(s.charAt(s.length() / 2 + i))) {
        count2++;
      }
    }

    return count1 == count2;

  }

  public static boolean isVowel(char ch) {

    return (ch == 'a' || ch == 'A') 
        || (ch == 'e' || ch == 'E')
        || (ch == 'i' || ch == 'I') 
        || (ch == 'o' || ch == 'O')
        || (ch == 'u' || ch == 'U');
  }

  public static void main(String[] args) {

    System.out.println(sameNumberOfVowels("abcdeABCDE")); // true
    System.out.println(sameNumberOfVowels("THomASKYWong")); // false
    System.out.println(sameNumberOfVowels("aEiOuAeIoU")); // true
    System.out.println(sameNumberOfVowels("aEiOuAeIoU")); // true
    System.out.println(sameNumberOfVowels("abCdefGhIjklmNOPQRSTUVWXyZ")); // false
    System.out.println(sameNumberOfVowels("abcdEfghijklmNOPQRSTuVWXuZ")); // true




  }
}
