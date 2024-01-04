package practiseinterfaces;

import java.util.Objects;

public class Cat {

  private String name;
  private int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override 
  public String toString() {
    return "Cat(name=" + this.name + ", age=" + this.age + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    
    if (!(obj instanceof Cat))
      return false;
    
    Cat cat = (Cat) obj;

    return Objects.equals(cat.getAge(), this.age) 
           && Objects.equals(cat.getName(), this.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }

}
