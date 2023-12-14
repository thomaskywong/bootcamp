package demoTransaction;

public class AccountHolder {

  private String name;

  private int age;

  public AccountHolder(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "\n AccountHolder( Name: " + this.name 
          + ", Age: " + this.age
          + ")";
  }
  
}
