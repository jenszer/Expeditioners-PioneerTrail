package pioneertrail.view;

import java.util.Scanner;
import pioneertrail.PioneerTrail;
import pioneertrail.control.GameControl;


/**
 *
 * @author Jacob Enszer
 */
class NewMainMenuView {

    public NewMainMenuView() {
    }
    
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
   
    public String[] getInputs() {
        String[] inputs = new String [1];
        System.out.println("MAIN MENU");
        
        boolean valid = false;
        while (valid == false){
           System.out.println("Make your selection: ");
           Scanner userInput = new Scanner(System.in);
           inputs[0] = userInput.nextLine();
                                                       
           if(inputs[0].trim().equals("") == true){
           System.out.println("You must enter a non-blank value");
           continue;
           }           
                      
           valid = true;
        }
        return inputs;
    }
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