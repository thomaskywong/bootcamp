package practiselinkedlist;

import java.util.Objects;

public class Node{
    private int key;
    private int val;
    Node next;
    Node prev;

    public Node() {

    }

    private Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    public int getKey() {
        return this.key;
    }

    public int getVal() {
        return this.val;
    }

    public Node getNext() {
        if (this.next != null) {
            return this.next;
        }
        return null;
    }

    public Node getPrev() {
        if (this.prev != null) {
            return this.prev;
        }
        return null;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setPrev(Node node) {
        this.prev = node;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public static Node add(int key, int val) {
        return new Node(key, val);
    }

    @Override
    public String toString(){
        return "Node(" + " key = " + this.key 
               + ", value = " + this.val + " )";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Node)) {
            return false;
        }
        Node node = (Node) obj;

        return Objects.equals(node.getKey(), this.key)
               && Objects.equals(node.getVal(), this.val)
               && Objects.equals(node.getNext(), this.next)
               && Objects.equals(node.getPrev(), this.prev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key, this.val, this.next, this.prev);
    } 

}




