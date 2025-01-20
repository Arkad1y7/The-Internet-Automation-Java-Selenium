package Tests;

import Pages.AddRemovePage;

import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class AddRemoveElementsTest extends SeleniumBaseTest {

    @Test
    public void addRemoveElement() {
        AddRemovePage.Instance.enterThePage();
        AddRemovePage.Instance.addElement();
        AddRemovePage.Instance.removeElement();
    }
}
