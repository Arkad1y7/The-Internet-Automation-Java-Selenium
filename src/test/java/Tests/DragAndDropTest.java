package Tests;

import Pages.DragAndDropPage;
import Pages.MainPage;
import SeleniumBase.SeleniumBaseTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class DragAndDropTest extends SeleniumBaseTest {

    @Test
    public void dragAndDropTest() throws InterruptedException {
        MainPage.Instance.clickOnDragAndDrop();
        DragAndDropPage.Instance.dragAndDropAtoB();
    }
}
