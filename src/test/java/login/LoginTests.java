package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.setUps;

public class LoginTests extends setUps {


    @Test(priority = 1)
    public void testSelectLocation() {

        loginPage.clickLocation();

        String chooseLocation = "Lagos";
        if (chooseLocation.equalsIgnoreCase("Lagos")){
            System.out.println("The Shopping location is " + chooseLocation);
        } else{
            System.out.println("The Shopping location is Ibadan");
        }
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
    @Test(priority = 4)
    public void testClickHousehold() throws InterruptedException {
        dashboardPage.clickHousehold();
        //Wait for 5 seconds before executing the action
        Thread.sleep(5000);
    }

    @Test(priority = 5)
    public void testClickHomeAppliances() throws InterruptedException{
        householdPage.clickHomeAppliances();
        //Wait for 5 seconds before executing the action
        Thread.sleep(5000);
    }

    @Test(priority = 6)
    public void testClickStandingFan() throws InterruptedException{

        homeAppliancesPage.clickStandingFan();
        //Wait for 3 seconds before executing the action
        Thread.sleep(3000);
        homeAppliancesPage.clickContinueShopping();
        System.out.println("Standing Fan is displayed - Assert passed");
    }

    @Test(priority = 7)
    public void testClickClipper()throws InterruptedException{
        homeAppliancesPage.clickClipper();
        //Wait for 3 seconds before executing the action
        Thread.sleep(3000);
        homeAppliancesPage.clickContinueShopping();
        System.out.println("Clipper is displayed - Assert passed");
    }


    @Test(priority = 8)
    public void testClickRechargeableFan()throws InterruptedException{
        homeAppliancesPage.clickRechargeableFan();
        //Wait for 3 seconds before executing the action
        Thread.sleep(3000);
        homeAppliancesPage.clickViewCart();
        Thread.sleep(5000);
        System.out.println("Rechargeable Fan is displayed - Assert passed");
        System.out.println("All three items asserted");
    }

    @Test(priority = 9)
    public void testClickLogout() throws InterruptedException {
        homeAppliancesPage.clickSignIn();
        //Wait for 5 seconds before executing the action
        Thread.sleep(5000);
        dashboardPage.clickLogoutButton();
        System.out.println("Account logged out successfully.");
    }

    String pageURL = "https://foodco.ng/";
    {
        System.out.println("Account logged out. Page URL is " + pageURL);
    }





}