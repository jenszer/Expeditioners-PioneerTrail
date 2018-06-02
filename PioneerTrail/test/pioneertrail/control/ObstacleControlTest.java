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
public class ObstacleControlTest {
    
    public ObstacleControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcMortality method, of class ObstacleControl.
     */
    @Test
    public void testCalcMortality() {
        System.out.println("calcMortality");
        int mortalityRate = 3;
        int noFood = 2;
        int noWater = 2;
        int noRest = 2;
        int expResult = 1;
        int result = ObstacleControl.calcMortality(mortalityRate, noFood, noWater, noRest);
        assertEquals(expResult, result);
       
    }
    
}
