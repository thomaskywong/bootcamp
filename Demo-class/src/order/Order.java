import java.time.LocalDate;

public class Order {

  private int id;
  private LocalDate buyDate;
  private double totalAmount;
  private int status; // 0 - pending, 1 - complete

  public Order(int id, LocalDate buyDate, double totalAmount) {
    this.id = id;
    this.buyDate = buyDate;
    this.totalAmount = totalAmount;
  }

  // getters
  public int getId(){
    return this.id;
  }

  public LocalDate getOrderDate(){
    return this.buyDate;
  }

  public double getTotalAmount() {
    return this.totalAmount;
  }

  // setters
  public void setId(int id) {
    this.id = id;
  }

  public void setOrderDate(LocalDate buyDate) {
    this.buyDate = buyDate;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("");
    return output.append("\nOrder ID: ").append(String.valueOf(id))
      .append(",\nOrder Date: ").append(String.valueOf(buyDate))
      .append(",\nTotal Amount = ").append(String.valueOf(totalAmount))
      .toString();
  }




} 
  

