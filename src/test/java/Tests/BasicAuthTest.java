package Tests;

import Pages.BasicAuthPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class BasicAuthTest extends SeleniumBaseTest {

    @Test
    public void testBasicAuth() throws AWTException {
        MainPage.Instance.clickOnBasicAuth();
        BasicAuthPage.Instance.robotAuth();
    }
}
