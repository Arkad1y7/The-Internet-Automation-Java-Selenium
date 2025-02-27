package Tests;

import Pages.AbTestingPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class AbTest extends SeleniumBaseTest {

    @Test
    public void abTestAfter() {
        AbTestingPage.Instance.withCookieAfterVisitingPage();
    }

    @Test
    public void abTestBefore() {
        AbTestingPage.Instance.withCookieBeforeVisitingPage();
    }

    @Test
    public void abTestWithOptOutUrl() throws InterruptedException {
        AbTestingPage.Instance.withOptOutUrl();
    }
}
