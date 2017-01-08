import controller.local.LocalOperationController;
import controller.local.LocalStartController;
import model.Game;

/**
 * Created by Tamara on 08/01/2017.
 */
public class Logic {
    Game game;

    public Logic() {
        game = new Game();
        colocateControllerBuilder = new LocalColocateControllerBuilder(game);
        startController = new LocalStartController(game, colocateControllerBuilder);
        continueController = new LocalContinueController(game);
    }
    public LocalOperationController getController() {
        switch (game.getState()){
            case INITIAL:
                return startController;
            case IN_GAME:
                return colocateControllerBuilder.getColocateController();
            case FINAL:
                return continueController;
            case EXIT:
            default:
                return null;
        }
    }
}
