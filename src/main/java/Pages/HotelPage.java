package Pages;

import CommonPackage.PageHeader;
import org.openqa.selenium.WebDriver;

public class HotelPage extends PageHeader {


    private final WebDriver driver;

    public HotelPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
