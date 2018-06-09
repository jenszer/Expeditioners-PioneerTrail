/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacob Enszer
 */
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayStartProgramView method, of class StartProgramView.
     */
    @Test
    public void testDisplayStartProgramView() {
        System.out.println("displayStartProgramView");
        StartProgramView instance = new StartProgramView();
        boolean expResult = false;
        boolean result = instance.displayStartProgramView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
