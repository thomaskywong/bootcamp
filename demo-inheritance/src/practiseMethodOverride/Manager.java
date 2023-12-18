package practiseMethodOverride;

public class Manager extends Employee{

  private Manager(String name, int id) {
    super(name, id);
  }
  
  public static Employee managerOf(String name, int id) {
    return new Employee(name,id);    
  }

  // Override getName()
  // rules of overriding
  // 1. Access modifier, can only be same or wider (protected -> public) (protected x-> private)
  // 2. return type can be the same type or down cast (more specific) to child class type
  // 3. Signature has to be the same
  // 4. use @Override to notice the method is overriding the parent's method
  // Important: override method could have "more open access level" and "more specific retur type" 
  @Override
  //private String getName() {  // Invalid! less open access level (compilation error)
  //public CharSequence getName() { // valid
  // public CharSequence getName(int age) { // invalid, different signature (compilation error) 
  public String getName() { // valid, more specific return type
    return this.getName();
  } 

}
