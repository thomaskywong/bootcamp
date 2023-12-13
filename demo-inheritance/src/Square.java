public class Square extends Shape {
  
  private int length;

  public Square(int length) {
    this.length = length;
  }

  public Square(int length, String color) {
    super(color);
    this.length = length;
  }


  @Override
  public double area(){
    return Math.pow(this.length,2);
  }
}
