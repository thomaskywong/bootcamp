public class PractiseArithmaticPart1{
  public static void main(String[] args) {
    System.out.println("int arithmetic expression");
    int i = 1;
    int j = 2;

    //'+', '+='' and '++'' expression
    System.out.println("'+', '+=' and '++' expression. '++' can only be used by integers");
    
    int k = i + j;
    System.out.println("int i = " + i +", int j = " + j);
    System.out.println("int k = i + j;");
    System.out.println("k = " + k);
    System.out.println();

    System.out.println("i = " + i);
    System.out.println("i += 10;\t//means i = i + 10");
    i += 10;
    System.out.println("i = " + i);
    System.out.println();

    i = 10;
    k = 0;
    System.out.println("i = " + i);
    k = i++;
    System.out.println("k = i++;\t//First k = i (k = 10),  then i = i + 1 (i = 11)");
    System.out.println("k = " + k + ", i = " + i);
    System.out.println();

    i = 10;
    k = 0;
    System.out.println("i = " + i);
    k = ++i;
    System.out.println("k = ++i;\t//First i = i + 1 (i = 11),  then k = i (k = 11)");
    System.out.println("k = " + k + ", i = " + i);
    System.out.println();
    
     //'-', '-='' and '--'' expression
    System.out.println("'-', '-='' and '--' expression. '--' can only be used on integers");
    float a = 1.32f;
    float b = 23123.32f;

    float c = b - a;
    System.out.println("float a = " + a +", float b = " + b);
    System.out.println("float c = b - a;");
    System.out.println("c = " + c);
    System.out.println();

    System.out.println("c = " + c);
    System.out.println("c -= 10;\t//means c = c - 10");
    c -= 10;
    System.out.println("c = " + c);
    System.out.println();

    int m = 10;
    int n = 0;
    System.out.println("m = " + m);
    n = m--;
    System.out.println("n = m--;\t//First n = m (n = 10),  then m = m - 1 (m = 9)");
    System.out.println("n = " + n + ", m = " + m);
    System.out.println();

    m = 10;
    n = 0;
    System.out.println("m = " + m);
    n = --m;
    System.out.println("n = --m;\t//First m = m - 1 (m = 9),  then n = m (n = 9)");
    System.out.println("n = " + n + ", m = " + m);
    System.out.println();

    System.out.println("REMARK: ++ and -- operators can only be used on integer type numbers.");
    System.out.println();

    // + and - operation on float and double
    System.out.println("+ operation on float and double");
    float f1 = 2.12f;
    float f2 = 231f;
    float f3 = f1 + f2;
    System.out.println("float f1 = 2.12f;");
    System.out.println("float f2 = 231f;");
    System.out.println("float f3 = f1 + f2;");
    System.out.println("f3 = " + f3);
    
    System.out.println();
    System.out.println("+ operation on float and double");
    double d1 = 1000.12d;
    float f4 = 231f;
    double d3 = d1 + f4;
    System.out.println("double d1 = 1000.12d;");
    System.out.println("float f4 = 231f;");
    System.out.println("double d3 = d1 + f3;");
    System.out.println("d3 = " + d3);
    
    System.out.println();
    System.out.println("- operation on float and double");
    d1 = 1000.12d;
    f4 = 231f;
    d3 = d1 - f4;
    System.out.println("double d1 = 1000.12d;");
    System.out.println("float f4 = 231f;");
    System.out.println("double d3 = d1 - f3;");
    System.out.println("d3 = " + d3);

    // casting of numbers
    System.out.println();
    System.out.println("Casting of numbers");
    int int1 = 0;
    double double3 = 10.423342d;
    float float3 = 2132.223f;
    int1 = (int) (float3 - double3);
    System.out.println("double3 = " + double3);
    System.out.println("float3 = " + float3);
    System.out.println("int1 = (int) (float3 - double3);");
    System.out.println("float3 - double3 = " + (float3 - double3));
    System.out.println("int1 = " + int1);
    System.out.println("Casting EXPLICITYLY from float or double to integer");
    System.out.println("Casting-to-int simply takes the integer portion of the number");
    System.out.println("\tand truncates the decimals.");
    System.out.println();

    int k1 = 10000;
    float f5 = 21321.232f;
    double d4 = k1 + f5;
    System.out.println("int k1 = 10000;");
    System.out.println("float f5 = 21321.232f;");
    System.out.println("double d4 = k1 + f5;");
    System.out.println("d4 = " + d4);
    System.out.println("Casting IMPLICITLY from int to double");
  }
}