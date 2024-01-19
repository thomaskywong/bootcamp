package com.vtxlab.bootcamp.lomboks;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString // (onlyExplicitlyIncluded = true) // Shall display only the field with @ToString.Include
@EqualsAndHashCode

public class Cat {

  @Getter
  @Setter
  // @EqualsAndHashCode.Exclude // Exclude weight being tested by .equals and .hashCode
  private double weight;

  @Getter
  private String name;

  @Getter
  // @ToString.Include
  private int age;

  public static void main(String[] args) {
    
    Cat cat = new Cat(3.2, "ABC", 6);
    System.out.println(cat.getWeight() + " " + cat.getName());
    cat.setWeight(3.9);

    Cat cat2 = new Cat(3.4, "ABC", 6);
    System.out.println(cat2.equals(cat));

    System.out.println(cat2.toString());
  }
  
}
