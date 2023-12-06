
import java.time.LocalDate;

public class DemoCustomer {

  public static void main(String[] args) {

    Order order1 = new Order(1, LocalDate.of(2023, 12, 6), 10000);
    Order order2 = new Order(2, LocalDate.of(2023, 12, 7), 20000);

    order2.setTotalAmount(4000d);
    System.out.println(order1.toString());

    Customer customer1 = new Customer(order1);
    System.out.println(customer1.toString());
    System.out.println();

    boolean isChanged = customer1.updateOrderAmount(1, 5000);
    System.out.println("Order changed successfully: " + isChanged);
    System.out.println(customer1.toString());

    Customer customer2 = new Customer();
    // System.out.println(customer2.toString());

    customer2.addOrder(new Order(10, LocalDate.of(2000, 10, 1), 1000));
    System.out.println(customer2.toString());

    customer2.addOrder(new Order(20, LocalDate.of(2000, 12, 1), 10000));
    System.out.println(customer2.toString());

    customer2.addOrder(new Order(30, LocalDate.of(2000, 12, 1), 10000));
    System.out.println(customer2.toString());

    customer2.removeOrder(20);
    System.out.println(customer2.toString());

    
  }

}
