package demoTransaction;

public class DemoAccount {

  public static void main(String[] args) {
    Account thomas = new Account("Thomas", 30);
    thomas.credit(3000); // ah1 deposit
    thomas.credit(1500); // ah1 deposit
    thomas.debit(1500); // ah1 withdraw

    Account peter = new Account("Peter", 25); // ah2 create account
    thomas.transfer(peter, 350); // ah1 -> ah2 350
    System.out.println();
    System.out.println(thomas.balance()); // 2650
    System.out.println();
    System.out.println(peter.balance()); // 350


    Transferable mary = new Account("Mary", 30);
    Account maryAcc = (Account) mary;
    System.out.println(maryAcc.debit(10000)); // false
    System.out.println(maryAcc.credit(5000)); // true
    System.out.println(maryAcc.balance()); // 5000
    mary.transfer(thomas, 3000);
    System.out.println();
    System.out.println(thomas.balance()); // 5650
    System.out.println();
    System.out.println(maryAcc.balance()); // 2000
    System.out.println();

    Object accountObject = new Account("Jenny", 25);
    System.out.println(accountObject.toString());
    System.out.println();

    System.out.println(thomas.toString());
    System.out.println("Balance: " + thomas.balance());
  }

  
}
