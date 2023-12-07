import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Order {

  private int id;
  private LocalDate buyDate;
  // private double totalAmount; // Once Item class is added, totalAmount is not required as field (attribute)
  private Item[] items;

  private static int orderNumber = 0;

  // public Order(int id, LocalDate buyDate, double totalAmount) {
  // public Order(int id, LocalDate buyDate, Item[] items) {
  //   this.id = id;
  //   this.buyDate = buyDate;
  //   // this.totalAmount = totalAmount;
  //   this.items = items;
  // }

  // Avoid item list to be passed by user. This Constructor + addItem()
  // public Order(int id, LocalDate buyDate) {
  //   this.id = id;
  //   this.buyDate = buyDate;
  //   // this.totalAmount = totalAmount;
  //   this.items = new Item[0];
  // }
  public Order(LocalDate buyDate) {
    this.id = ++orderNumber;
    this.buyDate = buyDate;
    // this.totalAmount = totalAmount;
    this.items = new Item[0];
  }


  // getters
  public int getId() {
    return this.id;
  }

  public LocalDate getOrderDate() {
    return this.buyDate;
  }

  public double totalAmount() {
    // this.items
    // BigDecimals
    BigDecimal totalAmount = BigDecimal.valueOf(0.0d);

    for (int i = 0; i < items.length; i++) {
      totalAmount = totalAmount.add(BigDecimal.valueOf(this.items[i].totalAmount()));
    }

    return totalAmount.doubleValue();
  }

  // setters
  // public void setId(int id) {
  //   this.id = id;
  // }

  public void setOrderDate(LocalDate buyDate) {
    this.buyDate = buyDate;
  }

  public void addOrder(Item item) {
    Item[] newOrders = Arrays.copyOf(this.items, this.items.length + 1);
    // this.items = newOrders;
    // this.items[this.items.length -1] = item;
    newOrders[newOrders.length - 1] = item;
    this.items = newOrders;
  }
  // public void setTotalAmount(double totalAmount) {
  // this.totalAmount = totalAmount;
  // }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("");
    
    // StringBuilder on Item[] to list out items
    StringBuilder itemList = new StringBuilder("");

    for (int i = 0; i < this.items.length; i++) {
      itemList.append(this.items[i]);
    }


    output.append("\n\nOrder ID: ").append(String.valueOf(id))
        .append("\nOrder Date: ").append(String.valueOf(buyDate))
        .append("\n\nItem List: ").append(itemList)
        // .append("Items (").append()
        // .append(",\nTotal Amount = ").append(String.valueOf(totalAmount))
        .append("\n\nTotal Amount = ").append(String.valueOf(this.totalAmount()));

    return output.toString();
  }

  // Static method is a tool only
  public static double totalAmount2(Item[] items) {
    double total = 0;
    for (int i = 0; i < items.length; i++) {
      total = total + items[i].getPrice() * items[i].getQuantity();
    }
    return total;
  }

  public static void main(String[] args) {
    // Item item1 = new Item("Gala Apple", 10.0d, 20);
    // Item item2 = new Item("Fuji Apple", 5.0d, 10);
    // Item item3 = new Item("Rice", 100.0d, 1);


    // // Order order1 = new Order(1, LocalDate.of(2023, 7, 12));
    // Order order1 = new Order(LocalDate.of(2023, 7, 12));
    // order1.addOrder(item1);
    // order1.addOrder(item2);
    // order1.addOrder(item3);
    // System.out.println(order1.toString());



  }


}


