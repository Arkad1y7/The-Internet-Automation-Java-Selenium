package SeleniumBase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

abstract public class SeleniumBaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        SeleniumBasePage.setDriver(driver);
        driver.get("http://the-internet.herokuapp.com/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}