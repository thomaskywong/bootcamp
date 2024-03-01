package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// import java.beans.Transient;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testConcat() {

        String base = "hello";
        App app1 = new App();
        app1.setBase(base);
        
        assertEquals("helloworld", app1.concat("world"));

    }

    @Test
    public void testConcat2() {

        String base = "hello";
        App app1 = new App();
        app1.setBase(base);
        
        assertThrows(IllegalArgumentException.class, () -> app1.concat(null));
    }

    // @Test
    // public void shouldAnswerWithTrue()
    // {
    //     assertTrue( true );
    // }
}
