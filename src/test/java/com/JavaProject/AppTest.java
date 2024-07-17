package com.JavaProject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.*;

// import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 * 
 */
public class AppTest 

{
   @Test
    public void multiplyTest()
    {
       
        assertEquals(50, App.multiplyNumbers(10, 5));
    }

   @Test
    public void subtractTest()
    {
      
        assertEquals(5, App.subtractNumbers(10, 5)); // Changing the parameter here to change functionality
    }
}

