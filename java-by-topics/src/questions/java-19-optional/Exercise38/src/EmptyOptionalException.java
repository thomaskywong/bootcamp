package Exercise38.src;

public class EmptyOptionalException extends Exception {

  public EmptyOptionalException() {
    super("Empty Optional object!");
  }

  public EmptyOptionalException(String message) {
    super(message);
  }
  
 }
