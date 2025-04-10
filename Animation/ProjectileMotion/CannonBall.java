import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CannonBall {

    public enum STATE {
        IDLE,
        FLYING,
        EXPLODING
    }

    private STATE state = STATE.IDLE;
    private double x;
    private double y;
    private double vx, vy;
    private double ax, ay;
    private double ground;
    private double timescale = 1.0;

    private final int BOARD_SCALE = 256; // pixels per meter
    private final int TIMER_INTERVAL = 20; // milliseconds per timer interval
    private final int G_BOARD = 1; // acceleration due to gravity in pixels per timer interval ^ 2
    private final int MUZZLE_VELOCITY = 37; // pixels per timer interval

    private SoundClip boom;
    private BufferedImage flames1;

    public CannonBall(double ax, double ay, double ground) {
        // public constructor for CannonBall class.
        // takes the acceleration rates (x and y) and the location of the ground (as a
        // double)
        // as arguments
        this.ax = ax;
        this.ay = ay;
        this.ground = ground;
        try {
            File imageFile = new File("media/flame01.png");
            flames1 = ImageIO.read(imageFile);
            System.out.println("Flame image loaded successfully.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        boom = new SoundClip("media/boom.wav");
        boom.open();
    }

    private BufferedImage loadImage(String path) {
        return null;
        // loads a buffered image (for the flame animation).
    }

    /*
     * The draw method is called by the Board object
     * and is used to paint the current location and state of the ball.
     * If the ball is flying through the air, the ball is drawn as a red
     * filled in circle. If the ball is in the exploded state, a flame image is
     * drawn. If the ball is idle, then the ball is not drawn at all
     * (since we assume the ball is hidden inside the cannon).
     */
    public void draw(Graphics2D g2d) {
        if (state == STATE.FLYING) {
            g2d.setColor(Color.RED);
            g2d.fillOval((int) x, (int) y, 10, 10);
        } else if (state == STATE.EXPLODING) {
            g2d.drawImage(flames1, null, (int) x - flames1.getWidth() / 2, (int) y - flames1.getHeight() / 2);

        }
    }

    /*
     * The updateBall() method uses the constant acceleration equations
     * to update the velocity and position of the ball each timer interval.
     * note that when calculating the new velocity, the acceleration term is divided
     * by the
     * time scale in case the user wants to slow down the animation.
     * Similarly, when calculating the new position, the velocity term is divided by
     * the time scale
     * in case the user wants to slow down the animation.
     */
    public void updateBall() {
        if (state == STATE.FLYING) {
            vx = (vx + ax / timescale);
            x = (x + vx / timescale);
            vy = (vy + ay / timescale);
            y = (y + vy / timescale);

            if (y > ground) {
                state = STATE.EXPLODING;
                boom.play();
            }
        }
    }

    /*
     * If the ball is not flying through the air, the launch() method
     * will change the state to FLYING and start the ball moving from position (x,y)
     * with the inital velocity of (vx, vy).
     */
    public void launch(double x, double y, double vx, double vy) {
        if (state != STATE.FLYING) {
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
            this.state = STATE.FLYING;
        }
    }

    /*
     * Get/set methods for the private member variables.
     */
    public STATE getState() {
        return state;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVX() {
        return vx;
    }

    public double getVY() {
        return vy;
    }

    public double getAX() {
        return ax;
    }

    public double getAY() {
        return ay;
    }

    public double getTimeScale() {
        return timescale;
    }

    public double getGround() {
        return ground;
    }

    public void setState(STATE newState) {
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVX(double vx) {
        this.vx = vx;
    }

    public void setVY(double vy) {
        this.vy = vy;
    }

    public void setAX(double ax) {
        this.ax = ax;
    }

    public void setAY(double ay) {
        this.ay = ay;
    }

    public void setTimeScale(double timeScale) {
        this.timescale = timescale;
    }

    public void changeTimeScale(double delta) {
        timescale = timescale + delta;
        if (timescale > 10) {
            timescale = 10;
        } else if (timescale < 1) {
            timescale = 1;
        }

    }

    public void setGround(double ground) {
        this.ground = ground;
    }

}
