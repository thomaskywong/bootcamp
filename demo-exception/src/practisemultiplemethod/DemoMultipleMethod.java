package practisemultiplemethod;

public class DemoMultipleMethod {

  private static int onStock = 10;
  private static int unitPrice = 100;
  
  public static void main(String[] args) throws IllegalArgumentException{
    // call methodA
    int deliveredItems = 0;

    int payment = 1200;
    int orderQuantity = -10;
    int chargeAmount = 0; 

    try {
      deliveredItems = placeOrder(payment, orderQuantity);
    } catch (IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
      throw ex;
    }
    if (deliveredItems > 0) {
      chargeAmount = unitPrice * deliveredItems;
      System.out.println("Order proceeded successfully!");
      System.out.println("Paid amount = " + payment);
      System.out.println("Deducted amount = " + chargeAmount);
      System.out.println("Change = " + (payment - chargeAmount));
    }
    System.out.println("Delivered quantity = " + deliveredItems);


  }

  public static int placeOrder(int payment, int quantity) throws IllegalArgumentException {
    // call methodB
    int deliveredQuantity = 0;

    if (payment <= 0) {
      throw new IllegalArgumentException("Payment amount cannot be <= 0.");
    }

    if (quantity <= 0) {
       throw new IllegalArgumentException("Order quantity cannot be <= 0.");
    }

    try{ 
       deliveredQuantity = acceptOrder(payment, quantity);
    } catch (InsufficientAmountException | OutOfStockException ex) {
      System.out.println(ex.getMessage());
      return 0;
    }

    return deliveredQuantity;
  }

  public static int acceptOrder(int payment, int quantity) throws InsufficientAmountException, OutOfStockException {
    // call methodC
    int chargeableAmount = unitPrice * quantity; 
    if (chargeableAmount > payment) {
      throw new InsufficientAmountException();
    } 
    
    int stock = 0;
    try {
      stock = checkStock(quantity);
    } catch (OutOfStockException ex) {
      throw ex;
    }
    onStock -= quantity;

    return stock;
  }


  public static int checkStock(int quantity) throws OutOfStockException{
    // what is the different of throwing checked or unchecked exception in method C
    if (onStock < quantity) {
      System.out.println("Order Quantity = " + quantity);
      System.out.println("On stock = " + onStock);
      throw new OutOfStockException();
    }

    return quantity;
  }
  
}
