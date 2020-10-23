package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {
    //Create Login object
    protected LoginPage loginPage;


    //Create a webDriver object
    private WebDriver driver;


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

    }

    @AfterTest
        public void quitBrowser(){
            driver.quit();
        }
    String pageURL = "https://foodco.ng/";

    {
        System.out.println("Account logged out. Page URL is " + pageURL);
    }

}
