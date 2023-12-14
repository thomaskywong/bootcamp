public class Account {

  private int balance;
  
  // name, age, occupation, etc... encapsulated in AccountHolder object
  private AccountHolder accountHolder;    // one-to-one mapping.

  // public Account(AccountHolder accountHolder) {
  //   this.balance = 0;
  //   this.accountHolder = accountHolder;
  // }

  public Account(String name, int age) {
    this.balance = 0;
    this.accountHolder = new AccountHolder(name, age);
  }
  
  // Not recommended to use single class to implement different account
  //private String type;   // Saving, ABC, etc...

  public void credit(int amount) {
    balance += amount;
  }
  
  public boolean debit(int amount) {
    if (! isSufficientFund(amount)) {
      return false;
    }   

    this.balance -= amount;
    return true;
  }

  public boolean isSufficientFund(int amount) {
    return this.balance >= amount;
  }
  
}
