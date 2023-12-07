import java.util.Arrays;

public class Customer {

  private Order[] orders;
  private int age;        // state
  // private int totalOrder;
  // private int orderCapacity;


  // Constructor
  public Customer() {
    this.orders = new Order[0];
  }

  public Customer(Order order) {
    Order newOrder =
        new Order(order.getId(), order.getOrderDate(), order.getTotalAmount());
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
  // public void makeOrder(Order order) {
  //   this.orders[0] =
  //       new Order(order.getId(), order.getOrderDate(), order.getTotalAmount());
  // }

  public void setAge(int age) {
    this.age = age;
  }

  // Modify instance variables
  public void addOrder(Order order) {
    // it is a new array object
    Order[] tempArray = Arrays.copyOf(this.orders, this.orders.length + 1);
    this.orders = tempArray;
    this.orders[this.orders.length - 1] = order;
  }

  public boolean removeOrder(int orderId) {
    boolean isFound = false;
    int foundIndex = -1;

    // See if orderId is found
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getId() == orderId) {
        foundIndex = i;
        isFound = true;
        break;
      }
    }

    // Early return if not found
    if (!isFound) {
      return false;
    }

    int newIndex = 0;
    Order[] tempArray = this.orders;
    orders = new Order[tempArray.length - 1];

    // Delete element
    for (int i = 0; i < tempArray.length; i++) {
      if (i == foundIndex) {
        continue;
      }
      this.orders[newIndex++] = tempArray[i];
    }

    return isFound;

  }

  // totalAmount attribute is replaced by Item[]
  // public boolean updateOrderAmount(int orderId, double totalAmount) {

  //   for (int i = 0; i < this.orders.length; i++) {
  //     if (this.orders[i].getId() == orderId) {
  //       this.orders[i].setTotalAmount(totalAmount);
  //       return true;
  //     }
  //   }

  //   return false;
  // }

  // Getter
  public Order[] getOrders() {
    return this.orders;
  }
  
  // return Order object based on orderID
  public Order getOrder(int orderId) {

    for (int i = 0; i < orders.length; i++) {
      if (orderId == this.orders[i].getId()){
        return this.orders[i];
      }
    }
    
    return null;        // no object returned
  }

  public int getAge() {
    return this.age;
  }

  public boolean isAdult() {
    return this.age >= 18;
  }

  public boolean isVIP() {
    return this.orders.length >= 100;
  }

  public char membership() {

    if (this.orders.length >= 2) {
      return 'G';       
    }

    if (this.orders.length >= 1) {
      return 'S';
    }

    return 'N';     // default return 'N'
  }

}
