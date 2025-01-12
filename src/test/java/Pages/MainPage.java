package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends SeleniumBasePage {
    @FindBy (xpath = "//*[contains(text(),'A/B Testing')]")
    private WebElement abLink;

    @FindBy (xpath = "//*[contains(text(), 'Add/Remove Elements')]")
    private WebElement addRemoveElementsLink;

    @FindBy (xpath = "//*[contains(text(), 'Basic Auth')]")
    private WebElement basicAuth;

    @FindBy (xpath = "//*[contains(text(), 'Broken Images')]")
    private WebElement brokenImages;

    @FindBy (xpath = "//*[contains(text(), 'Challenging DOM')]")
    private WebElement challengingDom;

    @FindBy (xpath = "//*[contains(text(),'Checkboxes')]")
    private WebElement checkboxes;

    @FindBy (xpath = "//*[contains(text(), 'Context Menu')]")
    private WebElement contextMenu;

    @FindBy(xpath = "//*[contains(text(),'Disappearing Elements')]")
    private WebElement disappearingElements;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAbLink() {
        abLink.click();
    }

    public void clickOnAddRemoveElementsLink() {
        addRemoveElementsLink.click();
    }

    public void clickOnBasicAuth() {
        basicAuth.click();
    }

    public void clickOnBrokenImages() {
        brokenImages.click();
    }

    public void clickOnChallengingDom() {
        challengingDom.click();
    }

    public void clickOnCheckboxes() {
        checkboxes.click();
    }

    public void clickOnContextMenu() {
        contextMenu.click();
    }

    public void clickOnDisappearingElements() {
        disappearingElements.click();
    }
}
