package interfaceinjection;

public class Book implements Adjustment {

  private double price;

  public Book(double price) {
    this.price = price;
  }

  @Override
  public double adjust(double x) {
    return this.price * x;
  }
  
}
