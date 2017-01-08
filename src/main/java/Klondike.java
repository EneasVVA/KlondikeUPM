import controller.local.LocalOperationController;
import klondike.View;

/**
 * Created by Tamara on 08/01/2017.
 */
public class Klondike {

    private Logic logic;

    private View view;

    public Klondike() {
        logic = new Logic();
        view = new View();
    }

    public void play() {
        LocalOperationController controller;
        do {
            controller = logic.getController();
            if (controller != null){
                view.interact(controller);
            }
        } while (controller != null);

    }

    public static void main(String[] args) {
        new TicTacToe().play();
    }

}
