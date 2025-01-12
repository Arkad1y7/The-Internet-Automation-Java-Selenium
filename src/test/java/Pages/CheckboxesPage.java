package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage extends SeleniumBasePage {
    @FindBy(xpath = "//*[@type='checkbox'][1]")
    private WebElement firstCheckbox;

    @FindBy(xpath = "//*[@type='checkbox'][2]")
    private WebElement secondCheckbox;

    public static CheckboxesPage Instance = new CheckboxesPage();

    public CheckboxesPage() {
        PageFactory.initElements(driver, this);
    }

    public void TwoCheckboxes() {
        secondCheckbox.click(); // кликаю по второму чтобы проверить оба чекбокса

        if(firstCheckbox.getAttribute("checked") == null) {
            firstCheckbox.click();
        }
        if(secondCheckbox.getAttribute("checked") == null) {
            secondCheckbox.click();
        }
    }
}
