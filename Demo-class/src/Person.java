// Person Class is a blueprint to product a person
public class Person {

    private String name;      // null
    private int age;          // 0

    // Constructor (instantiate a Person's object)
    // default Constructor
    public Person() {}

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public Person(String name) {
      this.name = name;
      this.age = 0;
    }



    // Instance Method (name setter)
    public void setName(String name) {
      this.name = name;
    }

    // getName (name getter)
    public String getName() {
      return name;
    }
}
