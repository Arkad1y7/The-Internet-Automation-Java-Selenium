package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends SeleniumBasePage {
    public static DropdownPage Instance = new DropdownPage();

    public void dropdownAll() { // the method selects all the elements in turn
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        List<WebElement> options = dropdown.findElements(By.tagName("option"));
        for (WebElement option : options) {
            option.click();
            if (option.getText().equals("Option 1")) {
                System.out.println("Option 1 selected");
            } else if (option.getText().equals("Option 2")) {
                System.out.println("Option 2 selected");
            }
        }
    }

    public void dropdownOne(){ // the method selects the specified element
        WebElement selectElement = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Option 2");
        System.out.println("Option 2 selected");
    }
}
