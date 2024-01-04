package streamdemo;

import java.util.Objects;

public class Dog {

  private String name;
  private int age;


  // public Cat() {
  //   this.name = "";
  //   this.age = 0;
  // }

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  // public void setName(String name) {
  //   this.name = name;
  // }

  public int getAge() {
    return this.age;
  }

  // public void setAge(int age) {
  //   this.age = age;
  // }

  @Override 
  public String toString() {
    return "Dog(name=" + this.name + ", age=" + this.age + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Dog))
      return false;
    
    Dog cat = (Dog) obj;

    return Objects.equals(cat.getName(), this.name) 
           && Objects.equals(cat.getAge(), this.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }



}
