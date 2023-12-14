package ExtendsInterfaces;

public interface SendMessage extends SendEmail, SendSMS {

  boolean sendMessage();


}
