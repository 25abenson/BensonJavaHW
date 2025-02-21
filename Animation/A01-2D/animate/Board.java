package animate;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;

public class Board extends JPanel {

    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;

    // constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    }

}
