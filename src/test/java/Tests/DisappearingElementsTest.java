package Tests;

import Pages.DisappearingElementsPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DisappearingElementsTest extends SeleniumBaseTest {

    @Test
    public void disappearingElementsTest() throws Exception {
        DisappearingElementsPage.Instance.enterThePage();
        DisappearingElementsPage.Instance.buttonIsVisible();
    }
}
