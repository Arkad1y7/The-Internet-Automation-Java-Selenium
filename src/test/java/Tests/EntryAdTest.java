package Tests;

import Pages.EntryAdPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class EntryAdTest extends SeleniumBaseTest {

    @Test
    public void EntryADTest() {
        EntryAdPage.Instance.enterThePage();
        EntryAdPage.Instance.entryAdWindow();
    }
}
