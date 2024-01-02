package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball {

  private Color color;
  private double price;

  public Ball(Color color, double price) {
    this.color = color;
    this.price = price;
  }

  public Color getColor() {
    return this.color;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Ball( Color=" + this.color.getColorDescription() + ", price="
        + this.price + ")";
  }

  public static void main(String[] args) {

    List<Ball> balls = new ArrayList<>(
        List.of(new Ball(Color.BLACK, 100.0), new Ball(Color.RED, 200.0),
            new Ball(Color.GREEN, 50.0), new Ball(Color.YELLOW, 500.0),
            new Ball(Color.VIOLET, 500.0), new Ball(Color.VIOLET, 1000.0)));

    System.out.println(balls);
    System.out.println();


    // Approach 1
    Collections.sort(balls, new SortByName());
    System.out.println(balls);
    System.out.println();

    Collections.sort(balls, new SortByPrice());
    System.out.println(balls);
    System.out.println();

    // Approach 2
    // 1) implementing the logic of the required method
    // 2) new the object with that implementation
    List<Ball> balls2 = new ArrayList<>(
        List.of(new Ball(Color.BLACK, 100.0), new Ball(Color.RED, 200.0),
            new Ball(Color.YELLOW, 200.0), new Ball(Color.GREEN, 50.0),
            new Ball(Color.YELLOW, 500.0), new Ball(Color.VIOLET, 500.0),
            new Ball(Color.BLUE, 1000.0), new Ball(Color.VIOLET, 1000.0)));

    Comparator<Ball> sortByPrice =
        (b1, b2) -> b2.getPrice() > b1.getPrice() ? 1 : -1;

    Comparator<Ball> sortByColor =
        (b1, b2) -> b2.getColor().getColorDescription().compareTo(b1.getColor().getColorDescription()) > 0
            ? 1 : -1;

    Comparator<Ball> sortByColorAndThenPrice =
        sortByColor.thenComparing(sortByPrice);

    Comparator<Ball> sortByPriceAndThenColor =
        sortByPrice.thenComparing(sortByColor);

    System.out.println("List of  balls3 after sorting (Color then Price):");
    List<Ball> balls3 = new ArrayList<>(
        List.of(new Ball(Color.BLACK, 100.0), new Ball(Color.RED, 200.0),
            new Ball(Color.YELLOW, 200.0), new Ball(Color.GREEN, 50.0),
            new Ball(Color.YELLOW, 500.0), new Ball(Color.VIOLET, 500.0),
            new Ball(Color.BLUE, 1000.0), new Ball(Color.VIOLET, 1000.0)));
    Collections.sort(balls3, sortByColorAndThenPrice);
    System.out.println(balls3);
    System.out.println();
    System.out.println("List of  balls3 after sorting (Price then Color):");
    Collections.sort(balls3, sortByPriceAndThenColor);
    System.out.println(balls3);


  }


}


