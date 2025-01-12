package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDomPage extends SeleniumBasePage {
    @FindBy(xpath = "//*[@class=\"button\"]")
    private WebElement blueButton;

    @FindBy(xpath = "//*[@class=\"button alert\"]")
    private WebElement redButton;

    @FindBy(xpath = "//*[@class=\"button success\"]")
    private WebElement greenButton;

    public ChallengingDomPage() {
        PageFactory.initElements(driver, this);
    }

    public ChallengingDomPage clickBlueButton() {
        blueButton.click();
        return this;
    }

    public ChallengingDomPage clickRedButton() {
        redButton.click();
        return this;
    }

    public ChallengingDomPage clickGreenButton() {
        greenButton.click();
        return this;
    }
}
