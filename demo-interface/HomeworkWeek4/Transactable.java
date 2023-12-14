public interface Transactable {

  boolean credit(AccountHolder accountHolder, int amount);

  boolean debit(AccountHolder accountHolder, int amount);

  int balance(AccountHolder accountHolder);

  void showTransactions(AccountHolder accountHolder);

}
