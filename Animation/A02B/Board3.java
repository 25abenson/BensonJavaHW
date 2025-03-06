package A02B;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board3 extends JPanel {

    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private int x = 0;
    private int y = 0;
    private final int DIAMETER = 20;
    private final int DEGREE_ROTATION = 5;

    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;
    private int degrees = 0;
    private int xSpeed = 1;
    private int ySpeed = 1;

    private BufferedImage img;

    private class ScheduledUpdate extends TimerTask {
        /*
         * Override the run() method.
         * Update the position of our ball here.
         */
        public void run() {
            x += xSpeed;
            y += ySpeed;

            // increases degree by 5 each time
            degrees += DEGREE_ROTATION;

            // resets to be top corner
            if (x > B_WIDTH) {
                x = 0;
            } // resets to be top corner
            if (y > B_HEIGHT) {
                y = 0;
            }
            // regenerates image
            repaint();
        }
    }

    // constructor
    public Board3() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        // set the initial position of the ball
        // to be on the left side of the content area
        // and in the middle of the content area.
        x = 0;
        y = 0;

        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(),
                INITIAL_DELAY, PERIOD_INTERVAL);

        // attempt to load the image.
        try {
            File imageFile = new File("media/Andy.png");
            img = ImageIO.read(imageFile);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    // override paintComponent() method
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;

        AffineTransform affineTransform = new AffineTransform();

        // gets the image width
        int SIDE_LEN = img.getWidth();

        if (img != null) {

            // moves diagonally
            affineTransform.translate(x, y);
            // rotates by degrees with center at the middle of image
            affineTransform.rotate(Math.toRadians(degrees), SIDE_LEN / 2, SIDE_LEN / 2);

            // draws the image
            g2d.drawImage(img, affineTransform, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }

    }

}
