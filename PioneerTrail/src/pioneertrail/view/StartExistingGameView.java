/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

/**
 *
 * @author Jacob Enszer
 */
public class StartExistingGameView extends View{

    public StartExistingGameView() {
    }
    public void display(){
        boolean endOfView = false;
        String [] inputs;
        
        System.out.println("Start Existing Game View called"); 
    
      do {
        inputs = this.getInputs();
        
        if((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
        break;
        }
        else{
                  
        endOfView = doAction(inputs);
        }
        }
       while (endOfView != true);
       return;
    }

    @Override
    public boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }
    
    
   
