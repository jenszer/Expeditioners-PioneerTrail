/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Jacob Enszer
 */
public abstract class View implements ViewInterface {

    protected String promptMessage;

    protected final BufferedReader keyboard = PioneerTrail.getInFile();
    protected final PrintWriter console = PioneerTrail.getOutFile();

    public View() {
    }

    public View(String menuString) {
        this.promptMessage = menuString;
    }

    @Override
    public void display() {
        boolean endOfView = false;
        String inputs = "";

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

    @Override
    public String getInput(String menuPrompt) {

        String inputs = "";
        this.console.println(menuPrompt);

        boolean valid = false;
        try {
            while (valid == false) {
                this.console.println("Input:");
                inputs = this.keyboard.readLine();

                if (inputs.trim().equals("") == true) {
                    ErrorView.display(this.getClass().getName(),
                            "You must enter a non-blank value");
                    continue;
                }

                valid = true;
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error Reading Input: "
                    + ex.getMessage());
        }

        return inputs;
    }

}
