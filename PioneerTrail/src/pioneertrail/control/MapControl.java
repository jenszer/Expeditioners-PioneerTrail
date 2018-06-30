/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import pioneertrail.model.Inventory;
import pioneertrail.model.Location;
import pioneertrail.model.Map;
import pioneertrail.model.Question;
import pioneertrail.model.Scene;

/**
 *
 * @author Jacob Enszer
 */
public class MapControl {
     /*      public static void movePlayer(Map map, int row, int column) {
            map.setLocations(map.getLocations()[row][column]);
            map.getLocations().setVisited(true);
            } */      
public static Location[][] createLocations(int rows, int columns){
    System.out.println("CreateLocations Stub");
    return null;
    
}
public static Scene[] createScenes(){
        System.out.println("Create Scenes Stub");
    return null;
}
public static Question[] createQuestions(){
        System.out.println("Create Questions Stub");
    return null;
}
public static void assignQuestionsToScenes(Question[] questions, Scene[] scenes){
        System.out.println("Assign Questions To Scenestub");
}

public static void assignScenesToLocation(Scene[] scenes, Location[][] locations){
        System.out.println("Assign To Lcoations Stub");
}            
}
