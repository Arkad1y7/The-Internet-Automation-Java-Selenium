package Tests;

import Pages.ChallengingDomPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class ChallengingDomTest extends SeleniumBaseTest {

    @Test
    public void challengingDomTest() {
        ChallengingDomPage.Instance.enterThePage();
        ChallengingDomPage.Instance.clickBlueButton();
        ChallengingDomPage.Instance.clickRedButton();
        ChallengingDomPage.Instance.clickGreenButton();
    }
}
