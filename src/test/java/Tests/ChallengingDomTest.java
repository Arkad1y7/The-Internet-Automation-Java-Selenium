package Tests;

import Pages.ChallengingDomPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class ChallengingDomTest extends SeleniumBaseTest {
    @Test
    public void ChallengingDomTest() {
        MainPage mainPage = new MainPage();
        ChallengingDomPage challengingDom = new ChallengingDomPage();
        mainPage.clickOnChallengingDom();
        challengingDom.clickBlueButton()
                .clickRedButton()
                .clickGreenButton();
    }
}
