package Tests;

import Pages.BrokenImagesPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

public class BrokenImagesTest extends SeleniumBaseTest {

    @Test
    public void testBrokenImages() throws Exception {
        BrokenImagesPage.Instance.enterThePage();
        BrokenImagesPage.Instance.checkImages();
    }
}
