package PageTest;

import CukeSetUp.Hook;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageTest {

    HomePage homePage;
    private WebDriver driver;

    public HomePageTest(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(Hook.driver);
    }

    public void verifyHomePageTitle(){
        String actualHomeTitle = homePage.getHomePageTitle();
        String expectedHomeTitle = "";
        Assert.assertEquals(actualHomeTitle,expectedHomeTitle);
    }
}