package demoTransaction;

public interface Transferable {

  boolean transfer(Transferable to, int amount);
 
  // static method is optional, but not recommended
  // public static void batchTransfer(Transferable[] from, Transferable[] to, int value) {

  // }
}
