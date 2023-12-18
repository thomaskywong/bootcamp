public enum Direction {

  NORTH(1), EAST(2), SOUTH(-1), WEST(-2),;

  private int val;

  private Direction(int val) {
    this.val = val;
  }

  public int getVal() {
    return this.val;
  }

  // static method
  public static Direction opposite(Direction direction) {
    return Direction.fromValue(direction.getVal() * -1);
  }

  // instance method
  public Direction opposite() {
    return Direction.fromValue(this.val * -1);
  }

  private static Direction fromValue(int value) {
    for (Direction dir : values()) {
      if (dir.getVal() == value) {
        return dir;
      }
    }
    return null;
  }

  public boolean isOpposite(Direction direction) {
    // return this.val == direction.getVal() * -1;
    return this == direction.opposite();
  }

  public static void main(String[] args) {
    System.out.println(Direction.opposite(Direction.NORTH).name());
    System.out.println(Direction.opposite(Direction.EAST).name());
    System.out.println(Direction.opposite(Direction.SOUTH).name());
    System.out.println(Direction.opposite(Direction.WEST).name());
    System.out.println();

    System.out.println(Direction.NORTH.opposite().name());
    System.out.println(Direction.NORTH.opposite().toString());
    System.out.println(Direction.NORTH.opposite().hashCode());

    System.out.println(Direction.EAST.opposite().name());
    System.out.println(Direction.SOUTH.opposite().name());
    System.out.println(Direction.WEST.opposite().name());

    System.out.println(Direction.SOUTH.isOpposite(Direction.NORTH));



  }

}
