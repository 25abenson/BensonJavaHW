import java.awt.Dimension;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Cannon {

    // member variables
    private double xPos;
    private double yPos;
    private double angle;
    private double muzzleV;
    private BufferedImage cannon;
    private int BASE_WIDTH = 60;
    private int BASE_HEIGHT = 80;

    String path1 = "media/cannon.wav";
    SoundClip cannonSound = new SoundClip(path1);
    String path2 = "media/wheel.wav";
    SoundClip wheelSound = new SoundClip(path2);

    // constructor
    public Cannon() {
        xPos = 60;
        yPos = 390;
        angle = Math.toRadians(315);
        cannonSound.open();
        wheelSound.open();

        try {
            File imageFile = new File("media/sm_cannon.png");
            cannon = ImageIO.read(imageFile);
            System.out.println("Cannon image loaded successfully.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // override constructor
    public Cannon(double xPos, double yPos, double angle) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.angle = Math.toRadians(angle);
        cannonSound.open();
        wheelSound.open();

        try {
            File imageFile = new File("media/sm_cannon.png");
            cannon = ImageIO.read(imageFile);
            System.out.println("Cannon image loaded successfully.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // get x coordinate
    public double getXlocation() {
        return xPos;
    }

    // get y coordinatre
    public double getYlocation() {
        return yPos;
    }

    // set x and y
    public void setX(double xPos) {
        this.xPos = xPos;
    }

    public void setY(double yPos) {
        this.yPos = yPos;
    }

    // get and set angle of rotation

    public double getAngleRotation() {
        return angle;
    }

    public void setAngleRotation(double angle) {
        this.angle = angle;
    }

    // get and set muzle velocity
    public double getMuzzleV() {
        return muzzleV;
    }

    public void setMuzzleV(double muzzleV) {
        this.muzzleV = muzzleV;
    }

    // rotate cannon clockwise and counterclockwise
    public void rotateCannonClock() {
        wheelSound.play();
        angle = angle + Math.toRadians(1);
        if (angle > Math.toRadians(360)) {
            angle = Math.toRadians(360);
        }
    }

    public void rotateCannonCounter() {
        wheelSound.play();
        angle = angle - Math.toRadians(1);
        if (angle < Math.toRadians(270)) {
            angle = Math.toRadians(270);
        }
    }

    // fire cannon
    public void cannonFire() {
        cannonSound.play();
    }

    // draw method
    public void drawCannon(Graphics2D cannong2d) {
        double xpoint = 15;
        double ypoint = cannon.getHeight() / 2.0;

        AffineTransform cannonT = new AffineTransform();
        cannonT.translate(xPos - xpoint, yPos - ypoint);
        cannonT.rotate(angle, xpoint, ypoint);
        cannong2d.drawImage(cannon, cannonT, null);

        cannong2d.setColor(Color.PINK);
        int[] xcoordinates = { (int) xPos, (int) xPos - (int) (BASE_WIDTH / 2.0),
                (int) xPos + (int) (BASE_WIDTH / 2.0) };
        int[] ycoordinates = { (int) yPos, (int) yPos + (int) (BASE_HEIGHT / 2.0),
                (int) yPos + (int) (BASE_HEIGHT / 2.0) };
        cannong2d.fillPolygon(xcoordinates, ycoordinates, 3);

        cannong2d.setColor(Color.BLACK);
        cannong2d.drawPolygon(xcoordinates, ycoordinates, 3);

        cannong2d.setColor(Color.BLUE);
        cannong2d.fillOval((int) (xPos - 5), (int) (yPos - 5), 10, 10);
    }

}

public class Board extends JPanel implements KeyListener {

    private final int B_WIDTH = 800;
    private final int B_HEIGHT = 450;
    private Cannon cannon;

    // constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
        cannon = new Cannon(60, B_HEIGHT - 60, 315);
    }

    // override methods from keylistener
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        // was the space key pressed?
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            cannon.cannonFire();
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            cannon.rotateCannonClock();
            repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            cannon.rotateCannonCounter();
            repaint();
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

        // draw cannon
        cannon.drawCannon(g2D);

    }

}
