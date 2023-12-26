package box;

public class Shape {

  public double area() {
    if (this instanceof Circle || this instanceof Square )
      return this.area();
    return 0.0;
  }
  
  
}
