package com.automation.cucumber.steps;

import com.automation.pages.OurStorePage;
import com.automation.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class OurStore {
    @When("^I click on our store page$")
    public void iClickOnOurStorePage() {
        new OurStorePage().clickOnOurStorePage();
    }

    @And("^I accept pop up$")
    public void iAcceptPopUp() {
        new OurStorePage().clickOnPopUp();
    }

    @And("^I scroll the map untill West Palm Beach$")
    public void iScrollTheMapUntillWestPalmBeach() throws InterruptedException {
        new OurStorePage().dragMapToMyLocation();

    }

    @And("^I take screenshot$")
    public void iTakeScreenshot() {
        Utility.takeScreenShot();
    }
}
