public interface Vehicle {  // interface is an abstract class by default

    // interface has NO instance variable
    // interface has NO implementation
    // interface is a contract with 100% abstract behaviors (abstract methods)
    // interface is a contract with abstract behaviors (abstract methods) by default
    // if a class implements an interface, it has to implement all its abstract methods
    // (all or nothing)

    // interface does not have instance variable. Only static final variable
    int x = 10;     // implicitly public static final 
    // int y;       

    boolean start();       // implicityly public abstract method

    boolean stop();

    boolean accelerate();

    boolean brake();
    
    public static void main(String[] args) {
        System.out.println(Vehicle.x);
    }





}
