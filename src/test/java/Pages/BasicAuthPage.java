package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class BasicAuthPage extends SeleniumBasePage {

    public static BasicAuthPage Instance = new BasicAuthPage();

    public void enterThePage(){
        // Используем URL с указанием логина и пароля
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    public void assertText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"example\"]/p")));

        String pageMessage = driver.findElement(By.xpath("//*[@class=\"example\"]/p")).getText();
        assertThat(pageMessage, containsString("Congratulations!"));
    }
}
