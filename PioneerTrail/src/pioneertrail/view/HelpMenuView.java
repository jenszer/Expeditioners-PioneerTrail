/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

/**
 *
 * @author Jacob Enszer
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super(      "==========="
                + "\n Help Menu"
                + "\n==========="
                + "\n A - About Game"
                + "\n C - Game Controls"
                + "\n O - Object of the game"
                + "\n I - Items"
                + "\n Q - Exit to Previous Menu");
    }

    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = inputs.toUpperCase();

        switch (menuItem) {
            case "A":
                this.aboutGame();
                break;
            case "C":
                this.gameControls();
                break;
            case "O":
                this.objectOfGame();
                break;
            case "I":
                this.items();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid Menu Item.");
                break;
        }
        return false;
    }

    public void aboutGame() {
        System.out.println("The Pioneer Trail game is a text based role \n"
                + "playing game. In this game, you will be a pioneer family \n"
                + "who leads a wagon train preparing to go west. You have \n"
                + "suffered constant religious persecution and wish to find \n"
                + "freedom and a new life in a better place. You have heard \n"
                + "of a place called Zion in the mountains that offers such \n"
                + "freedom and are eager to start your journey.");
    }

    public void gameControls() {
        System.out.println("Problems may arise during the trip, such as \n"
                + "illness or death of family members, snake bites, broken \n"
                + "wagons, adverse weather conditions, etc. You will have the\n"
                + "opportunity to hunt if you have weapons and ammunition\n"
                + "when you spot a bison, or an elk. If you have the needed\n"
                + "supplies you could repair your damaged wagon, and fish \n"
                + "when arriving at a lake or river. You will also have to \n"
                + "stop to rest from time to time, due to weak animals or to \n"
                + "obtain food. The game is over when at least two family \n"
                + "members have reached Zion.");
    }

    public void objectOfGame() {
        System.out.println("The goal of the game is to reach Zion and survive\n"
                + "with as many family members as you can. The game will be\n"
                + "over when at least two family members have reached Zion.");
    }

    public void items() {
        System.out.println("Before starting the long journey, you must buy a \n"
                + "series of items necessary for the trip, such as: food, \n"
                + "water, tools, spare parts for the wagon, weapons, \n"
                + "ammunition, etc. You must plan carefully so that you will \n"
                + "have the items you need before you begin your journey.");
    }

}
