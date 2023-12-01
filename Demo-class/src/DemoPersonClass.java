public class DemoPersonClass {

  public static void main(String[] args) {
    
    Person person1 = new Person();

    person1.setName("Thomas");
    System.out.println(person1.getName());

    Person person2 = new Person();
    person2.setName("Thomas");
    System.out.println(person2.getName());

    Person person3 = person1;
    person3.setName("Tommy");
    System.out.println(person1.getName());
    System.out.println(person3.getName());

    person2.setName("Peter");
    System.out.println(person2.getName());
    person2 = person1;
    System.out.println(person1.getName());

  }    

  
}
