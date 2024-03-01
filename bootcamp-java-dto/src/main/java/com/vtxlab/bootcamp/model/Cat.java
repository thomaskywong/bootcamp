package com.vtxlab.bootcamp.model;

import java.util.Objects;

public class Cat {

  private String name;

  private int age;

  // private int id;

  // private static int idCount = 0;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
    // this.id = ++idCount;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // public int getId() {
  // return id;
  // }
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

    return Objects.equals(cat.getName(), this.name)
        && Objects.equals(cat.getAge(), this.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }

}
