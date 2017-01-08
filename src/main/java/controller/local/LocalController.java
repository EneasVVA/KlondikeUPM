package controller.local;

import model.Game;
import model.State;

/**
 * Created by Tamara on 08/01/2017.
 */
public abstract class LocalController {
    private Game game;

    protected LocalController(Game game) {
        assert game != null;
        this.game = game;
    }

    protected State getState(){
        return game.getState();
    }

    public void setState(State state){
        assert state != null;
        game.setState(state);
    }

    public void put(char target) {
/*        assert target != null;
        game.put(target);
        if (game.existTicTacToe()) {
            game.setState(State.FINAL);
        } else {
            game.change();
        }*/
    }

    public void remove(Character origin) {
        assert origin != null;
        game.remove(origin);
    }

    public void reset() {
        game.reset();
    }

    public boolean full(Character coordinate) {
/*   TODO     assert coordinate != null;
        return game.full(coordinate);*/
    }

    public boolean complete() {
        game.complete();
    }

    public boolean existTodasLasCartasPuestas() {
        return game.existTodasLasCartasPuestas();
    }

    public boolean empty(Character coordinate) {
        return game.empty(coordinate);
    }
}
