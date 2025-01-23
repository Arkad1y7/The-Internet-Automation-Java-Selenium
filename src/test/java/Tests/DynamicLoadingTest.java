package Tests;

import Pages.DynamicLoadingPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicLoadingTest extends SeleniumBaseTest {

    @Test
    public void dynamicLoadingAfterTheFactTest() {
        DynamicLoadingPage.Instance.enterThePage();
        DynamicLoadingPage.Instance.elementRenderedAfterTheFact();
    }

    @Test
    public void dynamicLoadingThatIsHiddenTest() {
        DynamicLoadingPage.Instance.enterThePage();
        DynamicLoadingPage.Instance.elementOnPageThatIsHidden();
    }
}
