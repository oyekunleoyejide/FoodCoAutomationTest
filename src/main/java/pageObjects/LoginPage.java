package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    private WebDriver driver;
    //Using By as a locator for identifying the login fields
    private By selectLocation = By.id("lagos");
    private By signIn = By.xpath("/html/body/div[1]/div/div/div[2]/ul/li[1]/a");

    public void clickLocation () {
        //Find the preferred location and click
        driver.findElement(selectLocation).click();

    }
    public void clickSignIn (){
        //Find the sign in element and click
        driver.findElement(signIn).click();

    }
    //Using By as a locator for identifying the login fields
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.name("login");

    public void enterUsername(String uName){
        //Find the username element and enter Username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterPassword(String pwd){
        //Find the username element and enter Username
        driver.findElement(password).sendKeys(pwd);
    }

    public DashboardPage clickLoginButton (){
        //Find the login button and click
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }



}
