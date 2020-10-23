package setup;

import org.testng.annotations.Test;

public class setUpTests extends setUps {


    @Test (priority = 0)
    public void testSetUp(){
        String pageURL = "https://foodco.ng/";
        if (pageURL.equalsIgnoreCase("https://foodco.ng")){
            System.out.println("The webpage URL is " + pageURL);
        } else{
            System.out.println("Invalid URL. Actual URL is " + pageURL);
        }
    }
}
