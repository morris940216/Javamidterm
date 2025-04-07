import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Robot1 extends Robot implements Runnable {

    public Robot1() {
        super(1, 1, Display.EAST, 0);
    }

    public void run() {
       pick();
       goToNextRow();
       turnLeft();
       turnLeft();
       move();
       move();
       move();
       move();
       move();
       move();
       move();
       turnLeft();
       turnLeft();
       pick();
       move();
       

       
       
       
       
       
           }

    private void goToNextRow() {
        faceNorth();
        move();
        faceEast();
    }

    private void faceNorth() {
        while (!facingNorth()) {
            turnLeft();
        }
    }

    private void faceEast() {
        while (!facingEast()) {
            turnLeft();
        }
    }
     private void pick() {
       move();
       pickBeeper();
       pickBeeper();
       move();
       putBeeper();
       putBeeper();
       move();
       pickBeeper();
       pickBeeper();
       pickBeeper();
       pickBeeper();
       pickBeeper();
       pickBeeper();
       pickBeeper();
       move();
       putBeeper();
       putBeeper();
       putBeeper();
       putBeeper();
       putBeeper();
       putBeeper();
       putBeeper();
       move();
       pickBeeper();
       
       move();
       pickBeeper();
       pickBeeper();
       pickBeeper();
       move();
       putBeeper();
       putBeeper();
       putBeeper();
       putBeeper();    }
}
