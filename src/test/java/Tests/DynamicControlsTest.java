package Tests;

import Pages.DynamicControlsPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicControlsTest extends SeleniumBaseTest {

    @Test
    public void DynamicControlsRemoveAddTest() {
        DynamicControlsPage.Instance.enterThePage();
        DynamicControlsPage.Instance.RemoveAdd();
    }

    @Test
    public void DynamicControlsEnableDisableTest() {
        DynamicControlsPage.Instance.enterThePage();
        DynamicControlsPage.Instance.EnableDisable();
    }
}
