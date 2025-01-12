package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import java.awt.*;
import java.awt.event.KeyEvent;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BasicAuthPage extends SeleniumBasePage {

    public static BasicAuthPage Instance = new BasicAuthPage();

    public void robotAuth() throws AWTException {
        Robot robot = new Robot();

        admin(robot);
        tab(robot);
        admin(robot);
        enter(robot);

        String headingText = driver.findElement(By.tagName("h3")).getText();
        assertThat(headingText, is("Basic Auth"));
    }

    void admin(Robot robot) {
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
    }

    void tab(Robot robot) {
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    void enter(Robot robot) {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}
