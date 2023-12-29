package practiseexceptions;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BankAccount {

  private double balance;

  public BankAccount() {

  }

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double balance() {
    return this.balance;
  }

  public boolean deposit(double amount) {  // Runtime exception needs not to be thrown explicitly
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    if (amount <= 0) {
      System.out.println("Withdrawal Amount = " + currency.format(amount));
      throw new IllegalArgumentException(
          "Deposit amount cannot be 0 or negative amount.");
    }
    this.balance = BigDecimal.valueOf(this.balance)
        .add(BigDecimal.valueOf(amount)).doubleValue();
    return true;
  }

  public boolean withdraw(double amount) {

    NumberFormat currency = NumberFormat.getCurrencyInstance();

    if (amount <= 0) {
      System.out.println("Withdrawal Amount = " + currency.format(amount));
      throw new IllegalArgumentException("Withdrawal amount cannot be <= 0.");
    }

    try {
      this.isSufficientFund(amount);
    } catch (InsufficientFundException ex) {
      System.out.println("Withdrawal Amount = " + currency.format(amount));
      System.out.println("Balance = " + currency.format(this.balance));
      System.out.println(ex.getMessage());
      return false;
    }

    this.balance = BigDecimal.valueOf(this.balance)
        .subtract(BigDecimal.valueOf(amount)).doubleValue();
    System.out.println("Withdrawal Amount = " + currency.format(amount));
    System.out.println("New Balance = " + currency.format(this.balance));

    return true;
  }

  private boolean isSufficientFund(double amount)
      throws InsufficientFundException {
    if (this.balance >= amount) {
      return true;
    }
    throw new InsufficientFundException();
  }


}
