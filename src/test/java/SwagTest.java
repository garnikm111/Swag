import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagTest extends BaseTest {
    @Test(priority = 0)
    public void loginToSwagWebsite() {
        swagPage.swagLogin("standard_user", "secret_sauce");
    }

    @Test(priority = 1)
    public void addToCardFirstItem() {
        swagPage.addItemsToCard();
        Assert.assertEquals(swagPage.descriptionForFirstBackPack.getText(), "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        Assert.assertEquals(swagPage.descriptionOfSecondElement.getText(), "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");

    }

    @Test(priority = 2)
    public void checkIfSwagWebHasRights() {
        Assert.assertEquals(swagPage.swagWebsiteRights.getText(), "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");
    }

    @Test(priority = 3)
    public void compareQuantitiesAndRemoveItem() {
        swagPage.removeItemAndAssertQuantity();
        Assert.assertEquals(swagPage.quantityOfItem.getText(), swagPage.shoppinCartIconCounter.getText());

    }

    @Test(priority = 4)
    public void checkOut() throws InterruptedException {
        swagPage.checkOut("Garnik", "Mkrtchyan", 91501);
        Thread.sleep(5000);
    }

    @Test(priority = 5)
    public void checkAllValuesAndFinishCheckout() {
        Assert.assertEquals(swagPage.paymentOption.getText(), "SauceCard #31337");
        Assert.assertEquals(swagPage.shippingInformation.getText(), "FREE PONY EXPRESS DELIVERY!");
        swagPage.finishCheckOut();

    }

    @Test(priority = 6)
    public void exploringAboutPage() {
        swagPage.exploreAboutPage();
    }

    @Test(priority = 7)
    public void logOutFromWebSite() {
        swagPage.logOut();
    }
    @Test(priority = 11)
    public void logInToYoga() {
        driver.get("https://magento.softwaretestingboard.com/");
        swagPage.signInToYoga("garnikmkrtchyan@yahoo.com", "Garnik1978@");
    }

    @Test(priority = 12)
    public void selectMenSection() {
        swagPage.selectMenSectionHoodies();
    }

    @Test(priority = 13)
    public void slectFilters() {
        swagPage.filterSearch();

    }

    @Test(priority = 14)
    public void addToCartAndNavigateThere() {
        swagPage.addToCartAndGoToCart();
    }

    @Test(priority = 15)
    public void checkOutButton() throws InterruptedException {
        swagPage.processToCHeckOutButton();

    }

    @Test(priority = 16)
    public void fillOutInfo() throws InterruptedException {
        swagPage.fillOutForm("MGM", "1217 Alta Paseo", "Burbank", "91501", "8022000001");

    }


}



