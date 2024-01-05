  
/*
 * ------ Output ------
 * [Class A] Beginning of object creation
 * [Class A] Calling private static method
 * [Class A] Calling static initialization block
 * [Class A] Calling private method
 * [Class A] Calling initialization block
 * [Class A] Calling constructor
 * [Class A] End of object creation
 */
public class Exercise16 {
    public static void main(String[] args) {
        System.out.println("[Class A] Beginning of object creation");
        ClassA objectA = new ClassA();
        System.out.println("[Class A] End of object creation");
    }
}

