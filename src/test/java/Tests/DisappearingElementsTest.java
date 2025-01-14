package Tests;

import Pages.DisappearingElementsPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DisappearingElementsTest extends SeleniumBaseTest {

    @Test
    public void disappearingElementsTest() {
        MainPage.Instance.clickOnDisappearingElements();
        DisappearingElementsPage.Instance.buttonIsVisible();
    }
}
