package CukeSetUp;

import CommonPackage.BrowserSetUp;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class Hook {

    public static WebDriver driver;
    public BrowserSetUp browserSetUp;


    @Before
    public void initializeDriver() throws InterruptedException {
        browserSetUp = new BrowserSetUp();
        browserSetUp.initDriver();
        driver = browserSetUp.getDriver();
        Thread.sleep(3000);

    }

    @After
    public void closeBroswer() {
        browserSetUp.closeDriver();
    }
}
