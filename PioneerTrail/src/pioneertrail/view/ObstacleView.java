/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.control.ObstacleControl;

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

    public void fixWagon() {
        System.out.println("Fix Wagon Stub");
        
    }

    public int cureSickness() {
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
