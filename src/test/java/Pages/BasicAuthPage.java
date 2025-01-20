package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BasicAuthPage extends SeleniumBasePage {

    public static BasicAuthPage Instance = new BasicAuthPage();

    public void enterThePage(){
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }

    public void robotAuth() throws AWTException {
        Robot robot = new Robot();

        admin(robot);
        tab(robot);
        admin(robot);
        enter(robot);
    }

    public void assertText(){
        String pageMessage = driver.findElement(By.xpath("/html/body/div[2]/div/div/p")).getText();
        assertThat(pageMessage, containsString("Congratulations!"));
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
