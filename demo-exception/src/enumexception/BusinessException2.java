package enumexception;

import exception.BusinessException;

public class BusinessException2 extends Exception {

  private int code;
  // Example: Server is unavailable.

  public BusinessException2(SysCode sysCode) {
    this(sysCode.getCode(), sysCode.getMessage()); // enum .getMessage()
  }

  private BusinessException2(int code, String message) { // "Server is unavailable."
    super(message);
    this.code = code;
  }

  public int getCode() {
    return this.code;
  }

  public static boolean isEmailValid(String emailAddress)
      throws BusinessException2 {

    if (emailAddress == null || emailAddress.length() > 10) {
      throw new BusinessException2(SysCode.EMAIL_TOO_LONG);
      // return false;
    }
    return true;
  }

  public static void main(String[] args) {
    try {
      throw new BusinessException2(SysCode.DB_TIMEOUT);
    } catch (BusinessException2 ex) {
      System.out.println(ex.getMessage());
    } finally {

    }

    try {
      System.out.println("Start try.");
      isEmailValid("thomaskywong@yahoo.com");
      System.out.println("End try.");
    } catch (BusinessException2 ex) {
      System.out.println(ex.getMessage());
    } finally {
      System.out.println("Finally here.");
    }

  }

}
