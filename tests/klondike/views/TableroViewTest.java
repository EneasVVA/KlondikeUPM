package klondike.views;

import model.Card;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by Eneas on 21/11/2016.
 */
public class TableroViewTest {
    private TableroView tableroView;
    @Before
    public void setUp() throws Exception {
        tableroView = new TableroView();
    }

    @Test
    public void showStock() throws Exception {

    }

    @Test
    public void showWaste() throws Exception {

    }

    @Test
    public void showFoundation() throws Exception {

    }

    @Test
    public void showTableuau() throws Exception {
        List<Stack<Card>>
        tableroView.showTableuau();
    }

}