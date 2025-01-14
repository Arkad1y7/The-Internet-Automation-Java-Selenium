package Tests;

import Pages.CheckboxesPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class CheckboxesTest extends SeleniumBaseTest {

    @Test
    public void checkboxesTest() {
        MainPage.Instance.clickOnCheckboxes();
        CheckboxesPage.Instance.TwoCheckboxes();
    }
}
