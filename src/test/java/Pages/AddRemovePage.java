package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemovePage extends SeleniumBasePage {
    @FindBy (xpath = "//*[@id=\"content\"]/div/button")
    private WebElement addButton;

    @FindBy (xpath = "//*[@id=\"elements\"]/button")
    private WebElement removeButton;

    public AddRemovePage () {
        PageFactory.initElements(driver, this);
    }

    public AddRemovePage addElement() {
        addButton.click();
        return this;
    }

    public AddRemovePage removeElement() {
        removeButton.click();
        return this;
    }

}
