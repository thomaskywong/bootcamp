public abstract class Animal {   // abstract class. Cannot instantiated by new (No real object)
    
    // common attribute for Animal
    private int age;

    public Animal() {
        
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge(){
        System.out.println("super.getAge() is called.");
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
