public class PractiseOverflow {

  public static void main(String[] args) {
    
    char c = (char) 65535;
    
    for (int i = 0; i < 128; i++)
      System.out.println( i + " = " + (++c));
    System.out.println();
    
    byte b = 127;
    for (int i = 0; i < 129; i++)
      System.out.println( b++);
  }
  
}
