package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OnlineSlotsSteps {
    @When("I Click on {string} Tab")
    public void iClickOnTab(String menu) {
        new HomePage().selectTopMenu(menu);
    }

    @Then("I Verify text {string}")
    public void iVerifyText(String text) {
        Assert.assertEquals(new OnlineSlotsPage().getTextOfPlayOnlineSlotsAtVirginGames(), text);
    }
}
