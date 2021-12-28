package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

public class CreateAccountSteps {
    @And("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLinkOnHomePage();
    }

    @And("^I enter an email for new account creation$")
    public void iEnterAnEmailForNewAccountCreation() {
        new CreateAccountPage().enterEmailfornewacountcreation();
    }

    @And("^I click on create new account button$")
    public void iClickOnCreateNewAccountButton() {
        new CreateAccountPage().clickOnCreateAnAccountButton();
    }


    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String arg0)  {
        new CreateAccountPage().enterYourFirstName(arg0);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String arg0)  {
        new CreateAccountPage().enterYourLastName(arg0);

    }

    @And("^I enter register password \"([^\"]*)\"$")
    public void iEnterRegisterPassword(String arg0)  {
        new CreateAccountPage().enterYourPassword(arg0);
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String arg0)  {
        new CreateAccountPage().enterYourAddress(arg0);

    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String arg0)  {
        new CreateAccountPage().enterYourCity(arg0);

    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String arg0)  {
        new CreateAccountPage().selectYourState(arg0);
    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String arg0)  {
        new CreateAccountPage().enterYourPostalCode(arg0);
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String arg0)  {
        new CreateAccountPage().selectYourCountry(arg0);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String arg0)  {
        new CreateAccountPage().enterYourPhoneNumber(arg0);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }

    @Then("^I can see my name as registered user$")
    public void iCanSeeMyNameAsRegisteredUser() {

    }

    @And("^I enter following details to create an account$")
    public void iEnterFollowingDetailsToCreateAnAccount(DataTable dataTable) {
        List<Map<String,String>> form=dataTable.asMaps(String.class,String.class);
        String fname=form.get(0).get("name");
        String lname=form.get(0).get("surname");
        String pass=form.get(0).get("password");
        String add=form.get(0).get("add");
        String city=form.get(0).get("city");
        String state=form.get(0).get("state");
        String postal=form.get(0).get("postal");
        String country=form.get(0).get("country");
        String phone=form.get(0).get("phone");

        new CreateAccountPage().enterYourFirstName(fname);
        new CreateAccountPage().enterYourLastName(lname);
        new CreateAccountPage().enterYourPassword(pass);
        new CreateAccountPage().enterYourAddress(add);
        new CreateAccountPage().enterYourCity(city);
        new CreateAccountPage().selectYourState(state);
        new CreateAccountPage().enterYourPostalCode(postal);
        new CreateAccountPage().selectYourCountry(country);
        new CreateAccountPage().enterYourPhoneNumber(phone);



    }

    @Then("^I can see my name as registered user \"([^\"]*)\"$")
    public void iCanSeeMyNameAsRegisteredUser(String name)  {
       new CreateAccountPage().verifyMyAccount(name);
    }

    @Then("^I can see errors and could not able to create account \"([^\"]*)\"$")
    public void iCanSeeErrorsAndCouldNotAbleToCreateAccount(String text) {
        new CreateAccountPage().verifyErrorMessage(text);
    }
}
