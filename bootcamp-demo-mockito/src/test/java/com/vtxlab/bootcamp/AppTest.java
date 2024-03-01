package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


/**
 * Unit test for simple App.
 */

 @ExtendWith(MockitoExtension.class)
public class AppTest {

    @Mock
    private App2 dependency; // no new object here! We didn't create object

    // case 1: x <= 10, y < 20 -> (10, 19)
    // case 2: x <= 10, y >= 20 -> (10, 20)
    // case 3: x > 10, y < 20 -> (11, 19)
    // case 4: x > 10, y >= 20 -> (11, 20)

    // int result = this.app2.provider(x * 2, y);
    //
    // if (x > 10 && y < 20) {
    // return result + 1000;
    // }
    // return result + 500;

    @InjectMocks
    App1 app1;

    @Test
    void testAdd1() {
        // Assumption: if someone call dependency.provider(20,19), return 100 (always assume return 100)
        // Case 1: x <= 10, y < 20 (x = 10, y = 19)
        int x = 10;
        int y = 19;

        Mockito.when(dependency.provider(20, 19)).thenReturn(100);

        // hidden due to @InjectMocks
        // App1 app1 = new App1(dependency);

        // actual call unit test start point
        int result2 = app1.add(x, y); // 100 + 500
        assertEquals(600, result2);
        assertNotEquals(599, result2);
        assertNotEquals(601, result2);
    }

    // case 1: x <= 10, y < 20 -> (10, 19)
    // case 2: x <= 10, y >= 20 -> (10, 20)
    // case 3: x > 10, y < 20 -> (11, 19)
    // case 4: x > 10, y >= 20 -> (11, 20)

    // int result = this.app2.provider(x * 2, y);
    //
    // if (x > 10 && y < 20) {
    // return result + 1000;
    // }
    // return result + 500;

    @Test
    void testAdd2() {
        // Assumption: if someone call dependency.provider(20,20), return 100 (always assume return 100)
        // case 2: x <= 10, y >= 20 -> (10, 20)
        Mockito.when(dependency.provider(20, 20)).thenReturn(100);

        //
        // App1 app1 = new App1(dependency);

        // actual call unit test start point
        int result2 = app1.add(10, 20); // 100 + 500

        assertEquals(600, result2);
        assertNotEquals(599, result2);
        assertNotEquals(601, result2);
    }

    // case 1: x <= 10, y < 20 -> (10, 19)
    // case 2: x <= 10, y >= 20 -> (10, 20)
    // case 3: x > 10, y < 20 -> (11, 19)
    // case 4: x > 10, y >= 20 -> (11, 20)

    // int result = this.app2.provider(x * 2, y);
    //
    // if (x > 10 && y < 20) {
    //    return result + 1000;
    // }
    // return result + 500;

    @Test
    void testAdd3() {
        // Assumption: if someone call dependency.provider(22,19), return 100 (always assume return 100)
        // case 3: x > 10, y < 20 -> (11, 19)
        Mockito.when(dependency.provider(22, 19)).thenReturn(100);

        //
        // App1 app1 = new App1(dependency);

        // actual call unit test start point
        int result2 = app1.add(11, 19); // 100 + 1000

        assertEquals(1100, result2);
        assertNotEquals(1099, result2);
        assertNotEquals(1101, result2);
    }

    // case 1: x <= 10, y < 20 -> (10, 19)
    // case 2: x <= 10, y >= 20 -> (10, 20)
    // case 3: x > 10, y < 20 -> (11, 19)
    // case 4: x > 10, y >= 20 -> (11, 20)

    // public int add(int x, int y) {
    // int result = this.app2.provider(x * 2, y);
    //
    // if (x > 10 && y < 20) {
    //    return result + 1000;
    // }
    // return result + 500;
    // }

    @Test
    void testAdd4() {
        // Assumption: if someone call dependency.provider(22,19), return 100 (always assume return 100)
        // case 4: x > 10, y >= 20 -> (11, 20)
        Mockito.when(dependency.provider(22, 20)).thenReturn(100);

        //
        // App1 app1 = new App1(dependency);

        // actual call unit test start point
        int result2 = app1.add(11, 20); // 100 + 500

        assertEquals(600, result2);
        assertNotEquals(599, result2);
        assertNotEquals(601, result2);
    }
}
