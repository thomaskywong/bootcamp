package poker;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Deck {

  private Card[] cards;

  private Deck(int numberOfCards) {
    this.cards = new Card[numberOfCards];

    int index = 0;

    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        cards[index++] = new Card(r, s);
      }
    }
  }

  public static Deck ofPocker() {
    return new Deck(52);
  }

  public void riffle() {

    int halfIndex = 26;
    Card[] temp = new Card[52];

    int index = 0;
    for (int i = 0; i < halfIndex; i++) {
      temp[index] = this.cards[i];
      index = index + 2;
    }

    index = 1;
    for (int i = halfIndex; i < this.cards.length; i++) {
      temp[index] = this.cards[i];
      index = index + 2;
    }
    this.cards = temp;

  }

  public void overhand() { // rotate index
    Random random = new Random();
    int randomNum = random.nextInt(52);

    Card[] temp = new Card[52];

    int index = 0;
    for (int i = randomNum; i < this.cards.length; i++) {
      temp[index] = this.cards[i];
      index++;
    }
    for (int i = 0; i < randomNum; i++) {
      temp[index] = this.cards[i];
      index++;
    }

    this.cards = temp;

  }

  public Card[] getCards() {
    return this.cards;
  }

  @Override
  public String toString() {
    return Arrays.toString(this.cards);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Deck)) {
      return false;
    }
    Deck deck = (Deck) obj;

    return Arrays.equals(deck.getCards(), this.cards);

  }

  @Override
  public int hashCode(){
    return Arrays.hashCode(this.cards);
  }



  public static void main(String[] args) {

    Deck d1 = ofPocker();
    Deck d2 = ofPocker();

    System.out.println(d1.toString());
    System.out.println();    
    // System.out.println(d2.toString());
    // System.out.println();

    // System.out.println(d1.equals(d2));    // true
    // System.out.println(d1.hashCode());    // -1503365610
    // System.out.println(d2.hashCode());    // -1503365610
    // System.out.println();


    d1.overhand();
    d1.overhand();
    d1.overhand();
    d1.overhand();
    d1.riffle();
    d1.overhand();
    d1.overhand();
    d1.overhand();
    d1.riffle();
    d1.overhand();
    d1.overhand();
    d1.overhand();
    d1.riffle();


    System.out.println(d1.toString());


  }


}
