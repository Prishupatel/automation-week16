package com.automation.cucumber.steps;

import com.automation.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WomenSummerDressSteps {
    @And("^I mouse hover on women tab$")
    public void iMouseHoverOnWomenTab() {
        new WomenPage().mouseHoveronWomenTab();
    }

    @And("^I click on summer dress sub menu$")
    public void iClickOnSummerDressSubMenu() {
        new WomenPage().clickOnSummerDress();
    }

    @Then("^I navigated to summer dress page$")
    public void iNavigatedToSummerDressPage() {
        new WomenPage().verifySummerDressPage();
    }

    @And("^I change the price slider to \"([^\"]*)\"$")
    public void iChangeThePriceSliderTo(String arg0) throws InterruptedException {
        new WomenPage().sliderAction();
    }

    @Then("^I can see products price between applied price range$")
    public void iCanSeeProductsPriceBetweenAppliedPriceRange() {
    }
}
