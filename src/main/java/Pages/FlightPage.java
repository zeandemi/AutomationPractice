package Pages;

import CommonPackage.PageHeader;
import org.openqa.selenium.WebDriver;

public class FlightPage extends PageHeader {


    private final WebDriver driver;

    public FlightPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    public String getFlightPageTitle() {
        String flightPageTitle = driver.getTitle();
        System.out.println(flightPageTitle);
        return flightPageTitle;
    }
}
