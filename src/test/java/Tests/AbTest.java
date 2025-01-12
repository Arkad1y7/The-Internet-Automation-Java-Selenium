package Tests;

import Pages.AbTestingPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class AbTest extends SeleniumBaseTest {
    AbTestingPage abTestingPage = new AbTestingPage();

    @Test
    public void abTestAfter() {
        abTestingPage.WithCookieAfterVisitingPage();
    }
    @Test
    public void abTestBefore() {
        abTestingPage.WithCookieBeforeVisitingPage();
    }
    @Test
    public void abTestWithOptOutUrl() throws InterruptedException {
        abTestingPage.WithOptOutUrl();
    }
}
