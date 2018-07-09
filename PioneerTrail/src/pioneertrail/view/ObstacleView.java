/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import pioneertrail.control.ObstacleControl;
import pioneertrail.exceptions.ObstacleControlException;

/**
 *
 * @author Jacob Enszer
 */
public class ObstacleView extends View {

    public ObstacleView() {
        super(      "====================="
                + "\n Obstacle Resolution"
                + "\n====================="
                + "\n F - Fix Wagon"
                + "\n D - Deal w/ Sickness or Injury"
                + "\n H - Get Help"
                + "\n Q - Return to Previous Menu");
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = inputs.toUpperCase();

        switch (menuItem) {
            case "F":
        {
            try {
                this.fixWagon();
            } catch (ObstacleControlException ie) {
                System.out.println(ie.getMessage());
                return true;
            }
        }
                break;
            case "D":
        {
            try {
                this.cureSickness();
            } catch (ObstacleControlException ie) {
                 System.out.println(ie.getMessage());
                 return true;
            }
        }
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

    public void fixWagon() throws ObstacleControlException {
        System.out.println("How many wheels would you like to use?");
            String input = this.getInputs();
            int wheels = Integer.parseInt(input);
            ObstacleControl.fixWagon(wheels);
             }

    public int cureSickness() throws ObstacleControlException {
            int mortRate = (int) (Math.random() * 6);
        System.out.println("How much water would you like to use?");
            String input = this.getInputs();    
            int water = Integer.parseInt(input);
        System.out.println("How much food would you like to use?");
            String input1 = this.getInputs();
            int food = Integer.parseInt(input1);
        System.out.println("How long would you like to rest?");
            String input2 = this.getInputs();
            int rest = Integer.parseInt(input2);    
           
        int death = ObstacleControl.calcMortality(mortRate, food, water, rest);
        return death;   
    }

    public void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
