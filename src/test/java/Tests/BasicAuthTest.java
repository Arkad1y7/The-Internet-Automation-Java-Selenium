package Tests;

import Pages.BasicAuthPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class BasicAuthTest extends SeleniumBaseTest {

    @Test
    public void testBasicAuth() throws AWTException {
        BasicAuthPage.Instance.enterThePage();
        BasicAuthPage.Instance.robotAuth();
        BasicAuthPage.Instance.assertText();
    }
}
