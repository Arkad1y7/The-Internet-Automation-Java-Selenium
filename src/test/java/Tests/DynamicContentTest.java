package Tests;

import Pages.DynamicContentPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicContentTest extends SeleniumBaseTest {

    @Test
    public void dynamicContentTest() {
        DynamicContentPage.Instance.enterThePage();
        DynamicContentPage.Instance.checkEvent(4,7);
    }

    @Test
    public void dynamicContentWithStaticTest() {
        DynamicContentPage.Instance.enterThePage();
        DynamicContentPage.Instance.checkEvent(4,7);
    }
}
