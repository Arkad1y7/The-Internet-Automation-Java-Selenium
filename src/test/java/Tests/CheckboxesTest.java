package Tests;

import Pages.CheckboxesPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class CheckboxesTest extends SeleniumBaseTest {

    @Test
    public void checkboxesTest() {
        CheckboxesPage.Instance.enterThePage();
        CheckboxesPage.Instance.TwoCheckboxes();
    }
}
