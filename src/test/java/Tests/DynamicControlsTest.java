package Tests;

import Pages.DynamicControlsPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicControlsTest extends SeleniumBaseTest {

    @Test
    public void DynamicControlsRemoveAddTest() {
        MainPage.Instance.clickOnDynamicControls();
        DynamicControlsPage.Instance.RemoveAdd();
    }

    @Test
    public void DynamicControlsEnableDisableTest() {
        MainPage.Instance.clickOnDynamicControls();
        DynamicControlsPage.Instance.EnableDisable();
    }
}
