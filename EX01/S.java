import edu.fcps.Digit;

public class S extends Digit implements Runnable{

   public S(int x,int y){
      super(x,y);
      
   }
   public void run() {
        display();
    }
   public void display(){
      segment1_On();
      segment2_Off();
      segment3_On();
      segment4_On();
      segment5_Off();
      segment6_On();
      segment7_On();
   
   }}