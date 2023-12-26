package practiseenum;

public enum Currency {

  HKD(1, "Hong Kong Dollars"), //
  CNY(2, "Chinese Yuan"), //
  JPN(3, "Japanese Yuan"), //
  USD(4, "US Dollars"), //
  ;

  private int code;
  private String description;

  private Currency(int code, String description) {
    this.code = code;
    this.description = description;
  }

  public int getCode() {
    return this.code;
  }

  public String getDescription() {
    return this.description;
  }

  public static void main(String[] args) {

    for (Currency dir : Currency.values()) { // return Array of enum elements
      System.out.print(dir.name()); // return name of enum
      System.out.print(" " + dir.toString()); // return string of emum
      System.out.print(" " + dir.getCode()); // self define method
      System.out.print(" " + dir.getDescription()); // self define method
      System.out.print(" " + Currency.valueOf(dir.name())); // get name of emum by provided String
      System.out.print(" " + dir.ordinal() + "\n"); // get index of emum by provided String

    }



  }


}
