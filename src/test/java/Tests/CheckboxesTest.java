package Tests;

import Pages.CheckboxesPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class CheckboxesTest extends SeleniumBaseTest {
    @Test
    public void CheckboxesTest() {
        MainPage mainPage = new MainPage();
        CheckboxesPage checkboxesPage = new CheckboxesPage();
        mainPage.clickOnCheckboxes();
        checkboxesPage.TwoCheckboxes();
    }
}
