/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ceed_t1e1;

import ceedt1e1.Ceedt1e1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paco
 */
public class Ceed_t1e1Test {
    static Ceedt1e1 ceed_t1e1;
    static  double res;
    
    
    public Ceed_t1e1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ceed_t1e1 = new Ceedt1e1 ();
        
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
     * Test of main method, of class Ceedt1e1.
     */
    @Test
    public void testMain() {
                
        System.out.println("main");
        String[] args = null;
        Ceedt1e1.main(args);
        res = Ceedt1e1.c;
        System.out.println("Test Suma "+res);
        Assert.assertEquals ( "Test ", 3.0 , res , 1e-6);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}