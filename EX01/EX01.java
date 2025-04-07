import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;


 public class EX01 {

	public static void main(String[] args) {
	
   
         
      Display.openDefaultWorld();
      Display.setSize(36, 32);
      Display.setSpeed(10);
      new Thread(new E(2, 18)).start();
      new Thread(new E(9, 18)).start();
      new Thread(new C(16, 18)).start();  
      new Thread(new S(23, 18)).start(); 
      new Thread(new Dash(9, 9)).start();
      new Thread(new One(16, 9)).start();
      new Thread(new Four(23, 9)).start(); 
        
         }
}