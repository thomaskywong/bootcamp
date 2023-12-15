public class Ball {

  // private String color; // will not use String to present color
  private Color color; // relatively finite numbers

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    // Before the main() starts, class load -> new Color("RED")
    // Color.RED (something like public static final, but Color.RED is an object.)
    // cannot "new" the color object manually, since new Color("RED") is done before main()

    // 7 objects (4 x Ball, 3 x Color)
    Ball b1 = new Ball(Color.RED);
    Ball b2 = new Ball(Color.BLACK);
    Ball b3 = new Ball(Color.YELLOW);
    Ball b4 = new Ball(Color.RED);

    if (b1.getColor() == b2.getColor()) { // different color
      System.out.println("same Color");
    } else {
      System.out.println("different Color");
    }

    if (b1.getColor() == b4.getColor()) { // same color
      System.out.println("same Color");
    } else {
      System.out.println("different Color");
    }

    

  }

}
