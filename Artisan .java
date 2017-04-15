package Javinha;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;
import javax.swing.JFrame;

public class Main
{

    public Main()
    {
    }

    public static void main(String args[])
        throws AWTException
    {
        new Random();
        Robot robot = new Robot();
        JFrame frame = new JFrame();
        frame.setTitle("Tempo Proximo Click = 10");
        frame.setSize(500, 0);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        for(int i = 10; i >= 0; i--)
        {
            robot.delay(100);
            frame.setTitle((new StringBuilder("Tempo Proximo Click = ")).append(i).toString());
        }

        do
        {
            robot.mouseMove(884, 380);
            robot.mousePress(16);
            robot.mouseRelease(16);
            robot.delay(60000);
            robot.keyPress(50);
            robot.delay(100);
            robot.keyRelease(50);
            robot.delay(60000);
            robot.keyPress(51);
            robot.delay(100);
            robot.keyRelease(51);
            robot.delay(60000);
            robot.keyPress(52);
            robot.delay(100);
            robot.keyRelease(52);
            robot.delay(60000);
            robot.keyPress(48);
            robot.delay(100);
            robot.keyRelease(48);
            robot.delay(17000);
            robot.mouseMove(619, 448);
            robot.mousePress(16);
            robot.mouseRelease(16);
            robot.delay(3000);
            robot.mouseMove(552, 414);
            robot.mousePress(16);
            robot.mouseRelease(16);
            robot.delay(1700);
            robot.keyPress(32);
            robot.delay(100);
            robot.keyRelease(32);
            robot.delay(5000);
        } while(true);
    }
}
