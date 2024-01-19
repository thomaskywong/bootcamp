package com.vtxlab.bootcamp.lomboks;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
// @AllArgsConstructor // name?
@RequiredArgsConstructor // Use either @AllArgsConstructor or @RequiredArgsConstructor + @NonNull on field
@NoArgsConstructor
@ToString(callSuper = true) // name? age?
@EqualsAndHashCode(callSuper = true) // name? age?
@SuperBuilder // name? age? - use @SuperBuilder on all parents
// @Builder

public class Developer extends Staff {
  
  @NonNull
  private List<String> skills;


  // No Argument Constructor
  // public Developer(){

  // }

  // ALL Argument Constructor
  // public Developer(List<String> skills) {
  //   this.skills = skills;
  // }

  public static void main(String[] args) {

   Developer developer = new Developer();
   System.out.println(developer);



     Developer developer2 =
        new Developer(new ArrayList<>(List.of("Java", "MySQL")));
    System.out.println(developer2);

    // System.out.println(developer2.toString()); // Developer(super=Staff(super=Person(name=null, age=0), id=0), skills=[Java, MySQL])

    // @Getter and @Setter shall be in parent's class.
    //developer.getId();

    // Developer developer3 = Developer.builder()//
    //     .name("test")// Person
    //     .age(111)// Person
    //     .id(1)// Staff
    //     .build();

    // System.out.println(developer3.getName());
  }

}
