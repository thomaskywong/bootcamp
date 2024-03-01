package com.vtxlab.bootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class App1SpyTest {

  @Spy
  // @Mock
  private App2 app2; // For @Spy, during the UT, there is an objected created for app2

  @InjectMocks
  App1 app1;

  @Test
  void testMultiply() {

    // App1 app1 = new App1(app2);   // app2 is an actual object with method provider(x, y) and provider2(x, y)

    // If we just mock provider2(), provider() is still working normally (due to spy)
    when(app2.provider2(3, 10)).thenReturn(105);  // mock provider2(3,10) returns 105
    // when(app2.provider(3, 10)).thenReturn(4);

    // public int multiply(int x, int y) {
    // return this.app2.provider(x,y) + this.app2.provider2(x,y);
    // }

    int actual = app1.multiply(3, 10);    // provider(3, 10) returns 3 / 10 by @Spy, provider2(3,10) returns 105 by mock     
    
    // @Spy -> provider(x, y) yield actual result as app2 is an real object
    assertEquals(105, actual); // @Spy: actual provider(3, 10) returns 0, so that 3 / 10 + 105 = 105 -> true
    
    
    // @Mock -> provider(x,y) is mocked by when(   ).thenReturn( ) statements
    // assertEquals(109, actual); // @Mock: mock provider(3, 10) returns 4, so that 4 + 105 = 109 -> true


  }

}
