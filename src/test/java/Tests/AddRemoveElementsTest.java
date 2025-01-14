package Tests;

import Pages.AddRemovePage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class AddRemoveElementsTest extends SeleniumBaseTest {

    @Test
    public void addRemoveElement() {
        MainPage.Instance.clickOnAddRemoveElementsLink();
        AddRemovePage.Instance.addElement();
        AddRemovePage.Instance.removeElement();
    }
}
