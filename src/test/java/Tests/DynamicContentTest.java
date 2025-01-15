package Tests;

import Pages.DynamicContentPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicContentTest extends SeleniumBaseTest {

    @Test
    public void dynamicContentTest() {
        MainPage.Instance.clickOnDynamicContent();
        DynamicContentPage.Instance.checkEvent(4,7);
    }

    @Test
    public void dynamicContentWithStaticTest() {
        MainPage.Instance.clickOnDynamicContentWithStatic();
        DynamicContentPage.Instance.checkEvent(4,7);
    }
}
