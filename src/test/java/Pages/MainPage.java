package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;

public class MainPage extends SeleniumBasePage {

    public static MainPage Instance = new MainPage();

    public void clickOnAddRemoveElementsLink() {
        driver.findElement(By.xpath("//*[contains(text(), 'Add/Remove Elements')]")).click();
    }

    public void clickOnBasicAuth() {
        driver.findElement(By.xpath("//*[contains(text(), 'Basic Auth')]")).click();
    }

    public void clickOnBrokenImages() {
        driver.findElement(By.xpath("//*[contains(text(), 'Broken Images')]")).click();
    }

    public void clickOnChallengingDom() {
        driver.findElement(By.xpath("//*[contains(text(), 'Challenging DOM')]")).click();
    }

    public void clickOnCheckboxes() {
        driver.findElement(By.xpath("//*[contains(text(),'Checkboxes')]")).click();
    }

    public void clickOnContextMenu() {
        driver.findElement(By.xpath("//*[contains(text(), 'Context Menu')]")).click();
    }

    public void clickOnDisappearingElements() {
        driver.findElement(By.xpath("//*[contains(text(),'Disappearing Elements')]")).click();
    }

    public void clickOnDragAndDrop() {
        driver.findElement(By.xpath("//*[contains(text(),'Drag and Drop')]")).click();
    }
}
