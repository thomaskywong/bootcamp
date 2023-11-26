public class StringStack {

  String[] stringStack;
  int top;
  int maxSize;

  // Constructor
  public StringStack(int size) {
    stringStack = new String[size];
    top = 0; // default value = 0
    maxSize = size;
  }

  public void push(String element) {
    if (top == maxSize) {
      System.out.println("The stack is full");
    } else {
      stringStack[top] = element;
      top++;
      System.out.println(element +" is added into the stack");
    }
  }

  public String pop() {
    String element = "";
    if (top == 0) {
      System.out.println("The stack is empty");
      return "";
    } else {
      element = stringStack[top-1];
      stringStack[top-1] = null;
      top--;
      return element;
    }
  }

  public int getStack(){
    if (top == 0) {
      System.out.println("The stack is empty");
      return top;
    } else {
      for (int i = 0; i < top; i++) {
        System.out.print(stringStack[i] + " ");
      }
      System.out.println();
      return top;
  }
}

  public int clearStack(){
    if (top == 0) {
      System.out.println("The stack is empty");
      return top;
    } else {
        for (int i = 0; i < top + 1; i++) {
          stringStack[i] = null;
        }
        System.out.println("The stack now is empty");
        top = 0;
        return top; 
    }
  }

}


