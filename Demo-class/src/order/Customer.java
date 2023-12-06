import java.util.Arrays;

public class Customer {

  private Order[] orders;
  //private int totalOrder;
  //private int orderCapacity;


  // Constructor
  public Customer(){
    this.orders = new Order[0];
  }

  public Customer(Order order) {
    Order newOrder = new Order(order.getId(), order.getOrderDate(), order.getTotalAmount());
    this.orders = new Order[] {newOrder};
  } 

  // Override .toString()
  @Override
  public String toString() {

    StringBuilder output = new StringBuilder("\nCustomer record:");

    for (int i = 0; i < this.orders.length; i++) {
      output.append(this.orders[i].toString());
    }
    

    return output.toString();
  }

  // Setters
  public void makeOrder(Order order) {
    this.orders[0] = new Order(order.getId(), order.getOrderDate(), order.getTotalAmount());
  }

  public void addOrder(Order order) {
    // it is a new array object
    Order[] tempArray = Arrays.copyOf(this.orders, this.orders.length + 1);
    this.orders = tempArray;
    this.orders[this.orders.length-1] = order;
  }

  public boolean removeOrder(int orderId) {
    boolean isFound = false;
    int foundIndex = -1;
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getId() == orderId) {
        foundIndex = i;
        isFound = true;
        break;
      }
    }

    int newIndex = 0;
    Order[] tempArray = this.orders;
    orders = new Order[tempArray.length - 1];
    for (int i = 0; i < foundIndex; i++) {
      this.orders[newIndex++] = tempArray[i];
    }
    for (int i = foundIndex + 1; i < tempArray.length; i++) {
      this.orders[newIndex++] = tempArray[i];
    }

    return isFound;
  }

  public boolean updateOrderAmount(int orderId, double totalAmount) {
    
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getId() == orderId) {
        this.orders[i].setTotalAmount(totalAmount);
        return true;
      }
    }

    return false;
  }

  // Getter
  public Order[] getOrders() {
    return this.orders;
  }

  public Order getOrder(int index) {
    return this.orders[index];
  }


  
}
