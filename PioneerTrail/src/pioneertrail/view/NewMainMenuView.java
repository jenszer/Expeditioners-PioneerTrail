package pioneertrail.view;

import java.util.Scanner;
import pioneertrail.PioneerTrail;
import pioneertrail.control.GameControl;
import pioneertrail.exceptions.GameControlException;

/**
 *
 * @author Jacob Enszer
 */
class NewMainMenuView extends View {

    public NewMainMenuView() {
        super(      "==========="
                + "\n Main Menu"
                + "\n==========="
                + "\n N - Create New Game"
                + "\n R - Restart Game"
                + "\n H - Get Help"
                + "\n E - Test Program"
                + "\n Q - Quit");
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = inputs.toUpperCase();

        switch (menuItem) {
            case "N": //for new game
                this.startNewGame();
                break;
            case "R":
                this.restartGame();
                break;
            case "H":
                this.getHelp();
                break;
            case "E":
                this.test();
                break;
            default:
                System.out.println("\nInvalid Menu Item.");
                break;
        }
        return false;
    }

    public boolean startNewGame() {
        //Create a New Game
        try {
            GameControl.createNewGame(PioneerTrail.getPlayer());
        } catch (GameControlException ie){
            System.out.println(ie.getMessage());
            return false;
        }
               
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        return true;
    }

    public void restartGame() {
        StartExistingGameView startExistingGame = new StartExistingGameView();
        startExistingGame.display();
    }

    public void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    public void test() {
        System.out.println("Test Stub");
    }
}
