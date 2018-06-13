/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import pioneertrail.model.Resource;
import pioneertrail.model.Question;
import pioneertrail.model.Scene;
import pioneertrail.model.Player;
import pioneertrail.model.Map;
import pioneertrail.model.Actor;
import pioneertrail.model.Game;
import pioneertrail.model.Inventory;
import pioneertrail.model.Location;
import pioneertrail.model.Wagon;
import pioneertrail.view.StartProgramView;

/**
 *
 * @author Jacob Enszer, Ariel George, Hector Mendoza
 */
public class PioneerTrail {

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PioneerTrail.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        PioneerTrail.game = game;
    }
    
    public static Resource getResource() {
        return resource;
    }

    public static void setResource(Resource resource) {
        PioneerTrail.resource = resource;
    }
    
    /**
     *
     * @param args
     */
    private static Player player;
    private static Game game;
    private static Resource resource;
   
    public static void main(String[] args) {
        
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayStartProgramView();
        
    }
    
    
    
    
    
  /*static void Player(){
        
        Player playerOne = new Player();
    
        playerOne.setName("Brigham Young");
        playerOne.setHealth(100);

        String playerOneName = playerOne.getName();
        int playerOneHealth = playerOne.getHealth();   
          
        System.out.println("Name = " + playerOneName +
                       ", Health = " + playerOneHealth);
               
        String actorFatherName = Actor.Father.getName();
        String actorFatherDescription = Actor.Father.getDescription();
        
        System.out.println(actorFatherName + ", " + actorFatherDescription);
        
    }
    
    static void HectorMendozaTest(){
        
        // testing the Scene Class
        Scene myScene = new Scene();
        
        myScene.setName("Missouri River");
        myScene.setDescription("Longest river in North America");
        myScene.setObstacleType("River");
        myScene.setSceneSymbol("MO");
        
        String sceneOneName = myScene.getName();
        String sceneOneDescription = myScene.getDescription();
        String sceneOneObstacleType = myScene.getObstacleType();
        String sceneOneSymbol = myScene.getSceneSymbol();
        
        System.out.println("Scene Name: " + sceneOneName +
                           ", Description: " + sceneOneDescription +
                           "Obstacle Type: " + sceneOneObstacleType +
                           ", Symbol: " + sceneOneSymbol);
        
        
        //testing the Question Class
        Question myQuestion = new Question();
        
        myQuestion.setQuestionText("Would you like to look around?");
        myQuestion.setAnswerOne("Yes");
        myQuestion.setAnswerTwo("No");
        myQuestion.setCorrectAnswer(1);
        
        String question = myQuestion.getQuestionText();
        String answerOne = myQuestion.getAnswerOne();
        String answerTwo = myQuestion.getAnswerTwo();
        int correctAnswer = myQuestion.getCorrectAnswer();
        
        System.out.println("Question: " + question +
                           ", 1) " + answerOne +
                           ", 2) " + answerTwo +
                           ", Correct int answer: " + correctAnswer);
        
    }
    
    static void JacobEnszerTest() {
        
        Inventory inventoryItem = new Inventory();
        Resource resource = new Resource();
    
        inventoryItem.setName("Axe");
        inventoryItem.setWeight(5);
        
        String inventoryItemName = inventoryItem.getName();
        int inventoryWeight = inventoryItem.getWeight();
        
        System.out.println(inventoryItem.toString());
        
        resource.setName("Water");
        resource.setAmount(15);
        
        String resourceName = resource.getName();
        int resourceAmount = resource.getAmount();
        
        System.out.println(resource.toString());
     
    }
    
    static void ArielGeorgeTest() {
        
        Map map = new Map();
        
        map.setColumnCount(50);
        map.setRowCount(50);
        
        int columnCount = map.getColumnCount();
        int rowCount = map.getRowCount();
        
        System.out.println("Column Count: " + columnCount +
                           ", Row count: " + rowCount);
        
        Location location = new Location();
        
        location.setMilesRemaining(2000);
        location.setVisited(false);
        
        int milesRemaining = location.getMilesRemaining();
        boolean isVisited = location.isVisited();
        
        System.out.println("Miles Remaining: " + milesRemaining);
        
        if (isVisited)
           System.out.println("isVisited: " + isVisited);
        else
            System.out.println("isVisited: " + isVisited);

    }

    
    public static void main(String[] args) {
        
        // testing Actor and Player Classes as a group
        TeamTest();
        
        // testing Scene and Question Classes for the individual assignment
        HectorMendozaTest();
        
        // testing Inventory and Resource Classes for the individual assignment
        JacobEnszerTest();
        
        // testing Map and Location Classes for the individual assignment
        ArielGeorgeTest();
    } */
}
