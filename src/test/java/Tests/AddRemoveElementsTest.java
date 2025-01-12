package Tests;

import Pages.AddRemovePage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class AddRemoveElementsTest extends SeleniumBaseTest {

    @Test
    public void addRemoveElement() {
        AddRemovePage addRemovePage = new AddRemovePage();
        MainPage mainPage = new MainPage();

        mainPage.clickOnAddRemoveElementsLink();
        addRemovePage.addElement()
                .removeElement();

    }
}
