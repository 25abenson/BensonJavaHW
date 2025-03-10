package sound.A03PartB;

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
import java.util.random.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import sound.SoundClip;

public class Board3 extends JPanel {

    String path1 = "media/ow.wav";
    SoundClip owSound = new SoundClip(path1);
    String path2 = "media/sitar.wav";
    SoundClip sitarSound = new SoundClip(path2);

    Random randomX = new Random();
    Random randomY = new Random();

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
    private int xSpeed = randomX.nextInt(1, 6);
    private int ySpeed = xSpeed;

    private BufferedImage img;

    private class ScheduledUpdate extends TimerTask {
        /*
         * Override the run() method.
         * Update the position of our ball here.
         */
        public void run() {

            sitarSound.play();

            x += xSpeed;
            y += ySpeed;

            // increases degree by 5 each time
            degrees += DEGREE_ROTATION;

            // resets to be top corner
            if (x >= B_WIDTH - img.getWidth() || x <= 0) {
                xSpeed = -xSpeed;
                owSound.play();
            } // resets to be top corner
            if (y >= B_HEIGHT - img.getHeight() || y <= 0) {
                ySpeed = -ySpeed;
                owSound.play();
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
        x = 360;
        y = 360;

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

        owSound.open();
        sitarSound.open();

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
