package CukeSetUp;

import CommonPackage.BrowserSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hook {

    public static WebDriver driver;
    BrowserSetUp browserSetUp;

    @BeforeClass
    public WebDriver initializeDriver(){
        driver = browserSetUp.getDriver();
        return  driver;
    }

    @AfterClass
    public void closeBroswer(){
        browserSetUp.closeDriver();
    }
}
