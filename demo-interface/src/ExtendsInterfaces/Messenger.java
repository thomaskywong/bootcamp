package ExtendsInterfaces;

public class Messenger implements SendMessage {

  private String message;
  private String emailAddress;
  private String phoneNumber;

  public Messenger(String message) {
    this.message = message;
    this.emailAddress = "";
    this.phoneNumber = "";
  }

  public Messenger(String message, String emailAddress, String phoneNumber) {
    this.message = message;
    this.emailAddress = emailAddress;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean sendMessage() {
    if (!this.sendEmail()) {
      return false;
    }
    if (!this.sendSMS()) {
      return false;
    }

    return true;
  }

  @Override
  public boolean sendEmail() {
    if (emailAddress.isBlank()) {
      return false;
    }
    System.out.println("Send email to: " + emailAddress);
    System.out.println("Message: " + this.message);
    return true;
  }

  @Override
  public boolean sendSMS() {
    if (phoneNumber.isBlank()) {
      return false;
    }
    System.out.println("Send SMS to: " + phoneNumber);
    System.out.println("Message: " + this.message);
    return true;
  }

  // getter
  public String getMessage() {
    return this.message;
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  // setter
  public void setMessage(String message) {
    this.message = message;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public static void main(String[] args) {

    String message = "Hello World";
    Messenger m1 = new Messenger(message, "thomaskywong@yahoo.com", "95746318");
    System.out.println(m1.sendMessage());
    System.out.println();

    Messenger m2 = new Messenger(message);
    m2.setEmailAddress("thomaskywong@yahoo.com");
    System.out.println(m2.sendMessage());
    m2.setPhoneNumber("95746318");
    System.out.println(m2.sendMessage());

  }

}
