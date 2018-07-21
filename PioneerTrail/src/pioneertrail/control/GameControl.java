/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import static java.io.FileDescriptor.out;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import pioneertrail.PioneerTrail;
import pioneertrail.exceptions.GameControlException;
import pioneertrail.model.*;
import static sun.misc.MessageUtils.out;

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

    public static void createNewGame(Player player)
            throws GameControlException {
            Map map = createMap(4,4);  

        if (player == null) {
            throw new GameControlException("Must enter a name.");
        }

        Game game = new Game();
        
        game.setMap(map);
        game.setPlayer(player);
        PioneerTrail.setGame(game);
    }

    /*public static void saveGame(Game game, String filePath)
            throws GameControlException, IOException {
        if ((game == null) || (filePath == null)) {
            throw new GameControlException("Invalid File Output");
        }
        try (ObjectOutputStream out
                = new ObjectOutputStream(new FileOutputStream(filePath)) {

            out.writeObject (game);

        } catch (IOException ie) {
                System.out.println("I/O Error: " + ie.getMessage());
                }
        }
        
       finally {
            Object outFile = null;
            if (outFile != null){
                outFile.close();
            }
        }*/

        //      Resource[] items = createItems();
        /*           if (map == null){
            } else {
                throw new GameControlException("Error creating player");
        }
         game.setMap(map);
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
        
        System.out.println("\n" + Arrays.toString(items));
        return items;     
    }*/
    
    public static Map createMap(int noOfRows, int noOfColumns){
        if (noOfRows < 0 || noOfColumns < 0){
            return null;
        }
     
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);
        
        Location[][] locations = MapControl.createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
                
        Scene[] scenes = MapControl.createScenes();
        
        //Question[] questions = MapControl.createQuestions();
     
       // MapControl.assignQuestionsToScenes(questions, scenes);
        MapControl.assignScenesToLocation(map, scenes);
        
        return map;
    }
    }
