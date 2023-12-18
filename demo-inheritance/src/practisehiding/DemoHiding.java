package practisehiding;

public class DemoHiding {

  public static void main(String[] args) {
    
    ChildClass c1 = new ChildClass();
    ParentClass p1 = new ParentClass();

    System.out.println(ParentClass.getNum());   // 10
    System.out.println(ParentClass.getNum2());  // 20

    System.out.println(ChildClass.getNum());    // 5 , call child's method hiding parent's method and field
    System.out.println(ChildClass.getNum2());    // 20 , call parent's method

    System.out.println(c1.getNum());    // 5, should use class name to call static method
    System.out.println(p1.getNum());    // 10. should use class name to call static method


    // pay attention! Tricky
    ParentClass p2 = c1; //upcasting from child class object to parent class object
    System.out.println(p2.getNum());    // 10. call parent's method based on type of pointer for STATIC METHOD

    System.out.println(c1.num3);  // -30. hiding parent's field that is assumed to me commonly used
    System.out.println(p1.num3);  // 30   static parent field
    System.out.println(p2.num3);  // 30 . static parent field after upcast


  }
  
}
