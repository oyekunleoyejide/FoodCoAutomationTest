package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HouseholdPage {
    public HouseholdPage(WebDriver driver)  {

        this.driver = driver;
    }

    private WebDriver driver;

    private By homeAppliances = By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/ul/li[2]/input[1]");


    public HomeAppliancesPage clickHomeAppliances (){
        //Find the login button and click
        driver.findElement(homeAppliances).click();

        return new HomeAppliancesPage(driver);
    }


}
