package practiseenum;

public enum Direction {

  NORTH ('N'),
  EAST ('E'),
  SOUTH ('S'),
  WEST ('W'),
  ;

  private char val;

  private Direction(char val) {
    this.val = val;
  }

  public char getVal() {
    return this.val;
  }

  public static void main(String[] args) {
    
    // .values()  return an array of enum elements
    for (Direction direction : Direction.values()) {
    // .name() return String of enum value
      System.out.println(direction.name());
      // .ordinal() return the int index value of order of enum 
      System.out.println(direction.ordinal());
    }

    System.out.println();
    // .valueOf("xx") return the String value of enum
    System.out.println(Direction.valueOf("WEST"));
    System.out.println(Direction.valueOf("NORTH"));
    System.out.println(Direction.valueOf("EAST"));
    System.out.println(Direction.valueOf("SOUTH"));


  }
  
}
