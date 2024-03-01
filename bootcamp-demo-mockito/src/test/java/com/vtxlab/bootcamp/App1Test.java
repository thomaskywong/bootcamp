package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class App1Test {

  @Mock
  private App2 dependency; // we didn't create object

  // App1 is not required to be new.
  // @InjectMock 
  // 1. generate and call App1 all argument constructor, inject mock App2 (fake object) 
  // 2. instantiate App1 object for calling App1 methods
  // Could be used to clean up coding in @Test methods "App1 app1 = new app1(dependency2);"

  @InjectMocks
  private App1 app1;

  @Test
  void testAdd_whenApp2ProviderMethodAlwaysReturn100() {
    // Case 1: x > 10 && y < 20
    int x = 11, y = 19;

    // if someone call dependency.provider(20, 19), return -100
    Mockito.when(dependency.provider(22, 19)).thenReturn(100);

    // by @InjectMock
    // App1 app1 = new App1(dependency);

    // actual call (unit test start point)
    int result = app1.add(x, y);

    // the case is actually testing the rest of the logic (+1000)
    assertEquals(1100, result);

  }

  @Test
  void testAdd_Case2() {
    // Case 2: x <= 10 && y < 20
    Mockito.when(dependency.provider(18, 19)).thenReturn(100);

    // by @InjectMock
    // App1 app1 = new App1(dependency);

    int result = app1.add(9, 19); // 100 + 500
    assertEquals(600, result);
  }

  @Test
  void testAdd_Case3() {
    // Case 3: x <= 10 && y >= 20
    Mockito.when(dependency.provider(18, 20)).thenReturn(100);

    // @InjectMocks
    // App1 app1 = new App1(dependency);
    
    int result = app1.add(9, 20); // 100 + 500
    assertEquals(600, result);
  }

  @Test
  void testAdd_Case4() {
    // Case 4: x > 10 && y >= 20
    Mockito.when(dependency.provider(22, 20)).thenReturn(100);

    // by @InjectMock
    // App1 app1 = new App1(dependency);

    int result = app1.add(11, 20); // 100 + 500
    assertEquals(600, result);
  }



}
