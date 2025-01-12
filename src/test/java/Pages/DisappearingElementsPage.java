package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DisappearingElementsPage extends SeleniumBasePage {
    @FindBy (xpath = "//*[@href='/gallery/']")
    private WebElement galleryButton;

    public DisappearingElementsPage() {
        PageFactory.initElements(driver,this);
    }

    public void buttonIsVisible() {

    }
}
