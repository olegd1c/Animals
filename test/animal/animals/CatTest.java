/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.animals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Java FUND
 */
public class CatTest {
    
    public CatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Cat.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Cat instance = new Cat();
        String expResult = "fluffy";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Cat.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Vasya";
        Cat instance = new Cat();
        instance.setName(name);
        String resName = instance.getName();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(name, resName);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Cat.
     */
    //@Test
    public void testPlay() {
        System.out.println("play");
        Cat instance = new Cat();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eat method, of class Cat.
     */
    //@Test
    public void testEat() {
        System.out.println("eat");
        Cat instance = new Cat();
        instance.eat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
