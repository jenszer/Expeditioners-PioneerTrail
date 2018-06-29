/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import java.util.ArrayList;
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
    
    public static Player savePlayer(String playerName) {
        Player player = new Player();
        player.setName(playerName);
        PioneerTrail.setPlayer(player);
        return player;
    }   
    public static int createNewGame(Player player){
            if (player == null){
                return -1;
            }
            
         Game game = new Game(); 
         game.setPlayer(player);
         PioneerTrail.setGame(game);
         
         
         game.setItems(items);
         game.setMap();
         
    }
    
    public static Inventory createItems(){
        ArrayList<Inventory> items = new ArrayList<Inventory>();
        String[] inventory = new String[6];   
        
        Inventory food = new Inventory();
        food.setAmount(2);
        food.setName("Food");
        food.setWeight(200);
        inventory[ItemType.Food.ordinal()] = food;
        
        
        Inventory item2 = new Inventory();
        item2.setAmount(1);
        item2.setName("Water");
        item1.setWeight(10);
        
        Inventory item3 = new Inventory();
        item3.setAmount(1);
        item3.setName("Wheels");
        item3.setWeight(50);
        
        item1 = items.setName("Food");
        item.setAmount(4);
        Inventory food = items[ItemType.Food.ordinal()];
        
        
        
        
        
            
    }
    
    public static Map createMap(int noOfRows, int noOfColumns){
        System.out.println("Create Map Stub");
    }

}    