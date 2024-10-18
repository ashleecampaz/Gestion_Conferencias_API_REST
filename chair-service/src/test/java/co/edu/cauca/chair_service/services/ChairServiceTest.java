/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.cauca.chair_service.services;

import co.edu.cauca.chair_service.domain.Chair;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author earea
 */
public class ChairServiceTest {
    
    public ChairServiceTest() {
    }

    /**
     * Test of findAll method, of class ChairService.
     */
    @org.junit.Test
    public void testFindAll() {
        System.out.println("findAll");
        ChairService instance = new ChairService();
        List<Chair> expResult = null;
        List<Chair> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class ChairService.
     */
    @org.junit.Test
    public void testFindById() {
        System.out.println("findById");
        Long id = null;
        ChairService instance = new ChairService();
        Chair expResult = null;
        Chair result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ChairService.
     */
    @org.junit.Test
    public void testCreate() {
        System.out.println("create");
        Chair chair = null;
        ChairService instance = new ChairService();
        Chair expResult = null;
        Chair result = instance.create(chair);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ChairService.
     */
    @org.junit.Test
    public void testUpdate() {
        System.out.println("update");
        Long id = null;
        Chair chair = null;
        ChairService instance = new ChairService();
        Chair expResult = null;
        Chair result = instance.update(id, chair);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteById method, of class ChairService.
     */
    @org.junit.Test
    public void testDeleteById() {
        System.out.println("deleteById");
        Long id = null;
        ChairService instance = new ChairService();
        instance.deleteById(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
