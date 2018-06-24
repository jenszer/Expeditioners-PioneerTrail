/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.PioneerTrail;
import pioneertrail.control.GameControl;
import pioneertrail.control.ObstacleControl;

/**
 *
 * @author Jacob Enszer
 */
public class ObstacleView extends View{
    
    public ObstacleView() {
    }
    @Override
 public void display(){
        boolean endOfView = false;
        String inputs[];
                           
        do {
        System.out.println("\n F - Fix Wagon"
                    + "\n D - Deal w/ Sickness or Injury"
                    + "\n H - Get Help"
                    + "\n Q - Return to Previous Menu");
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
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        
       switch (menuItem){
            case "F": 
                this.fixWagon();
                break;
            case "D":
                this.cureSickness();
                break;
            case "H":
                this.getHelp();
                break;
            default:
            System.out.println("\nInvalid Menu Item.");
                break;
        }
       return false;
    }
    
    public void fixWagon(){
       System.out.println("Fix Wagon Stub");
        }
    
    public void cureSickness(){
            System.out.println("\nCure Sickness Stub");            
        }
    public void getHelp(){
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
        }
}
    