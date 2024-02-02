package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class JoinNowSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @And("I verify I am on homepage")
    public void iVerifyIAmOnHomepage() {
        String expectedTitle = "Virgin Games | Play Online Betting Games With Real Money";
        Assert.assertEquals(new HomePage().getTitle(), expectedTitle);
    }

    @When("I accept Necessary cookies only")
    public void iAcceptNecessaryCookiesOnly() {
        new HomePage().clickOnNecessarycookies();
    }

    @Then("I click on Join Now tab")
    public void iClickOnJoinNowTab() {
        new HomePage().clickOnJoinNowTab();
    }
}
