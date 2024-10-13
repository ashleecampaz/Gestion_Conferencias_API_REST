/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.cauca.event.presentation;

import co.edu.cauca.event.domain.Event;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author earea
 */
public class EventControllerTest {
    
    public EventControllerTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findAll method, of class EventController.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        EventController instance = new EventController();
        List<Event> expResult = null;
        List<Event> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class EventController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Event event = null;
        EventController instance = new EventController();
        Event expResult = null;
        Event result = instance.create(event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventById method, of class EventController.
     */
    /**@Test
    public void testGetEventById() {
        System.out.println("getEventById");
        Long id = null;
        EventController instance = new EventController();
        Event expResult = null;
        Event result = instance.getEventById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
