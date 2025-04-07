import edu.fcps.karel2.Display;

public class EX03 {
    public static void main(String[] args) {
        Display.openWorld("mop.map");
        Display.setSize(10, 10);
        Display.setSpeed(5);

        new Thread(new MopBot()).start();
    }
}
