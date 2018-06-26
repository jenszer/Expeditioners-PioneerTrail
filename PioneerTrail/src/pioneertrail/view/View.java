/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author Jacob Enszer
 */
public abstract class View implements ViewInterface {

    protected String promptMessage;

    public View() {
    }

    public View(String menuString) {
        this.promptMessage = menuString;
    }

    @Override
    public void display() {
        boolean endOfView = false;
        String inputs = null;

        do {
            inputs = this.getInputs();

            if ((inputs == null) || inputs.equalsIgnoreCase("Q")) {
                return;
            }
            endOfView = this.doAction(inputs);
        } while (endOfView != true);
    }

    @Override
    public String getInputs() {
        return getInput(this.promptMessage);
    }

    public String getInput(String menuPrompt) {

        String inputs = "";
        System.out.println(menuPrompt);

        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter your choice");
            Scanner userInput = new Scanner(System.in);
            inputs = userInput.nextLine();

            if (inputs.trim().equals("") == true) {
                System.out.println("You must enter a non-blank value");
                continue;
            }

            valid = true;
        }
        return inputs;
    }

}
