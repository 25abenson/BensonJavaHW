package animate;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Application extends JFrame {

    public static int FRAME_WIDTH = 1080;
    public static int FRAME_HEIGHT = 720;

    // constructor.
    public Application(String title) {
        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;

        // add a Board to our JFrame.
        Board board = new Board();
        this.add(board);

        // set the size based on the board size
        // and also account for the border width and the bar height.
        int application_height = (int) board.getPreferredSize().getHeight() + bar_height + border_width;
        int application_width = (int) board.getPreferredSize().getWidth() + 2 * border_width;
        this.setSize(application_width, application_height);
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

        // int application_width = FRAME_WIDTH + 2 * border_width;
        // int application_height = FRAME_HEIGHT + bar_height + border_width;
        this.setTitle(title);
        this.setSize(application_width, application_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

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

    public static void main(String[] args) {

        // this is the bad way of doing it
        // Application a = new Application("Winter 2025 Demo");
        // a.setVisible(true);

        // line that happens where computer processes graphics, adds the graphic to the
        // line within computer
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });

    }
}