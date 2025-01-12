package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.PageFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AbTestingPage extends SeleniumBasePage {

    public AbTestingPage() {
        PageFactory.initElements(driver, this);
    }

    public void WithCookieAfterVisitingPage(){
        driver.get("https://the-internet.herokuapp.com/abtest");
        String headingText = driver.findElement(By.tagName("h3")).getText();
        assertThat(headingText, startsWith("A/B Test"));
        driver.manage().addCookie(new Cookie("optimizelyOptOut", "true"));
        driver.navigate().refresh();
        headingText = driver.findElement(By.cssSelector("h3")).getText();
        assertThat(headingText, is("No A/B Test"));
    }

    public void WithCookieBeforeVisitingPage(){
        driver.get("https://the-internet.herokuapp.com/abtest");
        driver.manage().addCookie(new Cookie("optimizelyOptOut", "true"));
        driver.get("http://the-internet.herokuapp.com/abtest");
        assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("No A/B Test"));
    }

    public void WithOptOutUrl() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/abtest?optimizely_opt_out=true");
        driver.switchTo().alert().dismiss();

        Thread.sleep(2000);
        assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("No A/B Test"));
        Thread.sleep(2000);
    }
}
