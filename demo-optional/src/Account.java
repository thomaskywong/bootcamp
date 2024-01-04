import java.math.BigDecimal;

public class Account {

  private double balance;

  private int accountNo;

  // Important Note:
  // Optional<T> is not suitable for class attribute nor input parameter
  // Optional<T> does not support serialization / deserialization naturally
  // private Optional<String> currency;  // SHOULD BE AVOIDED

  public Account(int accountNo, double balance) {
    this.accountNo = accountNo;
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getAccountNo() {
    return this.accountNo;
  }

  public void setAccountNo(int accountNo) {
    this.accountNo = accountNo;
  }

  public void credit(double amount) {
    
    if (amount > 0) {
      this.balance = BigDecimal.valueOf(this.balance).add(BigDecimal.valueOf(amount)).doubleValue();
    }
  }

  public boolean debit(double amount) {
    if (amount < 0)
      return null;
    if (this.balance < amount)
      return false;
    
    this.balance = BigDecimal.valueOf(this.balance).subtract(BigDecimal.valueOf(amount)).doubleValue();
    return true;

  }

  @Override 
  public String toString() {
    return "Account(Account no=" + this.accountNo + ", balance=" + this.balance + ")";
  }
  
}
