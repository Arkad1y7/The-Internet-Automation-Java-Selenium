package Tests;

import Pages.DynamicControlsPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicControlsTest extends SeleniumBaseTest {

    @Test
    public void dynamicControlsRemoveAddTest() {
        DynamicControlsPage.Instance.enterThePage();
        DynamicControlsPage.Instance.removeAdd();
    }

    @Test
    public void dynamicControlsEnableDisableTest() {
        DynamicControlsPage.Instance.enterThePage();
        DynamicControlsPage.Instance.enableDisable();
    }
}
