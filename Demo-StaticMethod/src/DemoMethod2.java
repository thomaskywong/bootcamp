public class DemoMethod2 {

  public static boolean notifyCustomer0() {
    if (sendEmail()) {
      return true;
    }
    return sendSMS();
  }

  public static boolean notifyCustomer1() {
    if (sendEmail() || sendSMS()) {
      return true;
    }
    return false;
  }

  public static boolean notifyCustomer2() {
    return sendEmail() || sendSMS();            // check sendEmail() first, if sendEmail() is true, || sendSMS() will not be executed
  }

  public static boolean sendEmail() {
    return false;
  }

  public static boolean sendSMS() {
    return true;
  }

}
