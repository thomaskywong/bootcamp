import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Stack;
import java.util.LinkedList;

public class DemoStack {
    public static void main(String[] args) {

        // List interface does not have push() and pop()!
        // List<String> stack1 = new Stack<>();
        // stack1.push("AAA"); // List interface has no push() method
        // System.out.println(stack1.pop()); // List interface has no pop() method

        // 1. if we use List as referene type, the obj ref has no push and pop scope

        Stack<String> stack = new Stack<>();

        // .push(E element) push the first element into stack
        stack.push("ABC");
        stack.push("DEF");
        System.out.println(stack); // ABC DEF
        System.out.println();


        // .pop() pop the top (last) element from the stack
        // throw exception if empty stack
        System.out.println(stack.pop()); // DEF
        System.out.println(stack); // ABC
        System.out.println(stack.pop()); // ABC
        // System.out.println(stack.pop()); // throw exception. cannot pop an empty stack

        // 2. has get(int index). can access the middle element (Powerful!)
        // implements List interface. able to get, set, add, remove element at any index

        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");

        // .get(int index)
        System.out.println(stack.get(0)); // aaa
        System.out.println(stack.get(1)); // bbb
        System.out.println(stack.get(2)); // ccc
        System.out.println();

        // .add(int index, E element)
        stack.add(2, "ddd");
        System.out.println(stack); // aaa bbb ddd ccc

        // .set(int index, E element)
        stack.set(1, "abc");
        System.out.println(stack); // aaa abc ddd ccc

        // .remove(int index)
        stack.remove(2);
        System.out.println(stack); // aaa abc ccc
        System.out.println();

        // .clear()
        stack.push("ABC");
        stack.push("DEF");
        System.out.println(stack); // ABC DEF
        stack.clear();
        System.out.println(stack);
        System.out.println();

        // .removeAllElement()
        stack.push("ABC");
        stack.push("DEF");

        stack.removeAllElements();
        System.out.println(stack); //
        // 3. slow on push() and add()

        // long start = System.currentTimeMillis();

        NumberFormat number = NumberFormat.getNumberInstance();

        Stack<String> stack2 = new Stack<>();
        // Stack. slow in push
        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            stack2.push("A");
        }

        // long end = System.currentTimeMillis();
        long end = System.nanoTime();

        System.out.println("stack.push() x 1,000,000 speed: "
                + number.format(end - start));

        // ArrayList. faster in add
        ArrayList<String> al = new ArrayList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            al.add("A");
        }
        end = System.nanoTime();
        System.out.println("ArrayList.add() x 1,000,000 speed: "
                + number.format(end - start));

        // LinkedList. fastest in add
        LinkedList<String> ll = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            ll.add("A");
        }
        end = System.nanoTime();
        System.out.println("LinkedList.add() x 1,000,000 speed: "
                + number.format(end - start));


        // // remove performance
        // start = System.nanoTime();
        // // for (int i = 0; i < 100_000; i++) {
        // // stack2.pop();
        // // }
        // for (int i = 0; i < 100_000; i++) {
        // stack2.remove(0);
        // }
        // // long end = System.currentTimeMillis();
        // end = System.nanoTime();
        // // System.out.println("stack.pop() x 100,000 speed: " + (end - start));
        // System.out.println("stack.remove(0) x 100,000 speed: "
        // + number.format(end - start));


        // // ArrayList.
        // start = System.nanoTime();
        // for (int i = 0; i < 100_000; i++) {
        // al.remove(0);
        // }
        // end = System.nanoTime();
        // System.out.println("ArrayList.remove(0) x 100,000 speed: "
        // + number.format(end - start));

        // // LinkedList.
        // start = System.nanoTime();
        // for (int i = 0; i < 100_000; i++) {
        // ll.removeFirst();
        // }
        // end = System.nanoTime();
        // System.out.println("LinkedList.removeFirst() x 100,000 speed: "
        // + number.format(end - start));



    }
}
