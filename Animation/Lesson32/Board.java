package Lesson32;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JPanel;

import sound.SoundClip;

public class Board extends JPanel implements KeyListener, MouseListener {

    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private final int DIAMETER = 20;
    private int x = 0;
    private int y = 0;
    private int clickX;
    private int clickY;

    // constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // make our panel focusable
        this.setFocusable(true);

        // register our key listener
        this.addKeyListener(this);

        // register mouse on key board
        this.addMouseListener(this);

        x = B_WIDTH / 2;
        y = B_HEIGHT / 2;
    }

    // override methods from keylistener
    public void keyTyped(KeyEvent e) {

        char keyChar = e.getKeyChar();

        if (keyChar == ' ') {

            String path = "media/blop.wav";
            SoundClip audioFile = new SoundClip(path);
            audioFile.open();
            audioFile.play(true);
            audioFile.close();

            x = B_WIDTH / 2;
            y = B_HEIGHT / 2;

            repaint();
        }
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseClicked'");

        clickX = e.getX();
        clickY = e.getY();

        x = clickX;
        y = clickY;

        repaint();

        String path = "media/blip.wav";
        SoundClip audioFile = new SoundClip(path);
        audioFile.open();
        audioFile.play(true);
        audioFile.close();

    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mousePressed'");
    }

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseReleased'");
    }

    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseEntered'");
    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseExited'");
    }

    // override paintComponent() method
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // casting graphics as Graphics2D
        Graphics2D g2D = (Graphics2D) g;

        // shift or translate the square from 0,0 to center
        // translate in the x and y directions.
        AffineTransform af = new AffineTransform();

        af.translate(x - DIAMETER / 2, y - DIAMETER / 2);

        // get translated shape
        Ellipse2D ellipse = new Ellipse2D.Double(0, 0, DIAMETER, DIAMETER);
        Shape transformedShape = af.createTransformedShape(ellipse);

        // draw the transformed shape on the screen.
        g2D.setColor(Color.MAGENTA);
        g2D.fill(transformedShape);

    }

}
