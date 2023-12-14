public class Transaction implements Transactable {

  private AccountHolder accountHolder;
  private String transactionType;
  private int amount;
  private static Transaction[] transactions = new Transaction[0];

  public Transaction() {

  }

  public Transaction(AccountHolder accountHolder, String transactionType,
      int amount) {
    this.accountHolder = accountHolder;
    this.transactionType = transactionType;
    this.amount = amount;
  }

  @Override
  public boolean credit(AccountHolder accountHolder, int amount) {
    if (!isPositiveAmount(amount)) {
      return false;
    }

    return this.addTransactionRecord(accountHolder, "credit", amount);
  }

  @Override
  public boolean debit(AccountHolder accountHolder, int amount) {
    if (!isSufficientFund(accountHolder, amount)) {
      return false;
    }

    return this.addTransactionRecord(accountHolder, "debit", amount);
  }

  private boolean addTransactionRecord(AccountHolder accountHolder,
      String transactionType, int amount) {

    Transaction transaction =
        new Transaction(accountHolder, transactionType, amount);

    Transaction[] newArr = new Transaction[Transaction.transactions.length + 1];
    for (int i = 0; i < Transaction.transactions.length; i++) {
      newArr[i] = Transaction.transactions[i];
    }
    newArr[newArr.length - 1] = transaction;
    transactions = newArr;

    return true;
  }

  @Override
  public int balance(AccountHolder accountHolder) {
    int sum = 0;
    for (Transaction transaction : Transaction.transactions) {
      if (transaction.accountHolder.equals(accountHolder)) {
        if ("credit".equals(transaction.transactionType)) {
          sum += transaction.amount;
        } else if ("debit".equals(transaction.transactionType)) {
          sum -= transaction.amount;
        }
      }
    }
    return sum;
  }

  @Override
  public void showTransactions(AccountHolder accountHolder) {
    StringBuilder output = new StringBuilder("");

    for (int i = 0; i < transactions.length; i++) {
      if (transactions[i].accountHolder == accountHolder) {
        output.append("Account Holder: ")
            .append(transactions[i].accountHolder.getName()).append(" ")
            .append("Account Number: ")
            .append(transactions[i].accountHolder.getAccountNumber())
            .append("\n").append(transactions[i].transactionType).append(": ")
            .append(transactions[i].amount).append("\n");
      }
    }
    System.out.println(output.toString());
  }

  private boolean isPositiveAmount(int amount) {
    return amount > 0;
  }

  private boolean isSufficientFund(AccountHolder accountHolder, int amount) {
    return this.balance(accountHolder) >= amount;
  }

  public static void showAllTransactions() {
    StringBuilder output = new StringBuilder("");

    for (int i = 0; i < transactions.length; i++) {
        output.append("Account Holder: ").append(transactions[i].accountHolder.getName()).append(" ")
          .append("Account Number: ").append(transactions[i].accountHolder.getAccountNumber()).append("\n")
          .append(transactions[i].transactionType).append(": ")
          .append(transactions[i].amount).append("\n");
    }
    System.out.println(output.toString());
  }


}
