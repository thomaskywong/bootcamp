public class StringBox {

  private char[] characters;

  public StringBox(String s) {
    if (s == null) {
      this.characters = new char[0];
    }

    this.characters = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }

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

  public String getString() {
    return String.valueOf(this.characters);
  }

  public static void main(String[] args) {

    StringBox str = new StringBox("hello");
    str.setCharacters("World!");
    System.out.println(str.getString());

  }

}
