package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExitIntentPage extends SeleniumBasePage {
    static public ExitIntentPage Instance = new ExitIntentPage();

    public void enterThePage() {
        driver.get("https://the-internet.herokuapp.com/exit_intent");
    }

    public void exitIntent() throws AWTException {
        Robot robot = new Robot();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

        int height = driver.manage().window().getSize().height;
        int width = driver.manage().window().getSize().width;
        robot.mouseMove(100,100);
        robot.mouseMove(-(width + 100), -(height + 100));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='modal']"))));
        assertThat(driver.findElement(By.xpath("//*[@class = 'modal-title']")).getText(), is("THIS IS A MODAL WINDOW"));
    }
}
