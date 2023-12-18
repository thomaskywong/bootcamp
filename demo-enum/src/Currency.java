public enum Currency {

  HKD(1, "Hong Kong Dollar"), USD(2, "US Dollar"), CNY(3, "Ren Min Bi"), JPY(4,
      "Japanese Yuan"),;

  private int dbValue;
  private String desc;

  private Currency(int dbValue, String desc) {
    this.dbValue = dbValue;
    this.desc = desc;
  }

  public int getDbValue() {
    return this.dbValue;
  }

  public String getDesc() {
    return this.desc;
  }

  public static Currency fromDbValue(int dbValue) {

    for (Currency currency : Currency.values()) {
      if (currency.dbValue == dbValue) {
        return currency;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(Currency.fromDbValue(1).name());
    System.out.println(Currency.fromDbValue(2).name());
    System.out.println(Currency.fromDbValue(3).name());
    System.out.println(Currency.fromDbValue(4).name());
    // System.out.println(Currency.fromDbValue(5).name());



  }


}
