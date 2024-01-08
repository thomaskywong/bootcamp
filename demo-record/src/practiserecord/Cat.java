import java.util.Objects;

public record Cat (String name) {

  // add static variable
  private static String ownerName;

  // add additional checking logic in Constructor
  public Cat {
    Objects.requireNonNull(name);
    if (name.isBlank())
      throw new IllegalArgumentException("Name cannot be blank");
  }


  // Able to add static method
  public static void setOwnerName(String name) {
    Objects.requireNonNull(name);
    Cat.ownerName = name;
  }
  
  public static String getownerName() {
    return Cat.ownerName;
  }

  // Able to add instance method
  public void print() {
    System.out.println("The name of cat = " + name);
  }

}
