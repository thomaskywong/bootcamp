public class Card {

  private String color;

  public Card(String color) {
    this.color = color;
  }


  public static void main(String[] args) {

    // total 6 objects (2 x Card, 2 x String)
    String red1 = new String("RED");
    String red2 = new String("RED");
    Card c1 = new Card(red1);
    Card c2 = new Card(red2);

    



  }

}
