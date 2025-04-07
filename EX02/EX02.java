import edu.fcps.karel2.Display;

public class EX02 {
    public static void main(String[] args) {
        Display.openWorld("NUMB.map");
        Display.setSize(10, 10);
        Display.setSpeed(10);

        new Thread(new Robot1()).start();
        new Thread(new Robot2()).start();
    }
}
