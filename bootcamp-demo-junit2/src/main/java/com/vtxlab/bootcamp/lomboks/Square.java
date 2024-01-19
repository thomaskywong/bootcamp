package com.vtxlab.bootcamp.lomboks;

import java.math.BigDecimal;
import lombok.EqualsAndHashCode; 
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class Square extends Shape {

  // @NonNull // !!! primitive never have NULL. Meaningless to use @NonNull on primitive
  private final double length;

  @Override
  public double area() {

    return BigDecimal.valueOf(this.length)
        .multiply(BigDecimal.valueOf(this.length)).doubleValue();

  }

  public static void main(String[] args) {
    Square sq1 = new Square(10);
    System.out.println(sq1);
    sq1.setColor("Blue");
    System.out.println(sq1);
    System.out.println(sq1.getColor());
    System.out.println(sq1.getLength());

    Square sq2 = Square.builder()//
        .color("Green")//
        .length(20).build();
    System.out.println(sq2);

    Square sq3 = Square.builder()//
        .color("Green")//
        .length(20).build();

    System.out.println(sq2.hashCode());
    System.out.println(sq3.hashCode());
    System.out.println(sq2.equals(sq3));

    Square sq4 = Square.builder()//
        .color("White")//
        .length(20).build();
    System.out.println(sq4.equals(sq3)); // true even color is different. @EqualsAndHashCode.Exclude at attribute

    

  }

}
