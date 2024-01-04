package streamdemo;

import java.util.ArrayList;
import java.util.List;

public class Customer {

  List<Address> addresses;

  public Customer() {
    addresses = new ArrayList<>();
  }

  public Customer(String address1, String address2) {
    addresses = new ArrayList<>(List.of(new Address(address1, address2)));
  }

  public void addAddress(String address1, String address2) {
    addresses.add(new Address(address1, address2));
  }

  public List<Address> getAddresses() {
    return this.addresses;
  }
  
  @Override
    public String toString() {
      
      StringBuilder str = new StringBuilder("");
      
      for (Address address : addresses) {
        str.append(address.toString());
      }

      return str.toString();
    }
  
    public class Address {

    private String line1;
    private String line2;

    private Address(String line1, String line2) {
      this.line1 = line1;
      this.line2 = line2;
    }

    // Inner class object or method can access outer class attribute
    public void print() {
      System.out.println(addresses);
    }

    @Override
    public String toString() {
      return "Address(line1=" + this.line1 + ", line2=" + this.line2 +")";
    }


  }
  
}
