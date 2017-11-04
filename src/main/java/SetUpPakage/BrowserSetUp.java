package SetUpPakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.util.Objects;


public class BrowserSetUp {

    protected WebDriver driver;
    private static String path = userDir();
    private static String driverPath = path + "\\lib\\";
    public String BaseUrl = "http://www.phptravels.net/";


    public static void main(String[] args) {
        BrowserSetUp ba = new BrowserSetUp();
        System.out.println(path);
        System.out.println(driverPath);
        initChromeDriver("http://www.phptravels.net/");
        System.out.println(ba.getDriver());
    }

    static  String userDir(){
        return  new File("").getAbsoluteFile().getAbsolutePath();
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
        System.setProperty("webdriver.chrome.driver" + driverPath, "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(Url);
        driver.manage().window().fullscreen();
        return driver;
    }


    private static WebDriver initFirefoxDriver(String Url) {
        System.setProperty(driverPath, "geckodriver.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(Url);
        driver.manage().window().fullscreen();
        return driver;
    }

    public void setDriver(String appDriver, String appUrl) {
        if (Objects.equals(appDriver, "internetExplorer")) {
            driver = initInternetExplorerDriver(appUrl);
        }
        if (Objects.equals(appDriver, "chrome")) {
            driver = initChromeDriver(appUrl);
        } else if (Objects.equals(appDriver, "firefox")) {
            driver = initFirefoxDriver(appUrl);
        }
    }

    @BeforeClass
    @Parameters({"appDriver"})
    public void initDriver(String appDriver, String appUrl) {
        this.BaseUrl = appUrl;
        try {
            setDriver(appDriver, appUrl);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
