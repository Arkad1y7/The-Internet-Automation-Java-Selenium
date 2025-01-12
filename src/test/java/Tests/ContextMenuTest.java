package Tests;

import Pages.ContextMenuPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends SeleniumBaseTest {
    @Test
    public void contextMenuTest() {
        MainPage mainPage = new MainPage();
        ContextMenuPage contextMenuPage = new ContextMenuPage();

        mainPage.clickOnContextMenu();
        contextMenuPage.clickContextMenu();
    }
}
