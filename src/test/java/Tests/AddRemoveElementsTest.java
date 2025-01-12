package Tests;

import Pages.AddRemovePage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class AddRemoveElementsTest extends SeleniumBaseTest {

    @Test
    public void addRemoveElement() {
        AddRemovePage addRemovePage = new AddRemovePage();

        MainPage.Instance.clickOnAddRemoveElementsLink();
        addRemovePage.Instance.addElement();
        addRemovePage.Instance.removeElement();
    }
}
