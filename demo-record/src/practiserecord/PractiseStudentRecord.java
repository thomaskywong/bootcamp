public class PractiseStudentRecord {
  public static void main(String[] args) {
    
    Student s1 = new Student("Wong", "Thomas", 1);
    Student s2 = new Student("Wong", "Constantine", 2);
    Student s3 = new Student("Wong", "Constantine", 2);

    // NO SETTER 
    //s1.setName() // compilation error

    // getter, no 'get' keyword. use attribute name directly
    System.out.println(s1.firstName()); // Thomas
    System.out.println(s1.lastName());  // Wong
    System.out.println(s1.id()); // 1

    // built-in @Override methods
    // toString()
    System.out.println(s1); // Student[lastName=Wong, firstName=Thomas, id=1]

    // hashCode()
    System.out.println(s1.hashCode()); // -1374159922
    System.out.println(s2.hashCode()); // -1622705065
    System.out.println(s3.hashCode()); // -1622705065

    // equals(obj)
    System.out.println(s1.equals(s2)); // false
    System.out.println(s3.equals(s2)); // true



  }
}
