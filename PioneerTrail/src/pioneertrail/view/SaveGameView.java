
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
public class SaveGame extends View {
    
    public void display(){
        
        System.out.println("Would You Like to Save Your Game?");
    }

    @Override
    public boolean doAction(String inputs) {
        String location = inputs;
        location = inputs.toUpperCase().trim();
     
        switch (location){
            case "Y": 
                System.out.println("Game Saved");    
                break;
            case "N":
                System.out.println("Game not Saved");
    }
                             
        return true;
    }
    
}
