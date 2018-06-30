/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import java.util.ArrayList;
import java.util.Arrays;
import pioneertrail.PioneerTrail;
import pioneertrail.model.Actor;
import pioneertrail.model.Game;
import pioneertrail.model.Inventory;
import pioneertrail.model.ItemType;
import pioneertrail.model.Map;
import pioneertrail.model.Player;

/**
 *
 * @author Jacob Enszer
 */
public class GameControl {

    public GameControl() {
    }
    
    public static Player savePlayer(String playerName) {
        Player player = new Player();
        player.setName(playerName);
        PioneerTrail.setPlayer(player);
        
        return player;
    }   
    public static int createNewGame(Player player){
        Map map = null;  
        
        if (player == null){
                return -1;
            }
            
         Game game = new Game(); 
         game.setPlayer(player);
         PioneerTrail.setGame(game);
         createItems();
         createMap(3,5,4);
            if (map == null){
            } else {
                return -2;
        }
         game.setMap(map);
         return 1;
    }
    
    public static createItems(){
        Inventory[] items = new Inventory[6];
               
        Inventory food = new Inventory();
        food.setAmount(2);
        food.setName("Food");
        food.setWeight(200); 
        items[ItemType.Food.ordinal()] = food;
                
        Inventory water = new Inventory();
        water.setAmount(1);
        water.setName("Water");
        water.setWeight(10);
        items[ItemType.Water.ordinal()] = water;
        
        Inventory wheels = new Inventory();
        wheels.setAmount(1);
        wheels.setName("Wheels");
        wheels.setWeight(50);
        items[ItemType.Wheels.ordinal()] = wheels;
        
        System.out.println(Arrays.toString(items));
        return items;     
    }
    
    public static Map createMap(int noOfRows, int noOfColumns, int items){
        System.out.println("Create Map Stub");
        return null;
    }

}    