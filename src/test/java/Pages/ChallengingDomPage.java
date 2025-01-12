package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;

public class ChallengingDomPage extends SeleniumBasePage {

    public static ChallengingDomPage Instance = new ChallengingDomPage();

    public void clickBlueButton() {
        driver.findElement(By.xpath("//*[@class=\"button\"]")).click();
    }

    public void clickRedButton() {
        driver.findElement(By.xpath("//*[@class=\"button alert\"]")).click();
    }

    public void clickGreenButton() {
        driver.findElement(By.xpath("//*[@class=\"button success\"]")).click();
    }
}
