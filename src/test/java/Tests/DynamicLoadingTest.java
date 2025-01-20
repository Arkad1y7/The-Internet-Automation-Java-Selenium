package Tests;

import Pages.DynamicLoadingPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicLoadingTest extends SeleniumBaseTest {

    @Test
    public void DynamicLoadingTest() {
        DynamicLoadingPage.Instance.enterThePage();
        DynamicLoadingPage.Instance.DynamicallyLoadedPageElements();
    }
}
