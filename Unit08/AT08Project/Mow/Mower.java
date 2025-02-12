package Mow;

import java.util.Random;

import Mow.Yard;

public class Mower {

    private int verticalPosition;
    private int horizontalPosition;
    private int direction;

    // get horizontal position
    public int getHorizontalPos() {
        return horizontalPosition;
    }

    // get vertical position
    public int getVerticalPos() {
        return verticalPosition;
    }

    // set horizontal
    public void setHorizontalPos(int inputcol) {
        horizontalPosition = inputcol;
    }

    // set vertical
    public void setVerticalPos(int inputrow) {
        verticalPosition = inputrow;
    }

    // get direction
    public int getDirection() {
        return direction;
    }

    // set direction method
    public void setDirection(int inputdirection) {
        // 0 = upwards
        // 1 = right
        // 2 = down
        // 3 = left
        if (0 <= inputdirection && inputdirection < 3) {
            direction = inputdirection;
        } else {
            System.err.println("Direction entered is not a number between 0 and 3. Please enter a new direction.");
        }
    }

    // mower moves forward one spot
    public void moveMower() {
        if (direction == 0) {
            verticalPosition--;
        } else if (direction == 1) {
            horizontalPosition++;
        } else if (direction == 2) {
            verticalPosition++;
        } else {
            horizontalPosition--;
        }
    }

    // turn left
    public void turnLeft() {
        direction--;
        if (direction < 0) {
            direction = 3;
        } else if (direction > 3) {
            direction = 0;
        }
    }

    // turn right
    public void turnRight() {
        direction++;
        if (direction < 0) {
            direction = 4;
        } else if (direction > 3) {
            direction = 0;
        }
    }

    // mow function
    public void mowSpace(Yard currentYard) {
        currentYard.setLawnSquare(getVerticalPos(), getHorizontalPos(), ' ');
    }

    // check square infront of it function
    public boolean checkSquare(Yard inputYard) {
        if (direction == 0 && (inputYard.getLawnSquare(getVerticalPos() - 1, getHorizontalPos()) == 'R'
                || inputYard.getLawnSquare(getVerticalPos() - 1, getHorizontalPos()) == ' ')) {
            return true;
        } else if (direction == 1 && (inputYard.getLawnSquare(getVerticalPos(), getHorizontalPos() + 1) == 'R'
                || inputYard.getLawnSquare(getVerticalPos(), getHorizontalPos() + 1) == ' ')) {
            return true;
        } else if (direction == 2 && (inputYard.getLawnSquare(getVerticalPos() + 1, getHorizontalPos()) == 'R'
                || inputYard.getLawnSquare(getVerticalPos() + 1, getHorizontalPos()) == ' ')) {
            return true;
        } else if (direction == 3 && (inputYard.getLawnSquare(getVerticalPos(), getHorizontalPos() - 1) == 'R'
                || inputYard.getLawnSquare(getVerticalPos(), getHorizontalPos() - 1) == ' ')) {
            return true;
        }
        return false;
    }

    // randomize location
    public void randomize(Yard inputYard) {
        // get width and height of yard
        int yardwidth = inputYard.getWidth();
        int yardheight = inputYard.getHeight();

        // randomize one of the four corners
        Random rand = new Random();
        int corner = rand.nextInt(4) + 1;

        // place the mower in one of the four corners
        if (corner == 1) { // bottom left
            setHorizontalPos(1);
            setVerticalPos(yardheight);
        } else if (corner == 2) { // top left
            setHorizontalPos(1);
            setVerticalPos(1);
        } else if (corner == 3) { // bottom right
            setHorizontalPos(yardwidth);
            setVerticalPos(yardheight);
        } else { // top right
            setHorizontalPos(yardwidth);
            setVerticalPos(1);
        }

        // randomize direction
        direction = rand.nextInt(4);
    }

    // update mower left
    public boolean updateLeftMower(Yard inputYard) {
        char squareLeft;
        if (direction == 0) {
            squareLeft = inputYard.getLawnSquare(verticalPosition, horizontalPosition - 1);
        } else if (direction == 1) {
            squareLeft = inputYard.getLawnSquare(verticalPosition - 1, horizontalPosition);
        } else if (direction == 2) {
            squareLeft = inputYard.getLawnSquare(verticalPosition, horizontalPosition + 1);
        } else {
            squareLeft = inputYard.getLawnSquare(verticalPosition + 1, horizontalPosition);
        }
        if (squareLeft == '+') {
            return true;
        } else {
            return false;
        }
    }

    // update mower right
    public boolean updateRightMower(Yard inputYard) {
        char squareRight;
        if (direction == 0) {
            squareRight = inputYard.getLawnSquare(verticalPosition, horizontalPosition + 1);
        } else if (direction == 1) {
            squareRight = inputYard.getLawnSquare(verticalPosition + 1, horizontalPosition);
        } else if (direction == 2) {
            squareRight = inputYard.getLawnSquare(verticalPosition, horizontalPosition - 1);
        } else {
            squareRight = inputYard.getLawnSquare(verticalPosition - 1, horizontalPosition);
        }
        if (squareRight == '+') {
            return true;
        } else {
            return false;
        }
    }
}
