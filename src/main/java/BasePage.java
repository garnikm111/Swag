import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    final    Action action;
    final Wait wait;
    final WebDriver driver;

    public BasePage(WebDriver driver) {
        action = new Action();
        wait = new Wait(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}