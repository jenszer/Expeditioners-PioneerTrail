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
private static Location[][] createLocations(int rows, int columns){
    if (rows < 1 || columns < 1 ){
        return null;
    }
    Location[][] locations = new Location[4][4];
    locations[0][0] = new Location();
    for (int i=0; i < locations.length; i++) {
        for (int k=0; k <= locations[i].length; k++){
           
        }
    }
    /* i know i need setters buuut idk where */
    return locations;
}
private static Scene[] createScenes(){
    Scene scenes[] = new Scene[4];
    public enum SceneType {
        start,
        lumber,
        yoIDK, 
        cries,
        finish;
    }
    scenes[SceneType.lumber.ordinal()] = lumber;
    
    return null;
}
private static Question[] createQuestions(){
        System.out.println("Create Questions Stub");

// DO WE EVEN HAVE QUESTIONS???

    return null;
}
private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes){
        System.out.println("Assign Questions To Scenestub");

// DO WE EVEN HAVE QUESTIONS???

}

private static void assignScenesToLocation(Map map, Scene[] scenes){
    Location[][] locations = map.getLocations();

    locations [0][0].setScene(scenes[SceneType.desert.ordinal()]);
    locations [0][1].setScene(scenes[SceneType.desert.ordinal()]);
    locations [0][2].setScene(scenes[SceneType.start.ordinal()]);
    locations [0][3].setScene(scenes[SceneType.beach.ordinal()]);
    locations [0][4].setScene(scenes[SceneType.ocean.ordinal()]);

}




}            
