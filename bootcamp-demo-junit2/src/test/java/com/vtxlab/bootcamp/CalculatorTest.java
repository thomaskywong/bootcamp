package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
// import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.vtxlab.bootcamp.unittest.Calculator;


public class CalculatorTest {

  @Test // maven trigger this method during "test" phase
  void testAdd() {

    int actualResult = Calculator.add(3, 2);
    int expectResult = 5;

    // before static import
    // Assertions.assertEquals(expectResult, actualResult);

    // after static import
    assertEquals(expectResult, actualResult);

    // before static import
    // Assertions.assertNotEquals(6, Calculator.add(3,2));
    // Assertions.assertNotEquals(4, Calculator.add(3,2));

    // after static import
    assertNotEquals(6, Calculator.add(3, 2));

    String actualResult2 = Calculator.concat("Hello", "World");
    String expectedResult2 = "Hello World";

    // assertEquals()
    // check if the actual result is equals to the expected result
    assertEquals(expectedResult2, actualResult2);

    // assertNotEquals()
    // check if the actual result is not equals to the expected result
    assertNotEquals("HelloWorld", actualResult2);
    assertNotEquals("helloworld", actualResult2);
    assertNotEquals("Hello  World", actualResult2);

    // assertTrue
    // check if the boolean expression is true
    assertTrue(5 == Calculator.add(3, 2)); // true

    // assertFalse
    // check if the boolean expression is false
    assertFalse(4 > Calculator.add(3, 2) && Calculator.add(3, 2) < 6); // true
    // assertFalse(5 == Calculator.add(3,2)); // false


    // assertNull
    // check if the pointer is null
    String str = null;
    assertNull(str); // true

    // assertNotNull
    // check if the pointer is not null
    String str2 = "Thomas";
    assertNotNull(str2); // true
    // assertNotNull(str); // false

    // assertArrayEquals
    // check if two arrays are equals
    int[] expectArray = new int[] {1, 2, 3, 4, 5};
    int[] actualArray = new int[] {1, 2, 3, 4, 5};
    int[] otherArray = new int[] {2, 3, 4, 5, 2};
    assertArrayEquals(expectArray, actualArray); // true

    // assertSame -> what is the difference between assertSame and assertEquals
    // check if result object is the same as expected object (same object)
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    assertSame(c1, c1); // true

    // assertNotSame
    // check if result object is NOT the same as expected object (same object)
    assertNotSame(c2, c1);

    // assertNull
    // check if the pointer is null
    String str3 = null;
    assertNull(str3); // true

    // assertNotNull
    // check if the pointer is not null
    String str4 = "Thomas";
    assertNotNull(str4); // true
    // assertNotNull(str); // false

    // assertArrayEquals
    // check if two arrays are equals
    int[] expectArray2 = new int[] {1, 2, 3, 4, 5};
    int[] actualArray2 = new int[] {1, 2, 3, 4, 5};
    assertArrayEquals(expectArray2, actualArray2); // true

    // assertSame -> what is the difference between assertSame and assertEquals
    // check if two pointers point to the same object
    String s1 = "Thomas";
    String s2 = "Thomas";
    String s3 = "Joe";
    assertSame(s1, s2);
    // assertNotSame
    // check if two pointers do not point to the same object (different object)
    assertNotSame(s2, s3);
  
    // assertThrows
    // Check if the executable object throws the specific exception
    assertThrows(ArithmeticException.class, () -> System.out.println(10/0));
    
   // assertDoesNotThrow
   // Check if the executable object DOES NOT throws any exception
   assertDoesNotThrow(() -> System.out.println(10/1));

    // assertAll
    // report all failures from multiple assertion methods in lambda expressions
    assertAll(
      () -> assertArrayEquals(expectArray, actualArray),
      () -> assertNotNull(str2),
      () -> assertThrows(ArithmeticException.class, () -> System.out.println(10/0))
    );

    // assertTimeout
    // check if the given lambda expression code block runs longer than Duration.ofMillis(100) (> 100 ms)
    assertTimeout(Duration.ofMillis(100), () -> {
        Thread.sleep(50);
      }
    ); // true

    // assertTimeout(Duration.ofMillis(100), 
    // () -> {  Thread.sleep(101); }
    // ); // false
  

  }
}
