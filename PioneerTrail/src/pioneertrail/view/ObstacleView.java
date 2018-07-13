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
        super("====================="
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
            case "F": {
                try {
                    this.fixWagon();
                } catch (ObstacleControlException ie) {
                    this.console.println(ie.getMessage());
                    return false;
                }
            }
            break;
            case "D": {
                try {
                    this.cureSickness();
                } catch (ObstacleControlException ie) {
                    this.console.println(ie.getMessage());
                    return false;
                }
            }
            break;
            case "H":
                this.getHelp();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid Menu Item.");
                break;
        }
        return true;
    }

    public void fixWagon() throws ObstacleControlException {
        this.console.println("\nYour wagon is broken down.");

        this.console.println("How many wheels would you like to use?");
        String input = this.getInputs();
        int wheels = Integer.parseInt(input);
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ie) {
            this.console.println(ie.getMessage());
        }
        ObstacleControl.fixWagon(wheels);
    }

    public int cureSickness() throws ObstacleControlException {
        int mortRate = (int) (Math.random() * 6);
        this.console.println("\nOne of your party"
                + " is sick. Their likelihood of survival is: "
                + mortRate);
        this.console.println("How much water would you like to use?");
        String input = this.getInputs();
        int water = Integer.parseInt(input);
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ie) {
            this.console.println(ie.getMessage());
        }
        this.console.println("How much food would you like to use?");
        String input1 = this.getInputs();
        int food = Integer.parseInt(input1);
        try {
            Integer.parseInt(input1);
        } catch (NumberFormatException ie) {
            this.console.println(ie.getMessage());
        }
        this.console.println("How long would you like to rest?");
        String input2 = this.getInputs();
        int rest = Integer.parseInt(input2);
        try {
            Integer.parseInt(input2);
        } catch (NumberFormatException ie) {
            this.console.println(ie.getMessage());
        }

        int death = ObstacleControl.calcMortality(mortRate, food, water, rest);
        return death;
    }

    public void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
