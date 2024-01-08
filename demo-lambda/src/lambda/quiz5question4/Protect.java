package lambda.quiz5question4;

public class Protect {

  public static void main(String[] args) {

    Superman s = x -> x.cry(); // create Superman object
    Children child = () -> System.out.println("Yes, I am crying"); // create Children object
    s.protect(child);
    
    Superman s2 = new SupermanClass();
    Children child2 = new ChildrenClass();

    s2.protect(child2);

  }


}
