package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DynamicControlsPage extends SeleniumBasePage{

    public static DynamicControlsPage Instance = new DynamicControlsPage();

    public void RemoveAdd() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        if (checkbox.isDisplayed()) {
            driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();

            try {
                wait.until(ExpectedConditions.invisibilityOf(checkbox)); //wait until checkbox to be invisible
            } catch (TimeoutException e) {
                System.out.println("FAIL: Checkbox did not disappear within the expected time");
            }

            try {
                checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
            } catch (Exception e) {
                System.out.println("PASS: Checkbox after click button \"Remove\" is no longer present on the page after the action");
            }
        }
    }
}
