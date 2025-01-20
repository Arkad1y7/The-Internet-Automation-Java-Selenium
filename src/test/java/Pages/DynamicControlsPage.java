package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsPage extends SeleniumBasePage{

    public static DynamicControlsPage Instance = new DynamicControlsPage();

    public void enterThePage(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    public void RemoveAdd() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        if (checkbox.isDisplayed()) {
            driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();

            try {
                wait.until(ExpectedConditions.invisibilityOf(checkbox)); //wait until checkbox to be invisible
            } catch (TimeoutException e) {
                throw new TimeoutException("FAIL: Checkbox did not disappear within the expected time", e);
            }

            try {
                driver.findElement(By.cssSelector("input[type='checkbox']"));
            } catch (Exception e) {
                System.out.println("PASS: Checkbox after click button \"Remove\" is no longer present on the page after the action");
            }
        }
    }

    public void EnableDisable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("button[onclick = 'swapInput()']")).click();

        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=text]")));
            System.out.println("Field now enabled");
        }catch (TimeoutException e) {
            throw new TimeoutException("FAIL: Field disabled within the expected time", e);
        }

        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("test");

        try {
            driver.findElement(By.cssSelector("button[onclick = 'swapInput()']")).click();
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=text]"))));
            System.out.println("PASS: Field now disabled");
        }catch (TimeoutException e) {
            throw new TimeoutException("FAIL: Field still enabled within the expected time", e);
        }
    }
}
