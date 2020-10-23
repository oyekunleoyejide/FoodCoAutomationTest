package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.setUps;

public class LoginTests extends setUps {


    @Test(priority = 1)
    public void testSelectLocation() {

        loginPage.clickLocation();
    }

    @Test(priority = 2)
    public void testClickSignIn() {
        loginPage.clickSignIn();
    }

    @Test (priority = 3)
    public void testVerifyLogin()throws InterruptedException
    {
        loginPage.enterUsername("oyejide.ebenezer@gmail.com");
        loginPage.enterPassword("electronics1777.");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        //Wait for 10 seconds before executing the action
        Thread.sleep(10000);
    }



}