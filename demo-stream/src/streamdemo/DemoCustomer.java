package streamdemo;

public class DemoCustomer {

  public static void main(String[] args) {

    Customer customer = new Customer();
    customer.addAddress("Tuen Mun", "N.T");

    Customer.Address address = customer.addresses.get(0); // Constructor of Address class is now private
    address.print();

  }

}
