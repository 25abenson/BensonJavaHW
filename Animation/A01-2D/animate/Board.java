package animate;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
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

    // override paintComponent() method
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // casting graphics as Graphics2D
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.MAGENTA);

        int SIDE_LEN = 150;

        int x_t = getWidth() / 2; // gets the x middle
        int y_t = getHeight() / 2; // gets the y middle
        x_t = x_t - SIDE_LEN / 2;
        y_t = y_t - SIDE_LEN / 2;

        // shift or translate the square from 0,0 to center
        // translate in the x and y directions.
        AffineTransform af = new AffineTransform();
        af.translate(x_t, y_t);

        // rotate it
        af.rotate(Math.toRadians(22.5), SIDE_LEN / 2, SIDE_LEN / 2);

        // get translated shape
        Rectangle rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);
        Shape transformedShape = af.createTransformedShape(rect);

        // draw the transformed shape on the screen.
        g2D.setColor(Color.MAGENTA);
        g2D.fill(transformedShape);

        // write on screen
        g2D.setColor(Color.BLUE);
        g2D.drawString("Hello world!", 10, 20);
    }

}
