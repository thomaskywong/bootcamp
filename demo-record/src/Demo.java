public class Demo {

  public static void main(String[] args) {

    // Constructor in record
    // only all-argument constructor is allowed
    Student2 student1 = new Student2("John", 20);
    Student2 student2 = new Student2("John", 20);

    // Getter use attribute name
    System.out.println(student1.name());

    // No setter. Since attributes are final
    // student.setName();

    // toString()
    System.out.println(student1);


    // equals()
    System.out.println(student1.equals(student2)); // true

    // hashCode()
    System.out.println(student1.hashCode());
    System.out.println(student2.hashCode());

    // normal class
    Student3 student3 = new Student3("John", 20);
    Student3 student4 = new Student3("John", 20);

    System.out.println(student3.name());

    System.out.println(student3);

    System.out.println(student3.equals(student4));

    System.out.println(student3.hashCode());
    System.out.println(student4.hashCode());



  }

}
