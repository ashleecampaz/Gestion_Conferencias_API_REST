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
public class ResearcherTest {
    
    public ResearcherTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getResearcher_id method, of class Researcher.
     */
    @Test
    public void testGetResearcher_id() {
        System.out.println("getResearcher_id");
        Researcher instance = new Researcher();
        Long expResult = null;
        Long result = instance.getResearcher_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
