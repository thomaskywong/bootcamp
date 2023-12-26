import java.util.Stack;
import java.util.List;
import java.util.Collection;


public class PractiseStack {

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();

    // .push(E element)
    stack.push(1);
    stack.push(3);
    stack.push(5);
    System.out.println(stack); // 1 3 5
    System.out.println();

    // .add(E element)
    stack.add(4);
    stack.add(6);
    System.out.println(stack); // 1 3 5 4 6
    System.out.println();

    // .pop()
    System.out.println(stack.pop()); // 6
    System.out.println(stack.pop()); // 4
    System.out.println(stack); // 1 3 5

    // .size()
    System.out.println(stack.size()); // 3
    System.out.println();

    // .isEmpty()
    System.out.println(stack.isEmpty()); // false
    System.out.println();

    // .clear()
    stack.clear();
    System.out.println(stack.isEmpty()); // true

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    // .peek()
    System.out.println(stack.peek()); // 6
    System.out.println(stack.peek()); // 6
    System.out.println();


    // .firstElement()
    System.out.println(stack.firstElement()); // 1
    System.out.println();

    stack.push(null);
    // .lastElement()
    System.out.println(stack.peek()); // null
    System.out.println(stack.lastElement()); // null
    System.out.println();

    // .pop()
    System.out.println(stack);
    stack.pop();
    System.out.println(stack);
    System.out.println();


    // .get(int index)
    System.out.println(stack.get(4)); // 5
    System.out.println(stack.get(0)); // 1
    System.out.println();

    // .remove(int index)
    System.out.println(stack.remove(4)); // 5
    System.out.println(stack); // 1, 2, 3, 4, 6

    // .add(int index, E element)
    stack.add(4, 5);
    System.out.println(stack); // 1, 2, 3, 4, 5, 6
    System.out.println();

    // .set(int index, E element)
    stack.set(4, 0);
    System.out.println(stack); // 1, 2, 3, 4, 0, 6
    System.out.println();

    // .remove(Object obj)
    stack.push(4);
    System.out.println(stack);
    stack.remove(Integer.valueOf(4)); // remove first occurance of 4 (Collection Interface)
    System.out.println(stack); // 1, 2, 3, 0, 6, 4
    System.out.println();

    // .elementAt(int index)
    System.out.println(stack.elementAt(2)); // 3
    System.out.println();

    // .contains(Object obj)
    System.out.println(stack.contains(Integer.valueOf(5))); // false
    System.out.println(stack.contains(Integer.valueOf(0))); // true
    System.out.println();


    // .removeAllElements()
    stack.removeAllElements(); // .clear()
    System.out.println(stack);
    System.out.println();

    // .addAll( Collection <? extends E> c)
    List<Integer> list = List.of(-5, 4, -3, 2, -1, 0, 1, -2, 3, -4, 5);
    stack.addAll(list);
    System.out.println(stack); // [-5, 4, -3, 2, -1, 0, 1,-2, 3, -4, 5]
    System.out.println();

    System.out.println(stack.pop()); // 5
    System.out.println(stack.lastElement()); // -4
    System.out.println(stack.firstElement()); // -5
    System.out.println(stack.indexOf(0)); // 5



  }

}
