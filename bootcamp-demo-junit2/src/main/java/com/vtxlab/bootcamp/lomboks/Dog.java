package com.vtxlab.bootcamp.lomboks;

// import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor // work with NonNull
@ToString
// @AllArgsConstructor // Use either @RequiredArgsConstructor or @AllArgsConstructor

public class Dog {

  @NonNull // requires non null object
  private String firstname;

  private final String lastName = "Lee";

  @NonNull // requires non null object
  private String color;
  
  public static void main(String[] args) {
    
    Dog dog = new Dog("Tom","White");

    System.out.println(dog);

    Dog dog2 = new Dog(null, "Red");
    System.out.println(dog2);

    Dog dog3 = new Dog("Tim", null);
    System.out.println(dog3);
    

  }
}
