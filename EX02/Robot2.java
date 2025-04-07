import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Robot2 extends Robot implements Runnable {

    public Robot2() {
        super(8, 8, Display.EAST, 0);
    }

    public void run() {
        
            turnLeft();
        turnLeft();
        turnLeft();
            move();
            move();
            move();
            move();
            turnLeft();
        turnLeft();
        turnLeft();
            move();
            move();
            move();
            move();
            turnLeft();
        turnLeft();
        turnLeft();
            move();
            move();
            move();
            move();
            turnLeft();
        turnLeft();
        turnLeft();
            move();
            move();
            move();
            move();
        }
    

}
