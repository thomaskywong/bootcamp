package practiseexceptions;

import java.text.Format;
import java.text.NumberFormat;

public class DemoMoneyWithdrawal {

  public static void main(String[] args) {

    BankAccount account = new BankAccount();
    NumberFormat currency = NumberFormat.getCurrencyInstance();


    account.deposit(10_000.0d);
    System.out.println("Balance = " + currency.format(account.balance()));
    System.out.println();

    account.withdraw(20_000.0d);
    System.out.println();
    
    account.withdraw(5_000.0d);
    System.out.println();

    account.withdraw(-1_000.0d); // java.lang.IllegalArgumentException: Amount cannot be <= 0. 
    //account.deposit(-100.0d); //java.lang.IllegalArgumentException: Amount cannot be <= 0. 

  }
  
}
