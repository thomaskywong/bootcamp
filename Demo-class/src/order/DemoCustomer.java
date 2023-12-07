
import java.time.LocalDate;

public class DemoCustomer {

  public static void main(String[] args) {
    
    // Create a customer
    Customer thomas = new Customer(); 
    
    // Create an order
    Order order1 = new Order(LocalDate.of(2023, 12, 6));
    order1.addOrder(new Item("Gala Apple", 12.0, 10));
    order1.addOrder(new Item("Primium Steak", 100.0d, 2));
    order1.addOrder(new Item("Rice", 80.0d, 1));
    
    thomas.addOrder(order1);
    //System.out.println(thomas.toString());
    
    Order order2 = new Order(LocalDate.of(2023, 12, 7));
    order2.addOrder(new Item("Soup", 10.0, 5));
    order2.addOrder(new Item("Tomato", 2.0d, 4));
    order2.addOrder(new Item("Pork", 50.0d, 1));

    thomas.addOrder(order2);
    System.out.println(thomas.toString());

    int orderId = 1;
    System.out.println("Order Id: " + orderId + ", Total Amount = " + thomas.getOrder(orderId).totalAmount());
    System.out.println();

    thomas.setAge(44);
    if (thomas.isAdult()) {
      System.out.println("The customer is an adult.");
    }

    if (!thomas.isVIP()) {
      System.out.println("The customer is NOT a VIP.");

    System.out.println("The customer's membership is " + thomas.membership());

    Order order3 = new Order(LocalDate.of(2023, 12, 3));
    order3.addOrder(new Item("Gala Apple", 12.0, 5));
    order3.addOrder(new Item("Primium Steak", 100.0d, 1));
    order3.addOrder(new Item("Rice", 80.0d, 6));
    order3.addOrder(new Item("Tomato", 2.0d, 3));
    order3.addOrder(new Item("Pork", 50.0d, 2));
    
    thomas.addOrder(order3);
    System.out.println(thomas.toString());


    }
    // thomas.removeOrder(1);
    // System.out.println(thomas.toString());
    // thomas.removeOrder(2);
    // System.out.println(thomas.toString());

    // System.out.println("Order Id: " + orderId + ", Total Amount = " + thomas.getOrder(orderId).totalAmount());
    //Order order2 = new Order(2, LocalDate.of(2023, 12, 7));

    // order2.setTotalAmount(4000d);
    //System.out.println(order1.toString());

    // Customer customer1 = new Customer(order1);
    // System.out.println(customer1.toString());
    // System.out.println();

    // boolean isChanged = customer1.updateOrderAmount(1, 5000);
    // System.out.println("Order changed successfully: " + isChanged);
    // System.out.println(customer1.toString());

    // Customer customer2 = new Customer();
    // // System.out.println(customer2.toString());

    // customer2.addOrder(new Order(3, LocalDate.of(2000, 10, 1), 1000));
    // System.out.println(customer2.toString());

    // customer2.addOrder(new Order(4, LocalDate.of(2000, 12, 1), 10000));
    // System.out.println(customer2.toString());

    // customer2.addOrder(new Order(5, LocalDate.of(2000, 12, 1), 10000));
    // System.out.println(customer2.toString());

    // customer2.addOrder(new Order(7, LocalDate.of(2000, 12, 1), 10000));
    // System.out.println(customer2.toString());


    // customer2.removeOrder(4);
    // System.out.println(customer2.toString());

    // customer2.removeOrder(7);
    // System.out.println(customer2.toString());



    
  }

}
