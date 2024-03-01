package practiselocalinnerclass;

public class LocalInnerClass {

  public static void main(String[] args) {

    int age = 100;

    class Elderly {
      boolean isElderly;

      public Elderly(int age) {
        this.isElderly = age >= 65;
      }

      public void print() {
        System.err.println("age=" + age + ", isElderly=" + isElderly);
      }
    }

    Elderly elderly1 = new Elderly(age);
    elderly1.print();

  }

}
