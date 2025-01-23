package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage extends SeleniumBasePage {

    public static EntryAdPage Instance = new EntryAdPage();

    public void enterThePage() {
        driver.get("https://the-internet.herokuapp.com/entry_ad");
    }

    public void entryAdWindow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]"))));
        driver.findElement(By.xpath("//*[@class = 'modal-footer']/p")).click();
        if(driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]")).isDisplayed()){
            System.out.println("Window is displayed");
        }else{
            System.out.println("Window is not displayed");
        }
    }
}
