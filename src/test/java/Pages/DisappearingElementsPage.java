package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DisappearingElementsPage extends SeleniumBasePage {

    public static DisappearingElementsPage Instance = new DisappearingElementsPage();

    public void buttonIsVisible() {
        try{
            WebElement galleryButton = driver.findElement(By.xpath("//*[contains(text(), 'Gallery')]"));
            System.out.println("Element found");
        } catch (Exception e) {
            System.out.println("Element not found");
        }
    }
}
