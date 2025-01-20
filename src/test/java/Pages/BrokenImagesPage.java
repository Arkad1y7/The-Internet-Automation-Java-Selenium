package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Objects;

public class BrokenImagesPage extends SeleniumBasePage {

    public static BrokenImagesPage Instance = new BrokenImagesPage();

    public void enterThePage(){
        driver.get("https://the-internet.herokuapp.com/broken_images");
    }

    public void checkImages() throws Exception {
        List<WebElement> images = driver.findElements(By.tagName("img"));

        for(WebElement img : images){
            if(Objects.equals(img.getAttribute("naturalWidth"), "0")){
                throw new Exception("FAIL: Broken Image " + img.getAttribute("src"));
            }else{
                System.out.println("PASS: Image downloade on page " + img.getAttribute("src"));
            }
        }
    }
}
