package practisecomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

  private int id;
  private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "id=" + this.id + ", name=" + this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Student)) {
      return false;
    }

    Student student = (Student) obj;

    return Objects.equals(student.getId(), this.id) 
           && Objects.equals(student.getName(), this.name);
  }

  @Override 
  public int hashCode() {
    return Objects.hash(this.id, this.name);
  }

  @Override
    public int compareTo(Student obj) {
    if (obj.getName().compareTo(this.name) > 0) {
      return -1;
    } else if (obj.getName().compareTo(this.name) == 0) {
      if (obj.getId() > this.id) {
        return -1;
      } else {
        return 1;
      }
    } else {
      return 1;
    }
  // public int compareTo(Student obj) {
  //   if (obj.getId() > this.id) {
  //     return -1;
  //   } else if (obj.getId() == this.id) {
  //     if (obj.getName().compareTo(this.name) > 0) {
  //       return -1;
  //     } else {
  //       return 1;
  //     }
  //   } else {
  //     return 1;
  //   }
  }

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student(1001, "Thomas"));
    students.add(new Student(1003, "Percy"));
    students.add(new Student(1000, "Emily"));
    students.add(new Student(1010, "Thomas"));
    students.add(new Student(1008, "Gordon"));

    System.out.println(students); // [id=1001, name=Thomas, id=1003, name=Percy, id=1000, name=Emily, id=1010, name=Thomas, id=1008, name=Gordon]

    // Sort by comparable
    // call Collections.sort(List<T> list)
    Collections.sort(students); 

    System.out.println(students); // [id=1000, name=Emily, id=1008, name=Gordon, id=1003, name=Percy, id=1001, name=Thomas, id=1010, name=Thomas]
    
    // Sort by comparator
    // call Collections.sort(List<T> list, Comparator<T> comparator)
    SortById sortId = new SortById();
    SortByName sortName = new SortByName();

    Collections.sort(students, sortId);
    System.out.println(students); // [id=1000, name=Emily, id=1001, name=Thomas, id=1003, name=Percy, id=1008, name=Gordon, id=1010, name=Thomas]

    Collections.sort(students, sortName);
    System.out.println(students); // [id=1000, name=Emily, id=1008, name=Gordon, id=1003, name=Percy, id=1001, name=Thomas, id=1010, name=Thomas]


  }


}
