package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ContextMenuPage extends SeleniumBasePage {
    @FindBy(xpath = "//*[@id = 'hot-spot']")
    private WebElement contextMenu;

    public ContextMenuPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickContextMenu() {
        new Actions(driver)
                .contextClick(contextMenu)
                .perform();

        String alertText = driver.switchTo().alert().getText();
        assertThat(alertText, is(equalTo("You selected a context menu")));
    }
}
