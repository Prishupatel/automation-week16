package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps {
    @Given("^i am on home page$")
    public void iAmOnHomePage() {
    }


    @And("^I click on printed dress$")
    public void iClickOnPrintedDress() {
        new HomePage().clickOnPrintedDress();
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new HomePage().clickOnAddToCart();
    }

    @Then("^I can see product added to cart$")
    public void iCanSeeProductAddedToCart() throws InterruptedException {
        new HomePage().verifyCartMsg();
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new HomePage().clickOnProceedToCheckOut();
    }

    @Then("^I can see delete icon$")
    public void iCanSeeDeleteIcon() {
        new HomePage().verifyTrashIcon();
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        new HomePage().clickOnDeleteButton();
    }

    @Then("^I can see your cart is empty$")
    public void iCanSeeYourCartIsEmpty() throws InterruptedException {
        new HomePage().verifyYourCartisEmpty();
    }
}
