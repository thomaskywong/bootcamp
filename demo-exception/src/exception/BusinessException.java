package exception;

public class BusinessException extends Exception {

  public BusinessException(String message) {
    // Call Exception Constructor. pass message to parent class Exception
    super(message); 
  }

  public static boolean isEmailValid(String emailAddress) throws BusinessException {

    if (emailAddress == null || emailAddress.length() > 10) {
      throw new BusinessException("Email address is too long. The length should be <= 10");
      // return false;
    }
    return true;
  }

  //   public static boolean isEmailValid2(String emailAddress) throws BusinessException {
  //   // given requirements are provided
  //   if (emailAddress != null && emailAddress.length() <= 8)
  //     return true;
  //   if (emailAddress == null || emailAddress.length() > 8) {
  //     return false;

  //   // throw exception for undefined scenario 
  //   throw new BusinessException("Email address is too long. The length should be <= 8");
  //     // return false;

  //   }
  //   return true;
  // }

  public static void main(String[] args) throws Exception{
    // Checked exception - compiler requires the exception to be handled during the compile time
    // 1. if throw an unchecked exception, shall handle it by two ways
    // a. throws exception(s) at signature
    // b. use try-catch statement to handle
    
    // the method caller still need to handle the unckeced exception even the method throws already.
    // use try-catch method to handle
    String emailAddress = "xxxxxxxxxx@gmail.com";
    emailAddress = null;

    try {
      isEmailValid(emailAddress);
    } catch (BusinessException ex) {
      // you can do anything after you catched it, or do nothing.
      System.out.println(ex.getMessage()); // .getMessage() get exception message
    }

  }



}
