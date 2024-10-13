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
public class EventTest {
    
    public EventTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Event.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Event instance = new Event();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Event.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Event instance = new Event();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Event.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Event instance = new Event();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChair method, of class Event.
     */
    /**@Test
    public void testGetChair() {
        System.out.println("getChair");
        Event instance = new Event();
        Chair expResult = null;
        Chair result = instance.getChair();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
