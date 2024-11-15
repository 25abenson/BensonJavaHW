// Alex Benson
// Lesson 13 Part C HW
// 11/15/24

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartC {
     /*
     * Change the following method to customize
     * what is drawn in the JFrame.
     */
    public static void draw(Graphics g) {
        // by default, this method draws a pink square

        g.setColor(Color.PINK);
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.BLACK);

        //assign the variables
        int numtimes = 10000; 
        double numsteps = (2 * Math.PI) / numtimes;
        int scale = 150;
        double a = 0;
        double r = 0;
        double x = 0;
        double y = 0;
        int plotX = (int)x;
        int plotY = (int)y;

        //this is the loop to plot points
        for (int i = 0; i <= numtimes; i++){
            plotPoint(plotX, plotY, g);

            a = a + numsteps;
            r = Math.cos(2 * a);
            x = scale * r * Math.cos(a);
            y = scale * r * Math.sin(a);
            plotX = (int)x;
            plotY = (int)y;
        }
        
        

    }

    //centers design in middle of square, not the upper left corner
    public static void plotPoint(int x, int y, Graphics g){
        int plotX = x + 200;
        int plotY = y + 200;
        g.fillOval(plotX, plotY, 1, 1);
    }

    

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }

        return val;
    }

    // Do not modify the code in the main method.
    // Your code will go into the draw method above.
    public static void main(String[] args) {
        // this is the desired dimensions of the content area
        // of our JFrame window.
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }

}

