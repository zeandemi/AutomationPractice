package StepDef.PageStepDef;


import PageTest.HomePageTest;
import Pages.FlightPage;
import Pages.HomePage;
import StepDef.Hook;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightPageStepDef {


    HomePage homePage;

    @Given("^I'm on the Home Page$")
    public void imOnTheHomePage(){
        homePage = new HomePage(Hook.driver);
        HomePageTest homePageTest = new HomePageTest(homePage);
        homePageTest.verifyHomePageTitle();

    }

    @When("^I click on the flight tab$")
    public void iClickOnTheFlightTab(){
      homePage.clickFlightPageTab();


    }

    @Then("^I will be taken to the flight page$")
    public void iWillBeTakenToTheFlightPage(){
        FlightPage flightPage = homePage.clickFlightPageTab();
        flightPage.getFlightPageTitle();

    }
}
