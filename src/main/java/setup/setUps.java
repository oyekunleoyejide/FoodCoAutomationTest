package setup;

import org.hamcrest.core.DescribedAs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.HomeAppliancesPage;
import pageObjects.HouseholdPage;
import pageObjects.LoginPage;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.concurrent.TimeUnit;

public class setUps {

    //Create a webDriver object
    private WebDriver driver;

    //Create Login object
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected HouseholdPage householdPage;
    protected HomeAppliancesPage homeAppliancesPage;


    @BeforeTest
    public void setUp() {
        //Import chromeDriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //instantiate a webDriver object
        driver = new ChromeDriver();


        //Maximize window size
        driver.manage().window().maximize();

        //Launch the application URL and wait
        driver.get("https://foodco.ng/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Instantiate landing page after launching the browser
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        householdPage = new HouseholdPage(driver);
        homeAppliancesPage = new HomeAppliancesPage(driver);

    }

    @AfterTest
        public void quitBrowser() throws InterruptedException{
        //Wait for 5 seconds before executing the action
        Thread.sleep(5000);
        driver.quit();
        }


}
