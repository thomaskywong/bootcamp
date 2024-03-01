package com.bootcamp.practise;

import java.time.LocalDate;

public class PractiseLombok {

  public static void main(String[] args) {
    
    Person p1 = new Person("Thomas", "Wong", LocalDate.of(1979, 1, 31));

    System.out.println(p1.getFirstName());
    System.out.println(p1.getLastName());
    System.out.println(p1.getBirthday());
    System.out.println(p1);

    p1.setFirstName("Tim");
    p1.setLastName("Lee");
    System.out.println(p1);

    Person p2 = new Person("Thomas", "Wong", LocalDate.of(1979, 1, 31));
    Person p3 = new Person("Thomas", "Wong", LocalDate.of(1979, 1, 31));

    System.out.println(p2.hashCode());
    System.out.println(p3.hashCode());

    System.out.println(p3.equals(p2));
    System.out.println(p3.equals(p1));






  }
  
}
