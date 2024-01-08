public class PractiseRecord {

  public static void main(String[] args) {

    Cat c1 = new Cat("Tom");
    Cat c2 = new Cat("Jerry");
    Cat c3 = new Cat("Tom");

    System.out.println(c1.equals(c3));
    System.out.println(c1.hashCode());
    System.out.println(c3.hashCode());

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    Cat.setOwnerName("Thomas");
    System.out.println(Cat.getownerName());

    c1.print();
  }

}
