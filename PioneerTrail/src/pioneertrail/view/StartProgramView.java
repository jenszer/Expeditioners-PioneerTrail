package pioneertrail.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import pioneertrail.control.GameControl;
import pioneertrail.model.Player;

/**
 *
 * @author arielgeorge
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\n***********************************"
                + "\n* Welcome to the Pioneer Trail    *"
                + "\n* In this game you will journey   *"
                + "\n* with your family from Missouri  *"
                + "\n* to Utah. You will encounter     *"
                + "\n* various obstacles along the     *"
                + "\n* way. Try to make it with as     *"
                + "\n* many family members as possible *"
                + "\n***********************************"
                + "\n"
                + "\n Enter your Name: ");
    }

    @Override
    public boolean doAction(String inputs) {

        if (inputs.equals("")) {
            ErrorView.display(this.getClass().getName(),
                    "Could not create the player. "
                    + "Enter a different name.");
            return false;
        } else {
            Player player = GameControl.savePlayer(inputs);
            this.console.println("\n======================================"
                    + "\nWelcome to the game " + player.getName()
                    + "\nWe hope you have a lot of fun!"
                    + "\n======================================");
        }

        NewMainMenuView mainMenu = new NewMainMenuView();
        mainMenu.display();

        return true;
    }

}
