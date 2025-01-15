package Tests;

import Pages.DropdownPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DropdownTest extends SeleniumBaseTest {

    @Test
    public void dropdownAllElementsTest(){
        MainPage.Instance.clickOnDropDown();
        DropdownPage.Instance.dropdownAll();
    }

    @Test
    public void dropdownOneElementTest(){
        MainPage.Instance.clickOnDropDown();
        DropdownPage.Instance.dropdownOne();
    }
}
