package CommonPackage;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageHeader {

    private WebDriver driver;
    private List<WebElement> childrenElements;
    private By homeTab = By.xpath("/html/body/div[5]/div/div/div[1]/a/img");
    private By hotelTab = By.xpath("//*[@id=\"offcanvas-menu\"]/ul/li[1]/a");
    private By flightsTab = By.xpath("//*[@id=\"offcanvas-menu\"]/ul/li[2]/a");
    private By toursTab = By.tagName("/html/body/div[6]/div/div/div[3]/nav/ul/li[3]/a/span[2]/img");
    private By visaTab = By.xpath("");
    private By carsTab = By.xpath("");
    private By blogsTab = By.xpath("");
    private By contactsTab = By.xpath("");
    private By myAccount = By.id("li_myaccount");
    private By sign_up = By.linkText("http://www.phptravels.net/register");
    private By log_in = By.linkText("http://www.phptravels.net/login");

    public PageHeader(WebDriver driver) {
        this.driver = driver;
    }


    public HomePage clickHomePageTab() {
        WebElement homeTabButton = driver.findElement(homeTab);
        try {
            if (homeTabButton.isDisplayed() || homeTabButton.isEnabled()) {
                homeTabButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HomePage(driver);
    }

    public HotelPage clickHotelPageTab() {
        WebElement hotelTabButton = driver.findElement(hotelTab);
        try {
            if (hotelTabButton.isDisplayed() || hotelTabButton.isEnabled()) {
                hotelTabButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HotelPage(driver);
    }

    public FlightPage clickFlightPageTab() {
        WebElement flightTabButton = driver.findElement(flightsTab);
        try {
            if (flightTabButton.isDisplayed() || flightTabButton.isEnabled()) {
                flightTabButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new FlightPage(driver);
    }

    public TourPage clickTourPageTab() {
        WebElement tourTabButton = driver.findElement(toursTab);
        try {
            if (tourTabButton.isDisplayed() || tourTabButton.isEnabled()) {
                tourTabButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new TourPage(driver);
    }

    public VisaPage clickVisaPageTab() {
        WebElement visaTabButton = driver.findElement(visaTab);
        try {
            if (visaTabButton.isDisplayed() || visaTabButton.isEnabled()) {
                visaTabButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new VisaPage(driver);
    }

    public CarPage clickCarPageTab() {
        WebElement carTabButton = driver.findElement(carsTab);
        try {
            if (carTabButton.isDisplayed() || carTabButton.isEnabled()) {
                carTabButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CarPage(driver);
    }

    public BlogPage clickBlogPageTab() {
        WebElement blogTabButton = driver.findElement(blogsTab);
        try {
            if (blogTabButton.isDisplayed() || blogTabButton.isEnabled()) {
                blogTabButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new BlogPage(driver);
    }

    public ContactUsPage clickContactUsPageTab() {
        WebElement contactUsTabButton = driver.findElement(contactsTab);
        try {
            if (contactUsTabButton.isDisplayed() || contactUsTabButton.isEnabled()) {
                contactUsTabButton.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ContactUsPage(driver);
    }

    public LogInPage clickLogInTab() {
        WebElement logInTabButton = driver.findElement(log_in);
        childrenElements = clickMyAccount();
        for (WebElement child : childrenElements) {
            if (child.findElement(By.linkText("")).equals(logInTabButton)) {
                logInTabButton.click();
            }
        }
        return new LogInPage(driver);
    }

    public SigUpPage clickSignUpTab() {
        WebElement SignInTabButton = driver.findElement(sign_up);
        childrenElements = clickMyAccount();
        for (WebElement child : childrenElements) {
            if (child.findElement(By.linkText("")).equals(SignInTabButton)) {
                SignInTabButton.click();
            }
        }
        return new SigUpPage(driver);
    }


    public List<WebElement> clickMyAccount() {
        List<WebElement> options = null;
        WebElement myAccountButton = driver.findElement(myAccount);
        if (myAccountButton.isEnabled()) {
            myAccountButton.click();
            options = myAccountButton.findElements(By.xpath("//li[@class='go-text-right']"));
        }
        return options;
    }

}
