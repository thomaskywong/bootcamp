import java.util.Objects;

public class Student {

  private String name;
  private int id;
  private static int counter = 202311000;

  public Student(String name){
    this.name = name;
    this.id = ++Student.counter;
  } 

  public String getName(){
    return this.name;
  }

  public int getId() {
    return this.id;
  }

  public static int getCounter(){
    return Student.counter;
  }

  @Override
  public String toString() {
    return  " " + this.name + "(" + this.id +")";
  }

  @Override
  public boolean equals(Object obj) {
    
    if (this == obj)
      return true;

    if (!(obj instanceof Student))
      return false;

    Student student = (Student) obj;

    return Objects.equals(this.name, student.getName()) 
           && Objects.equals(this.id, student.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.id);
  }
  
}
