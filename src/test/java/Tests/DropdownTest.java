package Tests;

import Pages.DropdownPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DropdownTest extends SeleniumBaseTest {

    @Test
    public void dropdownAllElementsTest(){
        DropdownPage.Instance.enterThePage();
        DropdownPage.Instance.dropdownAll();
    }

    @Test
    public void dropdownOneElementTest(){
        DropdownPage.Instance.enterThePage();
        DropdownPage.Instance.dropdownOne();
    }
}
