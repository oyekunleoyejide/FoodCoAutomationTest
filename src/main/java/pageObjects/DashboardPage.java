package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashboardPage {
    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }
    private WebDriver driver;


    //Using By as locator for Dashboard elements
    private By household = By.xpath("/html/body/nav[2]/div/div/ul/li[5]/a");
    private By logoutButton = By.xpath("/html/body/section[2]/div/div/div/div/div/div[2]/div/div/div/p[1]/a");


    public HouseholdPage clickHousehold (){
        //Find the login button and click
        driver.findElement(household).click();
        return new HouseholdPage(driver);
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
