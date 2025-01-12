package Tests;

import Pages.ChallengingDomPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class ChallengingDomTest extends SeleniumBaseTest {

    @Test
    public void ChallengingDomTest() {
        MainPage.Instance.clickOnChallengingDom();
        ChallengingDomPage.Instance.clickBlueButton();
        ChallengingDomPage.Instance.clickRedButton();
        ChallengingDomPage.Instance.clickGreenButton();
    }
}
