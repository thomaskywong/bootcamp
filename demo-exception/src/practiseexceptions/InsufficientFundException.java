package practiseexceptions;

public class InsufficientFundException extends Exception {

  public InsufficientFundException() {
    super("Insufficient fund in bank account.");
  }
  
  public InsufficientFundException(String message) {
    super(message);
  }
  
}
