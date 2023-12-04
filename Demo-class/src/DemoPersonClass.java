public class DemoPersonClass {

  public static void main(String[] args) {
    
    Person person1 = new Person();

    person1.setFirstName("Thomas");
    person1.setLastName("Wong");
    System.out.println(person1.getFirstName());
    System.out.println(person1.getFullName());

    Person person2 = new Person();
    //person2.setFullName("Thomas", "Wong");
    System.out.println("person2's full name: " + person2.getFullName());

    Person person3 = person1;
    person3.setFirstName("Tommy");
    System.out.println(person1.getFullName());
    System.out.println(person3.getFullName());

    person2.setFullName("Peter", "Kwan");
    System.out.println(person2.getFullName());
    person2 = person1;
    System.out.println(person1.getFullName());


    Person person4 = new Person("Thomas", "Leung");
    System.out.println("person4's full name = " + person4.getFullName());
    
    Person person5 = new Person("thomas", "wong", 44);
    System.out.println("person5's full name = " + person5.getFullName2());
    System.out.println("person5's age = " + person5.getAge());

    Person testcase = new Person("Abc", "Def");
    System.out.println(testcase.getFullName(true));
    System.out.println(testcase.getFullName(false));


  }    

  
}
