package innerclass;

public class AccountHolder {

  private String name;
  private Account2 account;

  // public AccountHolder() {

  // }

  public AccountHolder(String name) {
    this.name = name;
    this.account = new Account2();
  }

  public String getName() {
    return this.name;
  }

  public Account2 getAccount() {
    return this.account;
  }
  
  public Account2 createAccount() {
    this.account = new Account2();
    return this.account;
  }

  // inner class
  public class Account2 {

    private int accountNumber;
    private static int counter = 1000;

    public Account2() {
      this.accountNumber = ++Account2.counter;
    }

    public int getAccountNumber() {
      return this.accountNumber;
    }

    // Inner class method can directly access outer class' instance fields (attributes), even though the field is private. 
    public void printHolderName() {
      System.out.println(name);
    }

    public String getNameFromInner() {
      return name;
    }
  }
}
