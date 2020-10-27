package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeAppliancesPage {
    public HomeAppliancesPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;

    //Using By as a locator for items on the Home appliances page
    private By standingFan = By.xpath("/html/body/section[2]/div/div/div[2]/div[4]/div[1]/div/div[2]/form/button");
    private By clipper = By.xpath("/html/body/section[2]/div/div/div[2]/div[4]/div[2]/div/div[2]/form/button");
    private By rechargeableFan = By.xpath("/html/body/section[2]/div/div/div[2]/div[4]/div[3]/div/div[2]/form/button");
    private By continueShopping = By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/a[2]");
    private By signIn = By.xpath("/html/body/div[1]/div/div/div[2]/ul/li[1]/a");
    private By viewCart = By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/a[1]");


    public void clickStandingFan(){
        //Find product Standing Fan element and click Add to Cart
        driver.findElement(standingFan).click();
    }

    public void clickClipper(){
        //Find product Clipper element and click Add to Cart
        driver.findElement(clipper).click();
    }

    public void clickRechargeableFan(){
        //Find product Rechargeable Fan element and click Add to Cart
        driver.findElement(rechargeableFan).click();
    }

    public void clickContinueShopping(){
        //Find pop up element and click Continue Shopping
        driver.findElement(continueShopping).click();
    }

    public void clickSignIn (){
        //Find the sign in element and click
        driver.findElement(signIn).click();
    }

    public void clickViewCart() {
        //Find View Cart element from pop up and click View Cart
        driver.findElement(viewCart).click();
    }

}
