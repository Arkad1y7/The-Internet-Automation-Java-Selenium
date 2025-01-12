package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.event.KeyEvent;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasicAuthPage extends SeleniumBasePage {
    @FindBy(xpath = "//*[@id=\"content\"]/div/p")
    private WebElement successfulAuthentication;

    public BasicAuthPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isPresent(){
        return successfulAuthentication.isDisplayed();
    }

    public void robotAuth() throws AWTException {
        Robot robot = new Robot();
        admin(robot);
        tab(robot);
        admin(robot);
        enter(robot);
        assertTrue(isPresent(),"Auth failed");
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
