package practisecomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

  private int id;

  public Student(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  @Override
  public String toString() {
    return "id=" + this.id;
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

    return Objects.equals(student.getId(), this.id);
  }

  @Override 
  public int hashCode() {
    return Objects.hash(this.id);
  }

  @Override
  public int compareTo(Student obj) {

    return obj.getId() > this.id ? -1 : 1; // accending
  }

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student(1001));
    students.add(new Student(1003));
    students.add(new Student(1000));
    students.add(new Student(1010));
    students.add(new Student(1008));

    System.out.println(students); // 1001, 1003, 1000, 1010, 1008

    // call Collections.sort(List<T> list)
    Collections.sort(students);

    System.out.println(students); // 1000, 1001, 1003, 1008, 1010



  }


}
