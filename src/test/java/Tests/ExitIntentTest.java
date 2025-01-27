package Tests;

import Pages.ExitIntentPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ExitIntentTest extends SeleniumBaseTest {

    @Test
    public void exitIntentTest() throws AWTException {
        ExitIntentPage.Instance.enterThePage();
        ExitIntentPage.Instance.exitIntent();
    }
}
