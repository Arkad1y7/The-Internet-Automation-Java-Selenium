package Pages;

import SeleniumBase.SeleniumBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DragAndDropPage extends SeleniumBasePage {
    
    public static DragAndDropPage Instance = new DragAndDropPage();

    public void dragAndDropAtoB() {
        WebElement columnA = driver.findElement(By.id("column-a"));
        WebElement columnB = driver.findElement(By.id("column-b"));

        ((JavascriptExecutor) driver).executeScript(jsScriptDragAndDrop(), columnA, columnB);

        String firstTextColumn = columnA.getText();
        if(firstTextColumn.equals("B")) {
            System.out.println("PASS: File is dropped to target as expected");
        }else {
            System.out.println("FAIL: File couldn't be dropped to target as expected");
        }
    }
    private String jsScriptDragAndDrop() {
        return "var src = arguments[0], tgt = arguments[1];\n" +
                "var dataTransfer = {\n" +
                "  dropEffect: '',\n" +
                "  effectAllowed: 'all',\n" +
                "  files: [],\n" +
                "  items: {},\n" +
                "  types: [],\n" +
                "  setData: function(format, data) {\n" +
                "    this.items[format] = data;\n" +
                "    this.types.push(format);\n" +
                "  },\n" +
                "  getData: function(format) {\n" +
                "    return this.items[format];\n" +
                "  }\n" +
                "};\n" +
                "\n" +
                "var emit = function(event, target) {\n" +
                "  var evt = document.createEvent('Event');\n" +
                "  evt.initEvent(event, true, false);\n" +
                "  evt.dataTransfer = dataTransfer;\n" +
                "  target.dispatchEvent(evt);\n" +
                "};\n" +
                "\n" +
                "emit('dragstart', src);\n" +
                "emit('dragenter', tgt);\n" +
                "emit('dragover', tgt);\n" +
                "emit('drop', tgt);\n" +
                "emit('dragend', src);\n";
    }
}
