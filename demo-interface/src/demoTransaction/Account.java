package demoTransaction;

public class Account implements Transferable {

  // private int balance;

  // name, age, occupation, etc... encapsulated in AccountHolder object
  private AccountHolder accountHolder; // one-to-one mapping.

  private Transaction[] transactions;

  public Account(String name, int age) {
    // this.balance = 0;
    this.accountHolder = new AccountHolder(name, age);
    this.transactions = new Transaction[0];
  }

  // Not recommended to use single class to implement different account
  // private String type; // Saving, ABC, etc...

  public int balance() {
    int sum = 0;
    for (int i = 0; i < this.transactions.length; i++) {
      // isCredit true/false
      if (this.transactions[i].isCredit()) {
        sum = sum + this.transactions[i].getAmount();
        // System.out.println("Credit Amount: " + this.transactions[i].getAmount());
      } else {
        sum = sum - this.transactions[i].getAmount();
        // System.out.println("Debit Amount: " + this.transactions[i].getAmount());
      }
    }
    return sum;
  }

  public boolean credit(int amount) {
    return this.addTransaction(Transaction.now(true, amount));
  }

  public boolean debit(int amount) {
    if (!isSufficientFund(amount)) {
      return false;
    }
    return this.addTransaction(Transaction.now(false, amount));
  }

  public boolean isSufficientFund(int amount) {
    return this.balance() >= amount;
  }

  @Override
  public boolean transfer(Transferable to, int amount) { // this = from account debit to another account
    // if amount < 0
    // add transaction
    // debit -> fail?
    // credit account
    // add transaction
    if (amount <= 0) { // check if amount is positive number
      return false;
    }
    if (!this.isSufficientFund(amount)) { // check if sufficient amount in "From" account
      return false;
    }
    Account target = (Account) to;
    if (!(target.credit(amount))) {
      return false;
    }

    // return this.addTransaction(Transaction.now(false, amount)); // transfer from "this" to "to"
    return this.debit(amount);
  }

  private boolean addTransaction(Transaction transaction) {

    Transaction[] newArr = new Transaction[this.transactions.length + 1];
    for (int i = 0; i < this.transactions.length; i++) {
      newArr[i] = this.transactions[i];
    }
    newArr[newArr.length - 1] = transaction;
    this.transactions = newArr;

    return true;
  }

  @Override 
  public String toString() {
    StringBuilder output = new StringBuilder("");
    
    output.append("Account( ").append(this.accountHolder.toString())
      .append("\n Transactions( ");
    for (int i = 0; i < this.transactions.length; i++) {
      output.append(this.transactions[i].toString());
    }
    output.append("\n) ) )");
    
    return output.toString();

  }



  
}
