package practisefinal;

import java.util.Objects;

public final class Square extends Rectangle {

  public Square(double width) {
    super(width, width);
  }

  @Override
  public void setLength(double length) {
    super.setLength(length);
    super.setWidth(length);
  }

  @Override
  public void setWidth(double length) {
    super.setLength(length);
    super.setWidth(length);
  }

  // cannot override final method!!! Compilation error
  // @Override
  // public double area() {
  // }

  @Override
  public String toString() {
    //System.out.printf("Length: %s, Width: %s\n", this.length, this.width);
    return "Length: " + this.getLength();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) 
      return true;
    
    if (!(obj instanceof Square))
      return false;
    
    Square square = (Square) obj;

    return Objects.equals(square.getLength(), this.getLength());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getLength());
  }

}
