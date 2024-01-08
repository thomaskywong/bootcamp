package practisebuilder;

public class DemoBuilder {

  public static void main(String[] args) {

    Student student1 = Student.builder().name("Thomas").id(1001).build();
    System.out.println(student1);

    Student student2 = Student.builder().name("Thomas").id(1001).build();
    System.out.println(student2);

    System.out.println(student2.equals(student1));
    System.out.println(student1.hashCode());
    System.out.println(student2.hashCode());


  }

}
