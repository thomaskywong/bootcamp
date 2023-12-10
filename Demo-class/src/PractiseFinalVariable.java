public class PractiseFinalVariable {
  private final int DAYS_PER_WEEK = 7;
  private final int MONTHS_PER_YEAR;

  private static final int DAYS_PER_NON_HEAP_YEAR = 365; // stactic final varaible can only be initialzed during declaration.
  // private static final int YEARS_PER_CENTURY; // static final variable CANNOT BE USED WITHOUT initialization

  // final variable can be initialized by constructor
  public PractiseFinalVariable(int value1, int value2) {
    this.MONTHS_PER_YEAR = value1; // final variable CAN be initialized by constructor. Once assigned a value, the value will be fixed
    // this.DAYS_PER_WEEK = 8; // once the value is initialized during declaration, cannot be re-initial

    // PractiseFinalVariable.YEARS_PER_CENTURY = value2; // static final variable CANNOT be initialzed by constructor
  }

  public static void main(String[] args) {

    PractiseFinalVariable obj = new PractiseFinalVariable(12, 100);
    PractiseFinalVariable obj2 = new PractiseFinalVariable(13, 100);

    // obj.DAYS_PER_WEEK = 10; // final variable cannot be re-assigned
    // instance final variable
    System.out.println(obj.DAYS_PER_WEEK);
    System.out.println(obj.MONTHS_PER_YEAR);

    System.out.println(obj2.DAYS_PER_WEEK);
    System.out.println(obj2.MONTHS_PER_YEAR);

    // class final variable
    System.out.println(PractiseFinalVariable.DAYS_PER_NON_HEAP_YEAR); // Static final variable can be accessed by classname
    // System.out.println(obj.DAYS_PER_NON_HEAP_YEAR); // static final variable cannot be access by obj.

  }

}
