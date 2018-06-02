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
        
        System.out.println("\tTest Case 1");
        int mortalityRate = 3;
        int noFood = 2;
        int noWater = 2;
        int noRest = 2;
        int expResult = 1;
        int result = ObstacleControl.calcMortality(mortalityRate, noFood, noWater, noRest);
        assertEquals(expResult, result);
       
        System.out.println("\tTest Case 2");
        mortalityRate = 3;
        noFood = 0;
        noWater = 2;
        noRest = 5;
        expResult = -2;
        result = ObstacleControl.calcMortality(mortalityRate, noFood, noWater, noRest);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case 3");
        mortalityRate = 3;
        noFood = 5;
        noWater = 0;
        noRest = 2;
        expResult = -1;
        result = ObstacleControl.calcMortality(mortalityRate, noFood, noWater, noRest);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case 4");
        mortalityRate = 3;
        noFood = 5;
        noWater = 2;
        noRest = 0;
        expResult = -3;
        result = ObstacleControl.calcMortality(mortalityRate, noFood, noWater, noRest);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case 5");
        mortalityRate = 3;
        noFood = 1;
        noWater = 10;
        noRest = 4;
        expResult = 0;
        result = ObstacleControl.calcMortality(mortalityRate, noFood, noWater, noRest);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case 6");
        mortalityRate = 3;
        noFood = 10;
        noWater = 1;
        noRest = 4;
        expResult = 0;
        result = ObstacleControl.calcMortality(mortalityRate, noFood, noWater, noRest);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case 7");
        mortalityRate = 3;
        noFood = 10;
        noWater = 4;
        noRest = 1;
        expResult = 0;
        result = ObstacleControl.calcMortality(mortalityRate, noFood, noWater, noRest);
        assertEquals(expResult, result);
        
              
    }
    
}
