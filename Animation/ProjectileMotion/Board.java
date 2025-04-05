import java.awt.Dimension;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.JPanel;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JPanel implements KeyListener {

    private final int B_WIDTH = 800;
    private final int B_HEIGHT = 450;

    // constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
    }

    // override methods from keylistener
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        // was the space key pressed?
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            System.out.println("Spacebar was pressed.");
        }
    }

    public void keyReleased(KeyEvent e) {

    }

    // override paintComponent() method
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // casting graphics as Graphics2D
        Graphics2D g2D = (Graphics2D) g;

        int floor = B_HEIGHT - 25;

        // draw rectangle
        g2D.setColor(Color.GREEN);
        g2D.fillRect(0, floor - 1, B_WIDTH, B_HEIGHT);

        // draw black line
        g2D.setColor(Color.BLACK);
        g2D.drawLine(0, floor, B_WIDTH, floor);

    }

}
