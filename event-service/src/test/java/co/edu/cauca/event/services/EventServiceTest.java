/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.cauca.event.services;

import co.edu.cauca.event.domain.Event;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author earea
 */
public class EventServiceTest {
    
    public EventServiceTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findAll method, of class EventService.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        EventService instance = new EventService();
        List<Event> expResult = null;
        List<Event> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class EventService.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = null;
        EventService instance = new EventService();
        Event expResult = null;
        Event result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class EventService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Event event = null;
        EventService instance = new EventService();
        Event expResult = null;
        Event result = instance.create(event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EventService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Long id = null;
        Event event = null;
        EventService instance = new EventService();
        Event expResult = null;
        Event result = instance.update(id, event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteById method, of class EventService.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        Long id = null;
        EventService instance = new EventService();
        instance.deleteById(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
