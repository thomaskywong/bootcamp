public enum Status {

  ORDERED('O'), //
  SHIPPED('S'), //
  COMPLETED('C'), //
  ;


  // private attribute and private constructor to let JVM to create char objects associated with emum
  private char val;

  private Status( char val ) {
    this.val = val;
  }

  public char getVal() {
    return this.val;
  }

}
