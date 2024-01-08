public enum Direction {

  NORTH('N'), //
  EAST('E'), //
  SOUTH('S'), //
  WEST('W'), //
  ;

  private char dir;

  private Direction(char c) {
    this.dir = c;
  }

  public char getDir() {
    return this.dir;
  }

  
}
