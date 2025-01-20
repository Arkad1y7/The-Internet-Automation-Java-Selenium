package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DisappearingElementsPage extends SeleniumBasePage {

    public static DisappearingElementsPage Instance = new DisappearingElementsPage();

    public void enterThePage(){
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");
    }

    public void buttonIsVisible() throws Exception {
        try{
            WebElement galleryButton = driver.findElement(By.xpath("//*[contains(text(), 'Gallery')]"));
            System.out.println("PASS: Element found");
        } catch (Exception e) {
            throw new Exception("FAIL: The element is not on the page", e);
        }
    }
}
