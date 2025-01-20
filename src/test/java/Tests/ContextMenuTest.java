package Tests;

import Pages.ContextMenuPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends SeleniumBaseTest {

    @Test
    public void contextMenuTest() {
        ContextMenuPage.Instance.enterThePage();
        ContextMenuPage.Instance.clickContextMenu();
    }
}
