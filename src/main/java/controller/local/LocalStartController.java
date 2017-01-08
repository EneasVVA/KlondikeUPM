package controller.local;

import controller.StartController;
import model.Game;

/**
 * Created by Tamara on 08/01/2017.
 */
public class LocalStartController extends LocalOperationController implements
        StartController {
    private LocalColocateControllerBuilder colocateControllerBuilder;


    public LocalStartController(Game game, Object p1) {

    }

    public void start() {
        assert this.getState() == State.INITIAL;
        colocateControllerBuilder.build();
        this.setState(State.IN_GAME);
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor) {
        operationControllerVisitor.visit(this);
    }

    public State getState() {
        return state;
    }
}
