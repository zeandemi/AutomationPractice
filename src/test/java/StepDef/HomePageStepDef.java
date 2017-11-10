package StepDef;

import PageTest.HomePageTest;
import Pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageStepDef {

    WebDriver driver;
    HomePageTest homePageTest;

    @Given("^I am on home page$")
    public void iAmOnHomePage()throws Throwable{
        HomePage homePage = new HomePage(driver);
        homePageTest.verifyHomePageTitle();
        throw new PendingException();
    }

    @When("^I click on the home page tab$")
    public void iClickOnTheHomePageTab() throws Throwable {

        throw new PendingException();
    }

    @Then("^I get a confirmation$")
    public void iGetAConfirmation() throws Throwable {

        throw new PendingException();
    }
}
