public class DemoStringBuilder {

  public static void main(String[] args) {
    
  
  // concat +=, .concat()
  // create new object literal
  String x = "abc";
  x += "def";
  x = x.concat("def");
  System.out.println(x);

  // StringBuilder. Class that contains String attribe
  // pass by reference
  StringBuilder y = new StringBuilder("abc");
  y.append("def").append("ghi");
  System.out.println(y.toString());

  }

  
}
