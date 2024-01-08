import java.util.Objects;

public class Student3 {

  private final String name;
  private final int id;

  public Student3(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String name() {
    return this.name;
  }

  public int id(){
    return this.id;
  }

  @Override
  public String toString() {
    return "Student3[name=" 
            + this.name 
            + ", id=" 
            + this.id + "]";
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    
    if(!(obj instanceof Student3))
      return false;

    Student3 student = (Student3) obj;

    return Objects.equals(this.name, student.name()) 
           && Objects.equals(this.id, student.id());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name, this.id);
  }


  
}
