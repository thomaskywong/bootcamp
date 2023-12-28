package practisemultiplemethod;

public class InsufficientAmountException extends Exception{
  
  public InsufficientAmountException() {
    super("Insufficient payment!");
  }

  public InsufficientAmountException(String message) {
    super(message);
  }
  
}
