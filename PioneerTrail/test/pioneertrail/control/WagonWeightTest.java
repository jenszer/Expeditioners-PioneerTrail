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
import pioneertrail.model.Inventory;
import pioneertrail.model.Wagon;
/**
 *
 * @author arielgeorge
 */

//@Test
public class WagonWeightTest {

    public WagonWeightTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     *
     */
    @Test
    public void wagonWeightControlTest(){
      System.out.println("WagonWeightTests");
  
      Wagon wagon = new Wagon();
      Inventory inventoryItem = new Inventory();
      
      
      
      System.out.println("\tTest Case 1");
      inventoryItem.setAmount(3);
      inventoryItem.setWeight(5);
      wagon.setCurrentWeight(20);
      wagon.setMaxWeight(500);
      int expResult = (35);
      int result = WagonControl.calcRemainingWeight(wagon, inventoryItem);
      System.out.println("\tresult = "+ result);
      assertEquals(expResult, result);        
      
      
      System.out.println("\tTest Case 2");
      inventoryItem.setAmount(0);
      inventoryItem.setWeight(5);
      wagon.setCurrentWeight(20);
      wagon.setMaxWeight(500);
      expResult = (-3);
      result = WagonControl.calcRemainingWeight(wagon, inventoryItem);
      System.out.println("\tresult = "+ result);
      assertEquals(expResult, result);  

      
      System.out.println("\tTest Case 3");
      inventoryItem.setAmount(3);
      inventoryItem.setWeight(0);
      wagon.setCurrentWeight(20);
      wagon.setMaxWeight(500);
      expResult = (-4);
      result = WagonControl.calcRemainingWeight(wagon, inventoryItem);
      System.out.println("\tresult = "+ result);
      assertEquals(expResult, result);  
      
      
      System.out.println("\tTest Case 4");
      inventoryItem.setAmount(3);
      inventoryItem.setWeight(5);
      wagon.setCurrentWeight(-4);
      wagon.setMaxWeight(500);
      expResult = (-5);
      result = WagonControl.calcRemainingWeight(wagon, inventoryItem);
      System.out.println("\tresult = "+ result);
      assertEquals(expResult, result);  

      
      System.out.println("\tTest Case 5");
      inventoryItem.setAmount(1);
      inventoryItem.setWeight(5);
      wagon.setCurrentWeight(20);
      wagon.setMaxWeight(500);
      expResult = (25);
      result = WagonControl.calcRemainingWeight(wagon, inventoryItem);
      System.out.println("\tresult = "+ result);
      assertEquals(expResult, result);  
    
            
      System.out.println("\tTest Case 6");
      inventoryItem.setAmount(3);
      inventoryItem.setWeight(1);
      wagon.setCurrentWeight(20);
      wagon.setMaxWeight(500);
      expResult = (23);
      result = WagonControl.calcRemainingWeight(wagon, inventoryItem);
      System.out.println("\tresult = "+ result);
      assertEquals(expResult, result);  
      
      
      System.out.println("\tTest Case 7");
      inventoryItem.setAmount(3);
      inventoryItem.setWeight(5);
      wagon.setCurrentWeight(0);
      wagon.setMaxWeight(500);
      expResult = (15);
      result = WagonControl.calcRemainingWeight(wagon, inventoryItem);
      System.out.println("\tresult = "+ result);
      assertEquals(expResult, result);  


}
  
}
