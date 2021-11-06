import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;

public class AutoClicker {
    public static void MainFunction() {
        try {
            while(true){
                leftClick();
                Random r = new Random();
                delay(50+r.nextInt(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    protected static void delay(double seconds){
        createMacro();
        macro.delay((int)(seconds*1000.0));
    }
    protected static void leftClick(){
        createMacro();
        macro.mousePress(MouseEvent.BUTTON1_MASK);
        macro.mouseRelease(MouseEvent.BUTTON1_MASK);
    }

    private static Robot macro = null;
    private static void createMacro(){
        try {
            macro = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MainFunction();

    }
}
