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
import pioneertrail.model.SceneType;

/**
 *
 * @author Jacob Enszer & Ariel George
 */
public class MapControl {
     /*      public static void movePlayer(Map map, int row, int column) {
            map.setLocations(map.getLocations()[row][column]);
            map.getLocations().setVisited(true);
            } */      
    public static Location [] [] createLocations(int rows, int columns){
        if (rows < 1 || columns < 1){
            return null;
        }
        Location[][]  locations = new Location[rows][columns];
        for (int row = 0; row < locations[row].length; row++){
            for (int column = 0; column < locations[column].length; column++){
                Location location = new Location();
                location.setRow(row);
                location.setColumn(column);
                location.setVisited(false);
                return locations;
                }              
        return locations;
        }

public static Scene[] createScenes(){
        Scene[] scenes = new Scene[7];
        
        Scene scene1 = new Scene();
        scene1.setName("Nauvoo");
        scene1.setDescription("As the Latter-day Saints fled Missouri"
                + "during the winter of 1838–1839, having been threatened"
                + " by the governor of that state with extermination,"
                + " they crossed into Illinois and settled in a swampy "
                + "area along the Mississippi River that they named Nauvoo.");
        scene1.setSceneSymbol("NV");
        
        Scene scene2 = new Scene();
        scene2.setName("Sugar Creek");
        scene2.setDescription("This first major campsite in Iowa, about"
                + " seven miles inland from the Mississippi River, served"
                + " an estimated 2,000 people in February 1846, including "
                + "most of the Church leadership. It was known as the "
                + "'Camp of Israel.'");
        scene2.setSceneSymbol("SC");
        
        Scene scene3 = new Scene();
        scene3.setName("Richardson's Point");
        scene3.setDescription("Suffering through ten days of downpour, the"
                + " Camp of Israel stalled here while awaiting improved "
                + "weather. ");
        scene3.setSceneSymbol("NV");
        
        Scene scene4 = new Scene();
        scene4.setName("Chariton River Crossing");
        scene4.setDescription("The main body of the pioneers chose to remain"
                + " at Chariton to wait out some of the worst weather of the "
                + "Iowa crossing.");
        scene4.setSceneSymbol("CR");
        
        Scene scene5 = new Scene();
        scene5.setName("Locust Creek");
        scene5.setDescription("At or near this campsite William Clayton "
                + "reportedly penned the words to the song 'All is Well',"
                + " after receiving word that his wife, Diantha, still in"
                + " Nauvoo, had given birth to a healthy baby boy.");
        scene5.setSceneSymbol("LC");
        
        Scene scene6 = new Scene();
        scene6.setName("Garden Grove");
        scene6.setDescription("Church leaders decided to create a substantial"
                + " camp at this site, a sort of temporary settlement to serve"
                + " the thousands of weary and destitute pilgrims who would "
                + "yet come this way.");
        scene6.setSceneSymbol("GG");
        
        Scene scene7 = new Scene();
        scene7.setName("Nishnabotna River Crossing");
        scene7.setDescription("The crossing of the Nishnabotna marks the "
                + "meeting of two refugee peoples, the Latter-day Saints "
                + "and the Pottawattamie Indians.");
        scene7.setSceneSymbol("NR");
        
        return scenes;
}

public static Question[] createQuestions(){
        System.out.println("Create Questions Stub");

// DO WE EVEN HAVE QUESTIONS???

    return null;
}
private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes){
        System.out.println("Assign Questions To Scenestub");

// DO WE EVEN HAVE QUESTIONS???

}

public static void assignScenesToLocation(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.Nauvoo.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.SugarCreek.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.Richardsons.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.CharitonRiver.ordinal()]);       
        locations[0][4].setScene(scenes[SceneType.LocustCreek.ordinal()]);      
        locations[1][0].setScene(scenes[SceneType.GardenGrove.ordinal()]);     
        locations[1][1].setScene(scenes[SceneType.NishnabotnaRiver.ordinal()]);
                
    }
public static void movePlayerToStartingLocation(Map map){
        movePlayer(map, 0, 0);
        }

public static void movePlayer(Map map, int Row, int Column){
        map.setLocations(map.getLocations());
        map.getCurrentRow();
        map.getCurrentColumn();
        map.setVisited(true);
}




}            
