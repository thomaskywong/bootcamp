public class AccountHolder {

  private String name;
  private Account account;

  public AccountHolder() {

  }

  public AccountHolder(String name, Account account) {
    this.name = name;
    this.account = account;
  }

  public AccountHolder(String name) {
    this.name = name;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public String getName() {
    return this.name;
  }

  public Account getAccount() {
    return this.account;
  }
  
  public Account createAccount(String accountNumber) {
    this.account = new Account(accountNumber);
    return this.account;
  }

  // inner class
  public class Account {

    private int accountNumber;

    public Account(int accountNumber) {
      this.accountNumber = accountNumber;
    }

    // Inner class method can directly access outer class' instance fields (attributes), even though the field is private. 
    public void printHolderName() {
      System.out.println(name);
    }

  }

  
}
