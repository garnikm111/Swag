import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.asynchttpclient.Response;
import org.json.simple.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SwagPage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),'Pack')]")
    public WebElement descriptionForFirstBackPack;
    @FindBy(xpath = "//div[contains(text(),'ligh')]")
    public WebElement descriptionOfSecondElement;
    @FindBy(xpath = "//div[@class=\"footer_copy\"]")
    public WebElement swagWebsiteRights;
    @FindBy(xpath = "//span[@class=\"shopping_cart_badge\"]")
    public WebElement shoppinCartIconCounter;
    @FindBy(xpath = "//div[@class=\"cart_quantity\"][1]")
    public WebElement quantityOfItem;
    @FindBy(xpath = "//div[contains(text(),'Card')]")
    public WebElement paymentOption;
    @FindBy(xpath = "//div[contains(text(),'F')]")
    public WebElement shippingInformation;
    @FindBy(xpath = "//div[@class=summary_total_label]")
    public WebElement totalPrice;
    @FindBy(xpath = "//button[contains(text(),'F')]")
    public WebElement finishButton;
    @FindBy(xpath = "//button[contains(text(),'Bac')]")
    public WebElement backToHomeButton;
    List<WebElement> listOfMainMenus = new LinkedList<>();
    @FindBy(id = "user-name")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(xpath = "//button[contains(@id,'back')]")
    private WebElement backPackAddToCard;
    @FindBy(xpath = "//div[contains(text(),'Bac')]")
    private WebElement nameOfFirstBackPack;
    @FindBy(xpath = "//button[contains(@id,'ligh')]")
    private WebElement addSecondItemToCart;
    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    private WebElement shoppingCartIcon;
    @FindBy(xpath = "//button[@id=\"remove-sauce-labs-bike-light\"]")
    private WebElement removeSecondItem;
    @FindBy(xpath = "//button[contains(text(),'Che')]")
    private WebElement checkoutButton;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement secondName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    @FindBy(id = "continue")
    private WebElement continueButton;
    @FindBy(xpath = "//button[contains(text(),'Ope')]")
    private WebElement OpenMenu;
    @FindBy(id = "about_sidebar_link")
    private WebElement aboutPage;
    @FindBy(xpath = "//p[@class=\"ticker\"]")
    private WebElement numberOfTests;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutButton;

    @FindBy(xpath = "//input[@name=\"username\"]")
    private WebElement usernameBank;
    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwordBank;
    @FindBy(xpath = "//input[@value=\"Log In\"]")
    private WebElement bankLoginButton;
    @FindBy(xpath = "//a[contains(text(),'Re')]")
    private WebElement requestLoanButtonFromTheMenu;
    @FindBy(id = "amount")
    private WebElement loanAmount;
    @FindBy(id = "downPayment")
    private WebElement downPaymentAmount;
    @FindBy(xpath = "//input[@value=\"Apply Now\"]")
    private WebElement applyNowButton;
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    private WebElement OpenNewAccount;
    @FindBy(xpath = "//p[contains(text(),'loan')]")
    private WebElement loanStatus;
    @FindBy(xpath = "//a[contains(text(),'Sign In') and \"contains(@href,'refeer')\"]")
    private WebElement signIn;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(xpath = "//input[@id=\"pass\"]")
    private WebElement yogaPassword;
    @FindBy(id = "send2")
    private WebElement signInButton;
    @FindBy(xpath = "//a[@href=\"https://magento.softwaretestingboard.com/men.html\"]")
    private WebElement menSection;
    @FindBy(xpath = "//a[contains(text(),'Hoodies &')]")
    private WebElement hoodieSection;
    @FindBy(xpath = "//div[contains(text(),'Size')]")
    private WebElement sizeMenu;
    @FindBy(xpath = "//div[@option-label=\"M\" and @class=\"swatch-option text \"]")
    private WebElement selectSizeM;
    @FindBy(xpath = "//div[contains(text(),'Price')]")
    private WebElement priceMenu;
    @FindBy(xpath = "//span[@class=\"count\" and contains(text(),'6')]")
    private WebElement selectRightPrice;
    @FindBy(xpath = "//div[contains(text(),'Colo')]")
    private WebElement colorMenu;
    @FindBy(xpath = "//div[@class=\"swatch-option color \"]")
    private WebElement selectBlack;
    @FindBy(xpath = "//span[contains(text(),'Add')]")
    private WebElement addToCard;
    @FindBy(xpath = "//a[@href=\"https://magento.softwaretestingboard.com/checkout/cart/\" and @data-bind=\"scope: 'minicart_content'\" ]")
    private WebElement cartIconOnYoga;
    @FindBy(xpath = "//img[@alt=\"Mach Street Sweatshirt -M-Black\"]")
    private WebElement imageOfProduct;
    @FindBy(xpath = "//a[@class=\"action edit\"]")
    private WebElement editButton;
    @FindBy(xpath = "//input[@class=\"item-qty cart-item-qty\"]")
    private WebElement quantitiyOfProduct;
    @FindBy(xpath = "//span[contains(text(),'Update')]")
    private WebElement updateCartIcon;
    @FindBy(xpath = "//span[contains(text(),'Proc')]")
    private WebElement processToPayButton;
    @FindBy(xpath = "//input[@name=\"company\"]")
    private WebElement CompanyName;
    @FindBy(xpath = "//input[@name=\"street[0]\"]")
    private WebElement adress;
    @FindBy(xpath = "//input[@name=\"city\"]")
    private WebElement city;
    @FindBy(xpath = "//option[@data-title=\"California\"]")
    private WebElement californiaOption;
    @FindBy(xpath = "//select[@name=\"region_id\"]")
    private WebElement region;
    @FindBy(xpath = "//input[@name=\"postcode\"]")
    private WebElement zip;
    @FindBy(xpath = "//input[@name=\"telephone\"]")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@name=\"ko_unique_2\"]")
    private WebElement select45Shipping;
    @FindBy(xpath = "//span[contains(text(),'Nex')]")
    private WebElement nextButton;
    @FindBy(xpath = "//span[contains(text(),'Pla')]")
    private WebElement placeOrderButton;
    @FindBy(xpath = "//a[contains(text(),'shopp')]")
    private WebElement s;

    public SwagPage(WebDriver driver) {
        super(driver);
    }

    public void clickWithJSExecuter(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

    }

    public void rest(String b) {
        Response response = (Response) RestAssured.get(b).then().extract().response();

    }

    public void listMethod() {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("s", "a", "b"));
        System.out.println(nameList.get(1));
        System.out.println(nameList.size());


    }

    public boolean checkVisibibilty(WebElement element) {
        return element.isDisplayed();

    }

    public void javaScriptScroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void swagLogin(String t, String s) {
        action.type(userName, t);
        action.type(password, s);
        action.clickOnElement(loginButton);
    }

    public void addItemsToCard() {
        wait.waitForElementToClickable(backPackAddToCard);
        action.clickOnElement(backPackAddToCard);
        action.clickOnElement(addSecondItemToCart);

    }

    public void removeItemAndAssertQuantity() {
        action.clickOnElement(shoppingCartIcon);
        action.clickOnElement(removeSecondItem);
    }

    public void checkOut(String s, String b, Integer i) {
        action.clickOnElement(checkoutButton);
        action.type(firstName, s);
        action.type(secondName, b);
        action.type(postalCode, String.valueOf(i));
        action.clickOnElement(continueButton);
    }

    public void finishCheckOut() {
        action.clickOnElement(finishButton);
    }

    public void exploreAboutPage() {
        action.clickOnElement(backToHomeButton);
        action.clickOnElement(OpenMenu);
        wait.waitForElementToClickable(aboutPage);
        action.clickOnElement(aboutPage);
        javaScriptScroll(numberOfTests);
        System.out.println("number of tests runned on this website" + numberOfTests.getText());
        driver.navigate().back();
    }

    public void logOut() {
        action.clickOnElement(OpenMenu);
        wait.waitForElementToClickable(logOutButton);
        action.clickOnElement(logOutButton);
    }

    public void loginToBank(String s, String h) {
        action.type(usernameBank, s);
        action.type(passwordBank, h);
        action.clickOnElement(bankLoginButton);
    }

    public void ra1() {
        driver.get("https://petstore.swagger.io/#/");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "Niki");
        jsonObject.put("id", 64529);


        given().log().all().accept(ContentType.JSON).contentType("application/json").and().body(jsonObject.toString()).post("https://gorest.co.in/public-api/users").thenReturn().asString();
    }

    public void raPut1() {
        driver.get("https://petstore.swagger.io/#/");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "Sam");
        jsonObject.put("id", 75848);


        given().log().all().accept(ContentType.JSON).contentType("application/json").and().body(jsonObject.toString()).put("https://gorest.co.in/public-api/users").thenReturn().asString();
    }

    public void raGet1() {
        driver.get("https://petstore.swagger.io/#/");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", "Available");

        given().log().all().accept(ContentType.JSON).contentType("application/json").and().body(jsonObject.toString()).get("https://petstore.swagger.io/v2/pet/findByStatus?status=available\n").thenReturn().asString();
    }

    public void askForLoan(String s, String k) {
        action.clickOnElement(requestLoanButtonFromTheMenu);
        action.type(loanAmount, s);
        action.type(downPaymentAmount, k);
        action.clickOnElement(applyNowButton);

    }

    public void signInToYoga(String s, String p) {
        action.clickOnElement(signIn);
        action.type(email, s);
        action.type(yogaPassword, p);
        action.clickOnElement(signInButton);
    }

    public void selectMenSectionHoodies() {
        action.clickOnElement(menSection);
        action.clickOnElement(hoodieSection);
    }

    public void filterSearch() {
        action.clickOnElement(sizeMenu);
        action.clickOnElement(selectSizeM);
        action.clickOnElement(priceMenu);
        action.clickOnElement(selectRightPrice);
        action.clickOnElement(colorMenu);
        action.clickOnElement(selectBlack);
    }

    public void addToCartAndGoToCart() {
        Actions a = new Actions(driver);
        a.moveToElement(imageOfProduct).perform();
        action.clickOnElement(addToCard);

    }

    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void processToCHeckOutButton() {
        wait.waitForElementToClickable(s);
        action.clickOnElement(s);
        wait.waitForElementToClickable(processToPayButton);
        action.clickOnElement(processToPayButton);
    }

    public void fillOutForm(String a, String b, String c, String d, String e) throws InterruptedException {
        wait.waitForElementToClickable(select45Shipping);
        action.clickOnElement(select45Shipping);
        wait.waitForElementToClickable(nextButton);
        action.clickOnElement(nextButton);
        wait.waitForElementToClickable(placeOrderButton);
        jsClick(placeOrderButton);
    }
}
