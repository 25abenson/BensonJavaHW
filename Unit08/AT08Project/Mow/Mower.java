package Mow;

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
            direction = 4;
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
    public void checkSquare(Yard inputYard) {
        Yard temporaryYard = inputYard;
        if (direction == 0 || temporaryYard.getLawnSquare(getVerticalPos() + 1, getHorizontalPos()) == 'R') {
            turnRight();
        } else if (direction == 1 || temporaryYard.getLawnSquare(getVerticalPos(), getHorizontalPos() + 1) == 'R') {
            turnRight();
        } else if (direction == 2 || temporaryYard.getLawnSquare(getVerticalPos() - 1, getHorizontalPos()) == 'R') {
            turnRight();
        } else if (direction == 3 || temporaryYard.getLawnSquare(getVerticalPos(), getHorizontalPos() - 1) == 'R') {
            turnRight();
        }
    }
}
