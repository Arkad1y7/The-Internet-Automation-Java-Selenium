package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage extends SeleniumBasePage {
    public static DynamicLoadingPage Instance = new DynamicLoadingPage();

    public void enterThePage(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    public void DynamicallyLoadedPageElements() {
        driver.findElement(By.xpath("//*[@id = 'start']/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"))));
            System.out.println("PASS: Hello word on the page!");
        }catch (TimeoutException e){
            throw new TimeoutException("Error", e);
        }
    }
}
