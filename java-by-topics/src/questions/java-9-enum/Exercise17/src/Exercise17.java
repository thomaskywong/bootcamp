/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level2 myVar = Level2.MEDIUM;

        // Write a switch statement to print the expected output.
        switch (myVar.getValue()) {
            case 1:
                System.out.println("This is Low Level");
                System.out.println("enum is " + myVar.name() + ", and its value is " + myVar.getValue());
                break;
            case 2:
                System.out.println("This is Medium Level");
                System.out.println("enum is " + myVar.name() + ", and its value is " + myVar.getValue());
                break;
            case 3:
                System.out.println("This is High Level");
                System.out.println("enum is " + myVar.name() + ", and its value is " + myVar.getValue());
                break;
            default:
        }
    
    }
}