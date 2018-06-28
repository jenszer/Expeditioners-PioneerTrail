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
public class ObstacleView extends View {

    public ObstacleView() {
        super("==============="
                + "\n Obstacle Resolution"
                + "\n==============="
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

    public void cureSickness() {
        System.out.println("\nCure Sickness Stub");
    }

    public void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
