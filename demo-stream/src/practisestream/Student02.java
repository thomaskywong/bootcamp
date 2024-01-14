package practisestream;

import java.util.Objects;

public class Student02 {

  private int id;
  private String name;
  private static int idCounter = 1000;

  public Student02(String name) {
    Objects.requireNonNull(name);
    this.name = name;
    this.id = ++idCounter;
  }

  public int getId() {
    return this.id;
  }  
  
  public String getName() {
    return this.name;
  }
  
  @Override 
  public String toString() {
    return "name=" + this.name + ", id=" + this.id;
  }

}
