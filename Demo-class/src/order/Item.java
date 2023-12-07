import java.math.BigDecimal;

public class Item {

  private String description;
  private double price;
  private int quantity;

  // All argument constructor
  public Item(String description, double price, int quantity) {
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  // getter
  public String getDescription() {
    return this.description;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double totalAmount(){
    return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
  }

  @Override
  public String toString(){
    return "\nDescription: " + this.description 
      + ", Unit price: " + this.price
      + ", Quantity: " + this.quantity; 
  }

  // setter
  public void setItem(String description, double price, int quantity) {
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public static void main(String[] args) {
    // Item apple = new Item("Envy Apple", 10.0d, 10);
    // System.out.println(apple.toString());

    // apple.setItem("Gala Apple", 5.0d, 5);
    // System.out.println(apple.toString());

    // apple.setPrice(8.0d);
    // System.out.println(apple.toString());

    // apple.setQuantity(2);
    // System.out.println(apple.toString());

    // apple.setDescription("Fuji Apple");
    // System.out.println(apple.toString());

  }


  
}
