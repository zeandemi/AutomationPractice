package Pages;

import CommonPackage.PageHeader;
import org.openqa.selenium.WebDriver;


public class HomePage extends PageHeader {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public String getHomePageTitle(){
        String actualhomePageTitle = driver.getTitle();
        return actualhomePageTitle;
    }





}
