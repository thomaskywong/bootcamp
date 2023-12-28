package practisemultiplemethod;

public class OutOfStockException extends Exception {

  public OutOfStockException() {
    super("Product out of stock!");
  }

  public OutOfStockException(String message) {
    super(message);
  }
  
}
