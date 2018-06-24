package pioneertrail.view;

import java.util.Scanner;
import pioneertrail.PioneerTrail;
import pioneertrail.control.GameControl;


/**
 *
 * @author Jacob Enszer
 */
class NewMainMenuView extends View {

    public NewMainMenuView () {
    }
    
    @Override
    public void display(){
        boolean endOfView = false;
        String inputs[];
                           
        do {
        System.out.println("\n N - Create New Game"
                    + "\n R - Restart Game"
                    + "\n H - Get Help"
                    + "\n E - Test Program"
                    + "\n Q - Quit");
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
    
    public void startNewGame(){
        //Create a New Game
        GameControl.createNewGame(PioneerTrail.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        }
    
    public void restartGame(){
        StartExistingGameView startExistingGame = new StartExistingGameView();
        startExistingGame.display();
       }
    public void getHelp(){
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
        }
    public void test(){
        System.out.println("Test Stub");
    }
}