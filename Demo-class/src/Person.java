// Person Class is a blueprint to product a person
public class Person {

  private String firstName; // null
  private String lastName; // null
  private int age; // default 0

  // Constructor (instantiate a Person's object)
  // default Constructor
  public Person() {
    this.firstName = "";
    this.lastName = "";
  }

  public Person(String firstName) {
    this.firstName = firstName;
    this.lastName = "";

  }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  // Instance Method (name setter)
  public void setFullName(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // getName (name getter)
  public String getFirstName() {
    return this.firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // getName (name getter)
  public String getLastName() {
    return this.lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getFullName(boolean isCap) {
    String name = this.firstName.concat(" ").concat(this.lastName);
    return isCap ? name.toUpperCase() : name.toLowerCase();
  }

    // getName (name getter)
  // public String getFullName() {
  //   return this.firstName.concat(" ").concat(this.lastName);
  // }

  // 
  public String getFullName2() {
    return String.valueOf(this.firstName.charAt(0)).toUpperCase()
      .concat(this.firstName.substring(1,this.firstName.length()))
      .concat(" ")
      .concat(String.valueOf(this.lastName.charAt(0)).toUpperCase())
      .concat(this.lastName.substring(1,this.lastName.length()));
  }

  public String getFullName() {
    if (this.lastName == null)
      return this.firstName;
      
    return this.lastName.isEmpty() ? this.firstName 
      : this.firstName.concat(" ").concat(this.lastName); 
  }


  
}
