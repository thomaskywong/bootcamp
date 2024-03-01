package com.vtxlab.bootcamp;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppEncodeTest {
  
  @Mock
  private App2 dependency;  // no actual object created. pointer of 

  // @BeforeAll
  // void init() {
  //   dependency = mock(App2.class);
  //   when(dependency.encode('a')).thenReturn('B');
  //   when(dependency.encode('i')).thenReturn('J');
  //   when(dependency.encode('c')).thenReturn('D');
  //   when(dependency.encode('k')).thenReturn('L');
  //   // when(dependency.)
  // }

  @InjectMocks
  App1 app1;

  @Test
  void testFirstCharacter() {

    // Assumption: encode(char c) returns (char) c    

    // generate test case List<String>
    // user ensure all strings are NOT blank nor NULL


    // Assume encode() returns (char) string.charAt(0) + 1 (ie. A -> B, Y -> Z, Z -> A)
    // App1 app1 = new App1(dependency);

    // Set assumptions on encode() method results
    when(dependency.encode('a')).thenReturn('B');
    when(dependency.encode('i')).thenReturn('J');
    when(dependency.encode('c')).thenReturn('D');
    when(dependency.encode('k')).thenReturn('L');
    when(dependency.encode('i')).thenReturn('J');


    List<String> strings = new ArrayList<>(List.of("abc", "ijk", "cba", "kba", "ijk"));
    String result = app1.firstCharacters(strings);
    assertEquals("BJDLJ", result);

    verify(dependency, times(1)).encode('a');
    verify(dependency, times(2)).encode('i');
    verify(dependency, times(1)).encode('c');
    verify(dependency, times(1)).encode('k');



   
  }


}
