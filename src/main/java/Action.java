import org.openqa.selenium.WebElement;

public class Action {
    public void type(WebElement element, String search) {
        element.sendKeys(search);
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }
}
