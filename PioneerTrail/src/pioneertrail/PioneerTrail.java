/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

/**
 *
 * @author Jacob Enszer, Hector Mendoza, Ariel George
 */
public class PioneerTrail {
    
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
        
        System.out.println("Inventory: " + inventoryItemName + "; Weight: " +
                           inventoryWeight);
        
        resource.setName("Water");
        resource.setAmount(15);
        
        String resourceName = resource.getName();
        int resourceAmount = resource.getAmount();
        
        System.out.println("Resource: " + resourceName + "; Amount: " +
                           resourceAmount);
        
    }
    
    static void ArielGeorgeTest() {
        
        
    }

    
    public static void main(String[] args) {
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
        
        // testing Scene and Question Class for the individual assignment
        HectorMendozaTest();
        
        // testing Inventory and Resource Class for the individual assignment
        JacobEnszerTest();
        
        // testing 
        ArielGeorgeTest();
    }
}