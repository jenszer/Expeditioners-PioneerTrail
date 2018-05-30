/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacob Enszer
 */
public class HarvestHuntControlTest {
    
    public HarvestHuntControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcHuntForResources method, of class HarvestHuntControl.
     */
    @Test
    public void testCalcHuntForResources() {
        System.out.println("calHuntForResources");
        
        System.out.println("\tTest Case 1");
        int noElk = 5;
        int noBullets = 2;
        int expResult = 100;
        int result = HarvestHuntControl.calcHuntForResources(noElk, noBullets);
        assertEquals(expResult, result);
  
        System.out.println("\tTest Case 2");
        noElk = 0;
        noBullets = 1;
        expResult = -1;
        result = HarvestHuntControl.calcHuntForResources(noElk, noBullets);
        assertEquals(expResult, result);        
          
        System.out.println("\tTest Case 3");
        noElk = 5;
        noBullets = 0;
        expResult = -2;
        result = HarvestHuntControl.calcHuntForResources(noElk, noBullets);
        assertEquals(expResult, result); 
        
        System.out.println("\tTest Case 4");
        noElk = 10;
        noBullets = 42;
        expResult = -2;
        result = HarvestHuntControl.calcHuntForResources(noElk, noBullets);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case 5");
        noElk = 1;
        noBullets = 10;
        expResult = 50;
        result = HarvestHuntControl.calcHuntForResources(noElk, noBullets);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case 6");
        noElk = 10;
        noBullets = 1;
        expResult = 50;
        result = HarvestHuntControl.calcHuntForResources(noElk, noBullets);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case 7");
        noElk = 100;
        noBullets = 20;
        expResult = 1000;
        result = HarvestHuntControl.calcHuntForResources(noElk, noBullets);
        assertEquals(expResult, result);
        
    }
    
}
