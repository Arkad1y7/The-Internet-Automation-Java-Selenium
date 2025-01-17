package Tests;

import Pages.DynamicControlsPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicControlsTest extends SeleniumBaseTest {

    @Test
    public void DynamicControlsTest() throws Exception {
        MainPage.Instance.clickOnDynamicControls();
        DynamicControlsPage.Instance.RemoveAdd();
    }
}
