package model;

/**
 * Created by Tamara on 08/01/2017.
 */
public class Game {
    private State state;

    public void setState(State state) {
        this.state =state;
    }

    public State getState() {
        return state;
    }

    public void remove(Character origin) {
    }

    public void reset() {
        /* TODO */
    }

    public boolean existTodasLasCartasPuestas() {
        /* TODO: Comprobar que todas las cartas del folder terminan con un k */
    }

    public boolean complete() {
        /* TODO: Comprobar que no se pueden poner las cartas en ningún sitio */
    }


    public boolean empty(Character coordinate) {
        /* TODO: Comprobar que se puede poner la carta en el objetivo
    }
}
