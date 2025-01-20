package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class ContextMenuPage extends SeleniumBasePage {

    public static ContextMenuPage Instance = new ContextMenuPage();

    public void enterThePage(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    public void clickContextMenu() {
        new Actions(driver)
                .contextClick(driver.findElement(By.xpath("//*[@id = 'hot-spot']")))
                .perform();
        String alertText = driver.switchTo().alert().getText();
        assertThat(alertText, is(equalTo("You selected a context menu")));
    }
}
