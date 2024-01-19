package com.vtxlab.bootcamp.lomboks;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.AllArgsConstructor;
// import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@Setter
@AllArgsConstructor // may not requires since builder is available for assigning parameter
// @RequiredArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
// @Builder  // use @SuperBuild for child class(es) as well as parent class
@SuperBuilder  // required for class being inherited by child class(es)
public class Person {
  
  // @NonNull
  private String name;
  
  private int age;
 
  // public Person(String name, int age) {
  //   this.name = name;
  //   this.age = age;
  // }

  // public String getName() {
  //   return this.name;
  // }

  // public void setName(String name) {
  //   this.name = name;
  // }

  // public int getAge() {
  //   return this.age;
  // }
  // public void setAge(int age) {
  //   this.age = age;
  // }
  
  public static void main(String[] args) {
    
    Person person = new Person();

    // setters
    person.setAge(30);
    person.setName("John");
    
    // getters
    System.out.println(person.getName() + " " + person.getAge()); // John 30

    Person person2 = new Person("Mary", 20);
    System.out.println(person2.getAge());

    // .toString()
    System.out.println(person.toString());
    System.out.println(person2.toString());

    // .equals()
    Person person3 = new Person("John", 30);
    System.out.println(person.equals(person3)); // true

    // .hashCode()
    System.out.println(person.hashCode());
    System.out.println(person3.hashCode());

    // Builder - call setter
    Person person4 = Person.builder()
                           .name("Thomas")
                           .age(44)
                           .build();
    System.out.println(person4);
  }
}
