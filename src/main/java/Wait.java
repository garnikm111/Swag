
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Wait {
    private final WebDriver DRIVER;

    public Wait(WebDriver driver) {
        this.DRIVER = driver;
    }

    public void waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DRIVER, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DRIVER, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public  void wait(WebElement s) {
        WebDriverWait wait = new WebDriverWait(DRIVER, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@style,'75')]")));
    }}
