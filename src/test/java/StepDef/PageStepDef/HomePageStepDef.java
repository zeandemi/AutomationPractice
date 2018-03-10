package StepDef.PageStepDef;

import PageTest.HomePageTest;
import Pages.HomePage;
import StepDef.Hook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {

    HomePage homePage;

    @Given("^I am on home page$")
    public void iAmOnHomePage() throws Throwable {
        homePage = new HomePage(Hook.driver);
        homePage.getHomePageTitle();
    }

    @When("^I click on the home page tab$")
    public void iClickOnTheHomePageTab() throws Throwable {
        homePage.clickHomePageTab();

    }

    @Then("^I get a confirmation$")
    public void iGetAConfirmation() throws Throwable {
        HomePageTest homePageTest = new HomePageTest(homePage);
        homePageTest.verifyHomePageTitle();

    }

}
