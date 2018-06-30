/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import java.util.ArrayList;
import java.util.Arrays;
import pioneertrail.PioneerTrail;
import pioneertrail.model.*;

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
        Map map = createMap(4,4);  
        
        if (player == null){
                return -1;
            }
            
         Game game = new Game(); 
         game.setPlayer(player);
         PioneerTrail.setGame(game);
         Resource[] items = createItems();
         
            if (map == null){
            } else {
                return -2;
        }
         game.setMap(map);
         return 1;
    }
    
    public static Resource[] createItems(){
        Resource[] items = new Resource[6];
               
        Resource food = new Resource();
        food.setAmount(2);
        food.setName("Food");
        food.setWeight(200); 
        items[ItemType.Food.ordinal()] = food;
                
        Resource water = new Resource();
        water.setAmount(1);
        water.setName("Water");
        water.setWeight(10);
        items[ItemType.Water.ordinal()] = water;
        
        Resource wheels = new Resource();
        wheels.setAmount(1);
        wheels.setName("Wheels");
        wheels.setWeight(50);
        items[ItemType.Wheels.ordinal()] = wheels;
        
        System.out.println(Arrays.toString(items));
        return items;     
    }
    
    public static Map createMap(int noOfRows, int noOfColumns){
        if (noOfRows < 0 || noOfColumns < 0){
            return null;
        }
     
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);
        
        Location[][] locations = MapControl.createLocations(noOfRows, noOfColumns);
        
        Scene[] scenes = MapControl.createScenes();
        Question[] questions = MapControl.createQuestions();
     
       // MapControl.assignQuestionsToScenes(questions, scenes);
       // MapControl.assignScenesToLocation(scenes, locations);
        
        return map;
    }
    
}    
