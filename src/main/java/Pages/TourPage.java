package Pages;

import CommonPackage.PageHeader;
import org.openqa.selenium.WebDriver;

public class TourPage extends PageHeader {

    private WebDriver driver;

    public TourPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getTourPageTitle() {
        String tourPageTitle = driver.getTitle();
        return tourPageTitle;
    }
}
