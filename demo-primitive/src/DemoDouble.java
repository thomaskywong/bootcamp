public class DemoDouble {

  public static void main(String[] args) {
    
    // doube type store decimal numbers
    // float (16 bits), double (32 bits)
    // double d1 = 0.3;      
    // double d2 = 0.1;

    // double d3 = d1 + d2;
    // System.out.println(d3);
    // By default (without notation), decimal number is double type
    double d1 = 0.2;
    double d2 = 0.1;

    // notation for double is d
    double d3 = 0.3d;

    double d4 = d1 + d2;
    System.out.println(d3);         // double type has finite decimal issue that cause precision error 0.30000000000000004

    double d5 = 199999.12345678901234567890;
    System.out.println(d5);         // double type has finite decimal issue. 199999.123456789
    
    // notation for float is f
    //float f1 = 0.3;                 // no impleciitly down cast to float from double. 0.3 is double by default
    float f2 = 0.3f;                  

    float f4 = (float) d5;            // 199999.12    float type has 16 bits only. store value within 16 bit
    System.out.println(f4);
  }
  
}
