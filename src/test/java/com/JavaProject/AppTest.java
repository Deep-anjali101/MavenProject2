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
        App myCalc= new App();
        assertEquals(25, myCalc.multiplyNumbers(5, 5));
    }

   @Test
    public void subtractTest()
    {
       App myCalc= new App();
        assertEquals(5, myCalc.subtractNumbers(10, 5)); // Changing the parameter here to change functionality
    }
}

