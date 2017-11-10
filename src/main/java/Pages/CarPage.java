package Pages;

import CommonPackage.PageHeader;
import org.openqa.selenium.WebDriver;

public class CarPage extends PageHeader {

    WebDriver driver;

    public CarPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


}
