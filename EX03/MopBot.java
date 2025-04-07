import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class MopBot extends Robot implements Runnable {

    public MopBot() {
        super(8, 1, Display.WEST, Display.INFINITY);
    }

    public void run() {
         goup();
         godown();
         
            }
     public void turnAround()
      {
        turnLeft();
        turnLeft();
      }
      public void turnRight()
      {
       turnLeft();
       turnLeft();
       turnLeft();
       } 
      public void pandm(){
         putBeeper();
         move();
         }
      public void pandm2(){
         putBeeper();
         move();
         putBeeper();
         move();
         }
     public void pandm3(){
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         }
     public void goup(){
      pandm3();
      pandm3();
      pandm();
      putBeeper();
      turnAround();
      
      move();
      turnLeft();
      move();
      turnRight();
      pandm3();
      pandm2();
      putBeeper();
      turnAround();
      move();
      turnRight();
      move();
      turnLeft();
      pandm2();
      putBeeper();
      turnRight();
      move();
      turnLeft();
      move();
      turnAround();
      pandm3();
      pandm();
      putBeeper();
      turnLeft();
      move();
      turnRight();
      move();
      turnAround();
      pandm3();
      pandm();
      putBeeper();
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnAround();
      pandm3();
      pandm3();
      pandm2();
      putBeeper();
      turnAround();
      move();
      turnRight();
      move();
      turnLeft();
      pandm3();
      pandm2();
      putBeeper();
      turnAround();
      move();
      turnLeft();
      move();
      turnRight();
      pandm2();
      putBeeper();
      turnAround();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      pandm();
      putBeeper();
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnAround();
      pandm3();
      pandm3();
      pandm2();
      putBeeper();
      turnAround();
      }
    public void pandn(){
         pickBeeper();
         move();
         }
      public void pandn2(){
         pickBeeper();
         move();
         pickBeeper();
         move();
         }
     public void pandn3(){
         pickBeeper();
         move();
         pickBeeper();
         move();
         pickBeeper();
         move();
         }

    public void godown(){
      pandn3();
      pandn3();
      pandn2();
      pickBeeper();
      turnAround();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      pandn();
      pickBeeper();
      turnRight();
      move();
      turnLeft();
      pandn2();
      pickBeeper();
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnAround();
      pandn3();
      pandn2();
      pickBeeper();
      turnLeft();
      move();
      turnRight();
      move();
      move();
      turnAround();
      pandn3();
      pandn3();
      pandn2();
      pickBeeper();
      turnAround();
      move();
      move();
      turnLeft();
      move();
      turnRight();
      pandn2();
      pandn2();
      pickBeeper();
      turnLeft();
      move();
      turnRight();
      move();
      turnAround();
      pandn2();
      pandn2();
      pickBeeper();
      turnAround();
      move();
      turnLeft();
      move();
      turnRight();
      pandn2();
      pickBeeper();
      turnLeft();
      move();
      turnRight();
      move();
      move();
      turnAround();
      pandn3();
      pandn2();
      pickBeeper();
      turnRight();
      move();
      turnLeft();
      move();
      turnAround();
      pandn3();
      pandn3();
      pandn();
      pickBeeper();
      turnAround();
      
      
            }

    }
