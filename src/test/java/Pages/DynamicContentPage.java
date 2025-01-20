package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DynamicContentPage extends SeleniumBasePage {

    public static DynamicContentPage Instance = new DynamicContentPage();

    public void enterThePage(){
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
    }

    public void checkEvent(int min, int max) {
        List<element> elements = new ArrayList<>();
        List<element> elementsAfterRefresh = new ArrayList<>();

        for (int i = min; i < max; i++) {
            String text = driver.findElement(By.xpath("(//div[@class='row'])["+i+"]")).getText();
            String imgSrc = driver.findElement(By.xpath("(//div[@class='row'])["+i+"]//img")).getAttribute("src");
            elements.add(new element(text, imgSrc));
        }

        driver.navigate().refresh();

        for (int i = min; i < max; i++) {
            String text = driver.findElement(By.xpath("(//div[@class='row'])["+i+"]")).getText();
            String imgSrc = driver.findElement(By.xpath("(//div[@class='row'])["+i+"]//img")).getAttribute("src");
            elementsAfterRefresh.add(new element(text, imgSrc));
        }

        for (int i = 0; i < max-min; i++) {
            assertNotEquals(elements.get(i).text, elementsAfterRefresh.get(i).text);
        }

        for (int i = 0; i < max-min; i++) {
            assertNotEquals(elements.get(i).imgSrc, elementsAfterRefresh.get(i).imgSrc);
        }
    }

    private record element(String text, String imgSrc) { }
}

