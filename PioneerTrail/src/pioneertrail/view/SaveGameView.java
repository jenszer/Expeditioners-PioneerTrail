
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

/**
 *
 * @author arielgeorge
 */
public class SaveGameView extends View {

    public SaveGameView() {
    }
    
    @Override
    public void display(){
        
        this.console.println("Would You Like to Save Your Game?");
    }

    @Override
    public boolean doAction(String inputs) {
        String location = inputs.toUpperCase().trim();
     
        switch (location){
            case "Y": 
                this.console.println("Game Saved");    
                break;
            case "N":
                this.console.println("Game not Saved");
    }
                             
        return true;
    }
    
}
