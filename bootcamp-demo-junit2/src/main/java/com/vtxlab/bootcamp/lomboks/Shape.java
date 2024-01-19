package com.vtxlab.bootcamp.lomboks;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class Shape {

  @EqualsAndHashCode.Exclude
  private String color;

  abstract double area();
  
}
