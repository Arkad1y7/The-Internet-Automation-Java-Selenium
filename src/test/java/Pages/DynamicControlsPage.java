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

        try {
            WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
            if (checkbox.isDisplayed()) {
                driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();

                try {
                    wait.until(ExpectedConditions.invisibilityOf(checkbox)); //wait until checkbox to be invisible
                } catch (TimeoutException e) {
                    System.out.println("FAIL: Checkbox did not disappear within the expected time");
                }

                try {
                    checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='checkbox']"))); //redefining the variable because it is no longer in the DOM
                    assertFalse(checkbox.isEnabled(), "FAIL: Checkbox is still on the page");
                } catch (TimeoutException e) {
                    System.out.println("PASS: Checkbox after click button \"Remove\" is no longer present on the page after the action");
                }
            }
        } catch (TimeoutException e) {
            System.out.println("FAIL: Checkbox was not found within the expected time");
        }
    }
}
