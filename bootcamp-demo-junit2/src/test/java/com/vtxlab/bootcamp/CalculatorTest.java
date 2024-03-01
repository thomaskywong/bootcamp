package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.vtxlab.bootcamp.lomboks.Order;
import com.vtxlab.bootcamp.lomboks.Person;
import com.vtxlab.bootcamp.unittest.Calculator;

// PER_METHOD by default. @TestInstance(TestInstance.Lifecycle.PER_METHOD) is not required
// @TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CalculatorTest {

  private int count;

  private static int z = 50;

  // TestInstance.Lifecycle.PER_METHOD -> the meaning of @BeforeEach
  // Before each instance of test method, initial state attribute value count = 10;
  @BeforeEach
  void initialize() {
    this.count = 10;
    System.out.println("PER_METHOD: BeforeEach this.count=" + this.count);
  }

  @BeforeAll // perform one once before running all methods of the same class.
  static void beforeAll() { // must be static
    // ececute one time only
    z += 10;
    System.out.println("PER_METHOD: BeforeAll z=" + z);
  }

  @AfterEach
  void tearDown() {
    this.count = 0;
    System.out.println("PER_METHOD: AfterEach this.count=" + this.count);
  }


  @AfterAll
  static void tearDown2() {
    CalculatorTest.z = 0;
    System.out.println("PER_METHOD: AfterAll z=" + CalculatorTest.z);
  }

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

    Person p1 = new Person("Thomas", 65);
    assertTrue(p1.isElderly());
    assertTrue(new Person("Tom", 70).isElderly());


    // assertFalse
    // check if the boolean expression is false

    assertFalse(4 > Calculator.add(3, 2) && Calculator.add(3, 2) < 6); // true
    // assertFalse(5 == Calculator.add(3,2)); // false

    Person p2 = new Person("Emily", 64);
    assertFalse(p2.isElderly());
    assertFalse(new Person("Emily", 30).isElderly());

    // assertNull
    // check if the pointer is null

    String str = null;
    assertNull(str); // true
    assertNull(Person.of(null, 45));

    // assertNotNull
    // check if the pointer is not null

    String str2 = "Thomas";
    assertNotNull(str2); // true
    // assertNotNull(str); // false

    assertNotNull(Person.of("Thomas", 45));
    // assertNotNull(Person.of(null, 45));


    // assertArrayEquals
    // check if two arrays are equals
    int[] expectArray = new int[] {1, 2, 3, 4, 5};
    int[] actualArray = new int[] {1, 2, 3, 4, 5};
    int[] otherArray1 = new int[] {2, 3, 4, 5, 1};
    int[] otherArray2 = new int[] {2, 3, 4, 5, 2};

    assertArrayEquals(expectArray, actualArray); // true
    // assertArrayEquals(expectArray, otherArray1); // false
    // assertArrayEquals(expectArray, otherArray2); // false


    // assertSame -> what is the difference between assertSame and assertEquals
    // check if result object is the same as expected object (same object)
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    assertSame(c1, c1); // true

    // assertNotSame
    // check if result object is NOT the same as expected object (same object)
    assertNotSame(c2, c1);

    Person p3 = new Person("Thomas", 10);
    Person p4 = new Person("Thomas", 10);

    assertNotSame(p3, p4); // true
    assertEquals(p3, p4); // true


    // assertNull
    // check if the pointer is null
    String str3 = null;
    assertNull(str3); // true

    assertNull(Person.concat(null, null)); // true

    // assertNotNull
    // check if the pointer is not null
    String str4 = "Thomas";
    assertNotNull(str4); // true
    // assertNotNull(str); // false



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
    assertThrows(IllegalArgumentException.class,
        () -> Person.concat2(null, null));

    // assertDoesNotThrow
    // Check if the executable object DOES NOT throws any exception
    assertDoesNotThrow(() -> Person.concat2("Thomas", null));

    // assertAll
    // report ANY failure from multiple assertion methods in lambda expressions
    assertAll(() -> assertArrayEquals(expectArray, actualArray),
        () -> assertNotNull(str2));

    // ensure the sequence of method execution. The object has states
    Order o1 = new Order();
    Order o2 = new Order();

    assertAll(() -> assertTrue(o1.order()), () -> assertTrue(o1.payment()),
        () -> assertTrue(o1.lockInventory()));

    // false, since the sequence of actions is wrong!
    // assertAll(
    // () -> assertTrue(o2.payment()),
    // () -> assertTrue(o2.order()),
    // () -> assertTrue(o2.lockInventory())
    // );


    // assertTimeout
    // Check runtime
    // check access database timeout
    // check if the given lambda expression code block runs longer than Duration.ofMillis(100) (> 100 ms)
    assertTimeout(Duration.ofMillis(100), () -> {
      Thread.sleep(50);
    }); // true

    List<String> items = new ArrayList<>();
    for (int i = 0; i < 10_000_000; i++) {
      items.add(String.valueOf(i));
    }

    assertTimeout(Duration.ofMillis(100), () -> o1.placeOrder(items));

    // assertTimeout(Duration.ofMillis(100),
    // () -> { Thread.sleep(101); }
    // ); // false

    // assertArrayEquals
    // check if two arrays are equals
    int[] expectArray2 = new int[] {1, 2, 3, 4, 5};
    int[] actualArray2 = new int[] {1, 2, 3, 4, 5};
    assertArrayEquals(expectArray2, actualArray2); // true

    count++;
    System.out.println("(testAdd()) count=" + count);

  }

  @Test // tell maven to indicate which method will be included for maven test
  void testOther() {
    assertTrue(5 > 3);
    count++;
    System.out.println("(testOther()) count=" + count);
  }

  // // Actual what is being done in unit test
  // public static void main(String[] args) {

  // CalculatorTest calculator1 = new CalculatorTest();
  // calculator1.testAdd();
  // System.out.println(calculator1.count);

  // // by default, the maven will generate a new object for each @Test test method
  // CalculatorTest calculator2 = new CalculatorTest();
  // calculator2.testOther();
  // System.out.println(calculator2.count);

  // }

}
