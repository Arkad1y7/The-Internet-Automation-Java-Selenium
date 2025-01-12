package Tests;

import Pages.BrokenImagesPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class BrokenImagesTest extends SeleniumBaseTest {
    @Test
    public void testBrokenImages() {
        MainPage mainPage = new MainPage();
        BrokenImagesPage brokenImages = new BrokenImagesPage();
        mainPage.clickOnBrokenImages();
        brokenImages.checkImages();
    }
}
