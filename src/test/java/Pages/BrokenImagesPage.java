package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Objects;

public class BrokenImagesPage extends SeleniumBasePage {

    public static BrokenImagesPage Instance = new BrokenImagesPage();

    public void checkImages(){
        List<WebElement> images = driver.findElements(By.tagName("img"));

        for(WebElement img : images){
            if(Objects.equals(img.getAttribute("naturalWidth"), "0")){
                System.out.println("FAIL: Broken Image " + img.getAttribute("src"));
            }else{
                System.out.println("PASS: All images ass downloaded on page");
            }
        }
    }
}
