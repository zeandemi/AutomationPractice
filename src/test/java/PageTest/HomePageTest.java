package PageTest;

import Pages.HomePage;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;


public class HomePageTest {

    HomePage homePage;
    public WebDriver driver;

    public HomePageTest(HomePage homePage){
        this.homePage = homePage;
        homePage = new HomePage(driver);
    }

    public void verifyHomePageTitle(){
        String actualHomeTitle = homePage.getHomePageTitle();
        String expectedHomeTitle = "PHPTRAVELS | Travel Technology Partner";
       Assert.assertEquals(actualHomeTitle,expectedHomeTitle);
    }
}
