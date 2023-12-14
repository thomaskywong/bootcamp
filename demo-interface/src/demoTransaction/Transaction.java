package demoTransaction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction { // Entry

  // enum

  // String description;
  // String from

  private LocalDateTime datetime;

  private boolean isCredit; // enum

  private int amount;

  private Transaction(LocalDateTime datetime, boolean isCredit, int amount) {
    this.datetime = datetime;
    this.isCredit = isCredit;
    this.amount = amount;
  }

  public Transaction(boolean isCredit, int amount) {
    this(LocalDateTime.now(), isCredit, amount);
  }

  public static Transaction now(boolean isCredit, int amount) {
    return new Transaction(LocalDateTime.now(), isCredit, amount);
  }

  // getter
  public boolean isCredit() {
    return this.isCredit;
  }

  public int getAmount() {
    return this.amount;
  }

  public LocalDateTime getDateTime() {
    return this.datetime;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("");

    output.append("\nDate: ").append(this.datetime.toString()).append(", ")
          .append("isCredit: ").append(String.valueOf(this.isCredit)).append(", ")
          .append("Amount: ").append(String.valueOf(this.amount));
    return output.toString();
  }
}
