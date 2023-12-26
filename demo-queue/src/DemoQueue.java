package src;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {

        // List vs Queue
        // 1. user cannot access the middle element in the queue. Just get the objet from the queue head
        // 2. Queue is FIFO (first-in-first-out)
        //

        List<String> ls = new LinkedList<>();
        // .add(E element), .remove(Object element), .remove(int index), .get(int index)

        // .add(E element) (List Interface)
        // add element at the end of list
        ls.add("ABC");
        ls.add("IJK");
        System.out.println(ls.toString()); // ABC IJK
        String result = ls.get(0); // get first element "ABC"
        System.out.println(result); // "ABC"
        ls.remove(0); // remove first element "ABC"
        System.out.println(ls.toString()); // IJK


        Queue<String> qs = new LinkedList<>();
        // add(E element)
        // add element at the beginning of deque. throw exception if exceeds capacity by JVM
        qs.add("ABC");
        qs.add("DEF");
        qs.add("MHN");

        // poll() get and remove the beginning element
        System.out.println(qs.poll()); // get and remove "ABC"
        System.out.println(qs.toString()); // [DEF, MHN]

        // size() return size of queue
        System.out.println(qs.size()); // 2
        System.out.println();

        // Deque interface
        Deque<String> dq = new LinkedList<>();

        // .add(E element) or .addLast(E element)
        // add element at the end
        dq.add("ABC");
        dq.addLast("DEF");

        System.out.println(dq.toString()); //  ABC DEF
        System.out.println();

        // .removeFirst()
        // remove element at the beginning. throw exception if deque is empty
        dq.removeFirst(); // remove ABC
        System.out.println(dq.toString()); // DEF
        System.out.println();

        // .addLast(E element)
        // add element at the end
        dq.addLast("DEF");
        dq.addLast("GHI");
        dq.addLast("JKL");
        System.out.println(dq.toString()); // DEF DEF GHI JKL
        System.out.println();

        // .removeLast()
        // remove the element at the end. throw exception if deque is empty
        dq.removeLast(); // remove JKL
        System.out.println(dq.toString()); // DEF DEF GHI
        System.out.println();

        // .getFirst()
        // get the element at the beginning without removing
        System.out.println(dq.getFirst()); // DEF
        System.out.println(dq.toString()); // DEF DEF GHI
        System.out.println();

        // .getLast()
        // get the element at the end without removing
        System.out.println(dq.getLast()); // GHI
        System.out.println(dq.toString()); // DEF DEF GHI
        System.out.println();

        // .offerFirst(E element) (return boolean, similar to .add but return boolean. return false if exceeds capacity by JVM)
        // add element at the beginning of deque. Return true if successful
        System.out.println(dq.offerFirst("AAA"));
        System.out.println(dq.toString()); // AAA DEF DEF GHI
        System.out.println();

        // .offerLast(E element) (return boolean, similar to .addLast but return boolean, return false if exceeds capacity by JVM)
        // add element at the end of deque. Return true if successful
        System.out.println(dq.offerLast("ZZZ"));
        System.out.println(dq.toString()); // AAA ABC DEF GHI ZZZ
        System.out.println();

        // .pollFirst()
        // get AND remove the element at the beginning. return null if deque is empty
        System.out.println(dq.pollFirst()); // AAA
        System.out.println(dq.toString()); // ABC DEF GHI ZZZ
        System.out.println();

        // .pollLast()
        // get AND remove the element at the end. return null if deque is empty
        System.out.println(dq.pollLast()); // ZZZ
        System.out.println(dq.toString()); // DEF DEF GHI
        System.out.println();

        // peekFirst()
        // read the element at the beginning without removing the element. Return boolean. return false if empty.
        System.out.println(dq.peekFirst()); // ABC
        System.out.println(dq.toString()); // ABC DEF GHI
        System.out.println();

        // peekFirst()
        // read the element at the end without removing the element. Return boolean. return false if empty.
        System.out.println(dq.peekLast()); // GHI
        System.out.println(dq.toString()); // DEF DEF GHI
        System.out.println();
    }
}
