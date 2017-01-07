package klondike.views;

import klondike.utils.IO;
import model.Card;
import model.Face;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by Eneas on 12/11/2016.
 */
public class TableroView {

    public void showStock(boolean emptyStock) {
        String cadenaBaraja = emptyStock ? "vacía" : "X, X";
        IO.write(String.format("Baraja: [%s]", cadenaBaraja));
    }

    public void showWaste(Stack<Card> waste) {
        StringBuilder cardsChain = new StringBuilder();

        for(Card card : waste) {
            Face face = card.getFace();
            cardsChain.append(String.format("[%s, %s]", face.getRank(), face.getSuit()));
        }

        if(waste.isEmpty()) cardsChain.append("vacía");

        IO.write(String.format("Waste: [%s]", cardsChain));
    }

    public void showFoundation(List<Stack<Card>> foundation) {

        for( Stack palo : foundation) {
            Face face = ((Card)palo.peek()).getFace();
            IO.write("Palo "+ face.getSuit() + ":" + face.getSuit());
        }
    }

    public void showTableuau(List<Stack<Card>> tableau) {
        for( Stack stack : tableau) {
            showStack(stack);
        }
    }

    public void showStack(Stack<Card> stack) {
        Card card = null;
        if(!stack.empty()) {
            card = stack.pop();
            showStack(stack);
            IO.write("[");
            if(stack.size() == 1)
                IO.write(card.getFace().getRank() + "," + card.getFace().getSuit() + "]");
        }


    }
}
