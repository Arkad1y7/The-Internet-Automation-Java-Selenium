package Tests;

import Pages.ContextMenuPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends SeleniumBaseTest {

    @Test
    public void contextMenuTest() {
        MainPage.Instance.clickOnContextMenu();
        ContextMenuPage.Instance.clickContextMenu();
    }
}
