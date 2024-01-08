package practisebuilder;

import java.util.Objects;

public class Student {
  private String name;
  private int id;

  private Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public int getId() {
    return this.id;
  }

  public static Builder builder() {
    return new Student.Builder();
  }

  @Override 
  public String toString() {
    return "name=" + this.name + ", id=" + this.id;
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

  public static class Builder {
    private String name;
    private int id;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder id(int id) {
      this.id = id;
      return this;
    }

    public Student build() {
      return new Student(name, id);
    }

  }


}
