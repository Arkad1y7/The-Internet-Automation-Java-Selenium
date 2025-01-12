package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;

public class AddRemovePage extends SeleniumBasePage {

    public static AddRemovePage Instance = new AddRemovePage();

    public void addElement() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
    }

    public void removeElement() {
        driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
    }
}
