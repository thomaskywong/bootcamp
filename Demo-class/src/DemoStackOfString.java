public class DemoStackOfString {

  public static void main(String[] args) {
    // Initialze size of a stack
    int size = 10;
    int index = 0;
    String element = "";
    String[] fruits = new String[] {"Apple", "Mango", "Orange"};
    

    // Instantiate a stringStack
    StringStack stack = new StringStack();

    System.out.println("stack.getStack()");
    index = stack.getStack();
    System.out.println("The number of element in stack = " + index);
    System.out.println("stack.pop()");
    element = stack.pop();
    System.out.println();

    stack.push(fruits[0]);
    System.out.println("push: " + fruits[0]);
    
    stack.push(fruits[1]);
    System.out.println("push: " + fruits[1]);

    stack.push(fruits[0]);
    System.out.println("push: " + fruits[0]);

    stack.push(fruits[2]);
    System.out.println("push: " + fruits[2]);

    stack.push(fruits[0]);
    System.out.println("push: " + fruits[0]);

    stack.push(fruits[1]);
    System.out.println("push: " + fruits[1]);

    stack.push(fruits[0]);
    System.out.println("push: " + fruits[0]);

    index = stack.getStack();
    System.out.println("The number of element in stack = " + index);

    System.out.println();
    System.out.println("stack.pop()");
    element = stack.pop();
    System.out.println(element);
    index = stack.getStack();
    System.out.println("The number of element in stack = " + index);

    System.out.println();
    System.out.println("stack.pop()");
    element = stack.pop();
    System.out.println(element);
    index = stack.getStack();
    System.out.println("The number of element in stack = " + index);
    System.out.println();

    stack.push(fruits[2]);
    System.out.println("push: " + fruits[2]);
    System.out.println();

    System.out.println("stack.getStack()");
    index = stack.getStack();
    System.out.println("The number of element in stack = " + index);

    System.out.println();
    System.out.println("stack.clearStack()");
    stack.clearStack();
    System.out.println();

    index = stack.getStack();
    System.out.println("The number of element in stack = " + index);
    System.out.println();

    stack.push(fruits[0]);
    System.out.println("push: " + fruits[0]);

    stack.push(fruits[2]);  
    System.out.println("push: " + fruits[2]);

    stack.push(fruits[0]);
    System.out.println("push: " + fruits[0]);

    System.out.println();

    System.out.println("stack.getStack()");
    index = stack.getStack();
    System.out.println("The number of element in stack = " + index);


  }
  
}
