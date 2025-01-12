package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.fail;

public class BrokenImagesPage extends SeleniumBasePage {

    public void checkImages(){
        List<WebElement> images = driver.findElements(By.tagName("img"));

        for(WebElement img : images){
            if(Objects.equals(img.getAttribute("naturalWidth"), "0")){
                fail("Broken Image " + img.getAttribute("src"));
            }
        }
    }
}
