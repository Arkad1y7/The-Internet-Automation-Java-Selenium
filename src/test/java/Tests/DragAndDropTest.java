package Tests;

import Pages.DragAndDropPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;


public class DragAndDropTest extends SeleniumBaseTest {

    @Test
    public void dragAndDropTest() {
        DragAndDropPage.Instance.enterThePage();
        DragAndDropPage.Instance.dragAndDropAtoB();
    }
}
