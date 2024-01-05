import java.util.LinkedList;

/** 
 * Exercise:
 * Implement push method to insert node to the front of the linked list.
 */
/**
 * Expected Output:
 * Created Linked list is: 
 * 1 7 6 4 
 */
class Exercise25 { // Linked List
    Node head; // head of list

    /* Linked list Node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        // code here
    
        Node newNode = new Node(new_data);
        if (this.head == null) {
            //newNode.next = null;
            this.head = newNode;
            return;
        } else {
            newNode.next = this.head;
            this.head = newNode;        
        }
    }

    /*
     * Appends a new node at the end. This method is
     * defined inside LinkedList class shown above
     */
    public void append(int new_data) {
        /*
         * 1. Allocate the Node &
         * 2. Put in the data
         * 3. Set next as null
         */
        Node newNode = new Node(new_data);
        if (this.head == null) {
            // newNode.next = null;
            this.head = newNode;
            return;
        } else {
            Node pointer = this.head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = newNode;       
        }

        

        /*
         * 4. If the Linked List is empty, then make the
         * new node as head
         */
        // if (head == null) {
        //     head = new Node(new_data);
        //     return;
        // }

        /*
         * 4. This new node is going to be the last node, so
         * make next of it as null
         */
        // new_node.next is set as null already by Constructor
        // new_node.next = null; 

        /* 5. Else traverse till the last node */
        // Node last = head;
        // while (last.next != null)
        //     last = last.next;

        /* 6. Change the next of last node */
        // last.next = new_node;
        // return;
    }

    /*
     * This function prints contents of linked list starting from
     * the given node
     */
    public void printList() {
        Node pointer = this.head;
        System.out.print("[");
        while (pointer != null) {
            System.out.print(pointer.data);
            if (pointer.next != null)
                System.out.print(", ");
            pointer = pointer.next;
        }
        System.out.println("]");
    }

    /*
     * Driver program to test above functions.
     */
    public static void main(String[] args) {
        /* Start with the empty list */
        Exercise25 llist = new Exercise25(); // Linked List

        // Insert 6. So linked list becomes 6->NUllist
        llist.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.push(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.push(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);

        System.out.println("Created Linked list is: ");
        llist.printList();
    }
}