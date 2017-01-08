package controller.local;

import model.Game;

/**
 * Created by Tamara on 08/01/2017.
 * Clase encargada de colocar
 */
public class LocalColocateControllerBuilder {
    private LocalColocateController[][] colocateControllerArray;

    private Game game;

    LocalColocateControllerBuilder(Game game) {
        this.game = game;
        colocateControllerArray = new LocalColocateController[game.getNumPlayers()][2];
    }
}
