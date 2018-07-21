/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.PioneerTrail;
import pioneertrail.model.Question;
import pioneertrail.model.Resource;
import pioneertrail.model.Scene;

/**
 *
 * @author arielgeorge
 */
public class SceneView extends View{

    private Scene scene;
 
    public SceneView() {
    
    }
    public SceneView(Scene scene) {
        this.scene = scene;
        promptMessage = getSceneMenu();
    }
    private String getSceneMenu(){
    String menuString = "Scene does not exist";
    if(scene != null){
       menuString = "Welcome to " + scene.getName() + "\n";
       menuString += scene.getDescription() + "\n";

       Resource resource = scene.getResource();
       if (resource !=null){
            menuString += "P - pick up " + resource.getName() + "\n";
       }
       
       Question question = scene.getQuestion();
       if (question!= null){
           menuString += "A - Answer Question: " + question.getQuestionText() + "\n";
       }    
       menuString += "Q - quit \n";
    }
    
    return menuString;
}
    @Override
    public boolean doAction(String inputs) {
       if(scene == null){
           return true;
       }
       inputs.toUpperCase();
       switch(inputs){
           case "P":
               if (scene.getResource() != null){
                   PioneerTrail.getGame().getResources();
                   scene.setResource(null);
               }
               
               break;
           case "A": 
               Question question = scene.getQuestionText();
               if (question != null){
                   String questionMenu = question.getQuestionText() + "\n";
                   questionMenu += "   1-" + question.getAnswerOne() + "\n";
                   questionMenu += "   2-" + question.getAnswerTwo() + "\n";
                   questionMenu += "   3-" + question.getAnswerThree() + "\n";
                   questionMenu += "   4-" + question.getAnswerFour() + "\n";
                   String answer = getInput(questionMenu);
                   int answerInt = Integer.parseInt(answer);
                   if (answerInt == question.getConrrectAnswer()){
                       System.out.println("Your Answer is Correct!"); 
                   }
               }
               break;
           case "Q":
               return true;
       }
       promptMessage = getSceneMenu();
        return false;
    }
}
      
