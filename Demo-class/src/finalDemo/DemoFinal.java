package finalDemo;

public class DemoFinal {

  private final int MAX_CAPACITY;
  private final int MIN_CAPACITY = 10;
  private static final int TOTAL_CAPACITY = 100;
  private static int counter = 0;

  public DemoFinal(int maxCapacity) {
    this.MAX_CAPACITY = maxCapacity;
    DemoFinal.counter++;
  }

  public int getMaxCapacity(){
    return this.MAX_CAPACITY;
  }

  public int getMinCapacity() {
    return this.MIN_CAPACITY;
  }

  public static int getCounter() {
    return DemoFinal.counter;
  }

  public static void setCounter(int counter) {
    DemoFinal.counter = counter;
  }

  public static void main(String[] args) {
    
    DemoFinal df1 = new DemoFinal(20);
    System.out.println(df1.getMaxCapacity());   // 20
    System.out.println(df1.getMinCapacity());   // 10
    System.out.println(df1.getCounter());         //1
    System.out.println(DemoFinal.getCounter());   // 1

    DemoFinal df2 = new DemoFinal(10);
    System.out.println(DemoFinal.getCounter());   // 2
    System.out.println(df2.getCounter());         // 2
    System.out.println(df1.getCounter());         // 2
    DemoFinal.setCounter(200);
    System.out.println(DemoFinal.getCounter());   // 200
    System.out.println(df2.getCounter());         // 200
    System.out.println(df1.getCounter());         // 200





  }
  
  
}
