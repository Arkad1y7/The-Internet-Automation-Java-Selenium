package Tests;

import Pages.DynamicLoadingPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class DynamicLoadingTest extends SeleniumBaseTest {

    @Test
    public void DynamicLoadingAfterTheFactTest() {
        DynamicLoadingPage.Instance.enterThePage();
        DynamicLoadingPage.Instance.ElementRenderedAfterTheFact();
    }

    @Test
    public void DynamicLoadingThatIsHiddenTest() {
        DynamicLoadingPage.Instance.enterThePage();
        DynamicLoadingPage.Instance.ElementOnPageThatIsHidden();
    }
}
