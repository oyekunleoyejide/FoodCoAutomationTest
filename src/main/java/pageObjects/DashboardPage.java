package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }
    private WebDriver driver;



    //Using By as locator for Dashboard elements
    private By household = By.className("nav-link");
    private By homeAppliances = By.xpath("/html/body/section[2]/div/div/div[2]/div[4]/ul/li[2]/a/h2");
    private By standingFan = By.xpath("/html/body/section[2]/div/div/div[2]/div[4]/div[1]/div/div[2]/form/button");
    private By clipper = By.xpath("/html/body/section[2]/div/div/div[2]/div[4]/div[2]/div/div[2]/form/button");
    private By rechargeableFan = By.xpath("/html/body/section[2]/div/div/div[2]/div[4]/div[3]/div/div[2]/form/button");
    private By continueShopping = By.id("wooac-continue");
    private By signIn = By.xpath("/html/body/div[1]/div/div/div[2]/ul/li[1]/a");
    private By logoutButton = By.xpath("/html/body/section[2]/div/div/div/div/div/div[2]/div/div/div/p[1]/a");

    public void clickHousehold(){
        //Find Household element and click
        driver.findElement(household).click();
    }

    public void clickHomeAppliances(){
        //Find Home Appliances element and click
        driver.findElement(homeAppliances).click();
    }

    public void clickStandingFan(){
        //Find product Standing Fan element and click Add to Cart
        driver.findElement(standingFan).click();
        driver.findElement(continueShopping).click();
    }

    public void clickClipper(){
        //Find product Clipper element and click Add to Cart
        driver.findElement(clipper).click();
        driver.findElement(continueShopping).click();
    }

    public void clickRechargeableFan(){
        //Find product Rechargeable Fan element and click Add to Cart
        driver.findElement(rechargeableFan).click();
        driver.findElement(continueShopping).click();
    }

    public void clickSignIn (){
        //Find the sign in element and click
        driver.findElement(signIn).click();
    }

    public LoginPage clickLogoutButton() throws InterruptedException
        {
            //Wait for 10 seconds before executing the action
            Thread.sleep(10000);

            //Find logout button element on the Dashboard page and click
            driver.findElement(logoutButton).click();
            return new LoginPage(driver);
        }


}
