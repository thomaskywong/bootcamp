public class StringBox {

  private char[] characters;

  // Constructor
  public StringBox(String s) {
    if (s == null) {
      this.characters = new char[0];
    }

    this.characters = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }
  }

  // instance method
  public boolean isEmpty() {
    return this.characters.length == 0;
  }

  public int length() {
    return this.characters.length;
  }

  public String toString() {
    return String.valueOf(this.characters);
  }

  public StringBox concat(String s) {

    int length = this.characters.length + s.length();

    char[] temp = new char[length];

    for (int i = 0; i < this.characters.length; i++) {
      temp[i] = this.characters[i];
    }

    for (int i = 0; i < s.length(); i++) {
      temp[this.characters.length + i] = s.charAt(i);
    }

    // this.characters = temp;

    return new StringBox(String.valueOf(temp));
  }

  public StringBox concat2(String s) {

    int length = this.characters.length + s.length();

    char[] temp = new char[length];

    for (int i = 0; i < this.characters.length; i++) {
      temp[i] = this.characters[i];
    }

    for (int i = 0; i < s.length(); i++) {
      temp[this.characters.length + i] = s.charAt(i);
    }

    this.characters = temp;

    return this;
  }

  public void setCharacters(String s) {
    if (s == null) {
      this.characters = new char[0];
    }

    this.characters = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }

  }

  public StringBox replace(String s1, String s2) {
    return this;
  }

  public StringBox replace(char c1, char c2) {
    return this;
  }


  public static void main(String[] args) {

    StringBox str = new StringBox("hello");
    str.setCharacters("World!");
    System.out.println(str.toString());

    System.out.println(str.concat(" This is Thomas."));

    str.setCharacters("");
    System.out.println(str.isEmpty());    // true
    System.out.println(str.length());     // 0

    str.setCharacters("Thomas");
    System.out.println(str.isEmpty());    // false
    System.out.println(str.length());     // 6
    System.out.println(str.toString());   // "Thomas"

    str.setCharacters("");
    str.concat("Hello");                    // return new StringBox object
    StringBox str2 = str.concat(" World!"); // return new StringBox object

    System.out.println(str.toString());   // ""
    System.out.println(str.isEmpty());    // true
    System.out.println(str.length());     // 0
    
    System.out.println(str2.toString());  // " World!"
    System.out.println(str2.isEmpty());   // false
    System.out.println(str2.length());    // 7

    StringBox str3 = str.concat2("Hello");    // change this attribute. str3 = str (same address)
    System.out.println(str.toString());       // "Hello"
    System.out.println(str.isEmpty());        // false
    System.out.println(str.length());         // 5

    str3.setCharacters("Thomas");             // str3 = str -> "Thomas"
    System.out.println(str.toString());       // "Thomas"
           




  }

}
