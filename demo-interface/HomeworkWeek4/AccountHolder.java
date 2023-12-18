public class AccountHolder {

  private String name;
  private int accountNumber;
  private static int accountNumCounter = 0;

  private Transactable transact;

  // Constructor injection
  public AccountHolder(String name, Transactable transact) {
    this.name = name;
    this.accountNumber = ++accountNumCounter;
    this.transact = transact;
  }

  // getter
  public String getName() {
    return this.name;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  // credit()
  public boolean credit(int amount) {
    return this.transact.credit(this, amount);
  }

  // debit()
  public boolean debit(int amount) {
    return this.transact.debit(this, amount);
  }

  // balance()
  public int balance() {
    return this.transact.balance(this);
  }

  // showTransactions()
  public void showTransactions() {
    this.transact.showTransactions(this);
  }

  public static void main(String[] args) {

    Transaction trans1 = new Transaction();
    AccountHolder ah1 = new AccountHolder("Thomas", trans1);

    System.out.println("Balance: " + ah1.balance()); // 0
    System.out.println("Debiting 500: " + ah1.debit(500)); // false
    System.out.println("Crediting 0: " + ah1.credit(0)); // false

    System.out.println("Crediting 1000: " + ah1.credit(1000)); // true
    System.out.println("Debiting 500: " + ah1.debit(500)); // true
    System.out.println("Balance: " + ah1.balance()); // 500

    System.out.println("Crediting 2000: " + ah1.credit(2000)); // true
    System.out.println("Debiting 3000: " + ah1.debit(3000)); // false
    System.out.println("Balance: " + ah1.balance()); // 2500

    System.out.println("Debiting 2500: " + ah1.debit(2500)); // true

    System.out.println();
    ah1.showTransactions();
    System.out.println("Balance: " + ah1.balance()); // 0

    AccountHolder ah2 = new AccountHolder("Tommy", new Transaction());
    ah2.credit(20000);
    ah1.credit(30000);
    ah2.debit(100);
    ah2.debit(100);
    ah1.credit(100);
    ah1.credit(2000);
    ah2.showTransactions();
    System.out.println("Balance: " + ah2.balance()); // 0

    System.out.println();
    ah1.showTransactions();

    Transaction.showAllTransactions();

  }
}
