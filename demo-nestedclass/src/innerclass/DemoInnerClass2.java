package innerclass;

import java.util.Arrays;
public class DemoInnerClass2 {
  
  public static void main(String[] args) {
    
      AccountHolder thomas = new AccountHolder("Thomas");
      System.out.println(thomas.getAccount().getNameFromInner())
      ;

  }
  
}
