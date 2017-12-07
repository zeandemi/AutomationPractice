package CommonPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;



public class BrowserSetUp {

    private WebDriver driver;
    private static String path = userDir();
    private static String driverPath = path + "\\lib\\";
    private String appDriver = "chrome";
    private String appUrl = "http://www.phptravels.net/";
    //public String BaseUrl = "http://www.phptravels.net/";




    static String userDir() {
        return new File("").getAbsoluteFile().getAbsolutePath();
    }


    public WebDriver getDriver() {

        return driver;
    }

    private static WebDriver initInternetExplorerDriver(String Url) {
        System.setProperty("webdriver.IE.driver", driverPath + "IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(Url);
        driver.manage().window().fullscreen();
        return driver;
    }

    private static WebDriver initChromeDriver(String Url) {
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(Url);
        driver.manage().window().fullscreen();
        return driver;
    }


    private static WebDriver initFirefoxDriver(String Url) {
        System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(Url);
        driver.manage().window().fullscreen();
        return driver;
    }

    public void setDriver(String appDriver, String appUrl) {
        switch (appDriver){
            case "chrome":
                driver = initChromeDriver(appUrl);
                break;

            case "ie":
                driver = initInternetExplorerDriver(appUrl);
                break;

            case "firefox":
                driver = initFirefoxDriver(appUrl);
                break;
        }

    }
    //@BeforeClass
    public void initDriver() {
        try {
            setDriver(appDriver, appUrl);
        } catch (Exception e) {
            System.out.println(e);
        }

    }


   // @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
