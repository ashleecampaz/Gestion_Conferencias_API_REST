/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.cauca.event.domain;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author earea
 */
public class ChairTest {
    
    public ChairTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Chair.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Chair instance = new Chair();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
