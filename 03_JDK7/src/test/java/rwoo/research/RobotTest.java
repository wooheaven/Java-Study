package rwoo.research;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotTest {
    private Robot robot;

    @Before
    public void setup() throws AWTException {
        robot = new Robot();
    }

    @Test
    public void test_Robot_KeyboarMouthEvent() {
        robot.setAutoDelay(40);
        robot.setAutoWaitForIdle(true);

        delay(1000);
        mouseMove(35, 63);
        leftClick();
        type("gedit");
        mouseMove(165, 170);
        leftClick();
        delay(2000);
        type("Hello, world");
        type(KeyEvent.VK_ENTER);
        type("Hello, world2");
        altF4();
        type(KeyEvent.VK_LEFT);
        type(KeyEvent.VK_LEFT);
        type(KeyEvent.VK_LEFT);
        type(KeyEvent.VK_ENTER);
    }

    @Test
    public void test_Robot_getMouthLocation() {
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x = (int) b.getX();
        int y = (int) b.getY();
        System.out.print(x +"\t" + y);
    }

    private void delay(int ms) {
        robot.delay(ms);
    }

    private void mouseMove(int x, int y) {
        robot.delay(100);
        robot.mouseMove(x, y);
        robot.delay(100);
    }

    private void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
    }

    private void type(int i) {
        robot.delay(100);
        robot.keyPress(i);
        robot.keyRelease(i);
    }

    private void type(String s) {
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            int code = b;
            // keycode only handles [A-Z] (which is ASCII decimal [65-90])
            if (code > 96 && code < 123) code = code - 32;
            robot.delay(100);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }

    private void altF4() {
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.delay(100);
    }
}
