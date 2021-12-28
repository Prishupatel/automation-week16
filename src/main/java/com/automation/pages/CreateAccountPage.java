package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailfornewaccount;

    @FindBy(css = "button[id='SubmitCreate'] span")
    WebElement createAccounTAB;

    @FindBy(css = "#customer_firstname")
    WebElement firstName;

    @FindBy(css = "#customer_lastname")
    WebElement lastName;

    @FindBy(css = "#passwd")
    WebElement password;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#id_state")   //dropdown
    WebElement state;

    @FindBy(css = "#postcode")
    WebElement postcode;

    @FindBy(css = "#id_country")    //dropdown
    WebElement country;

    @FindBy(css = "#phone_mobile")
    WebElement phoneNumber;

    @FindBy(css = "button[id='submitAccount'] span")
    WebElement registerButton;

    @FindBy(xpath = "//div[@class='nav']//div[@class='row']//div[1]//a//span")
    WebElement nameVerify;

    @FindBy(xpath = "//div[@class='alert alert-danger']//p")
    WebElement errorHeadingText;

    public void verifyErrorMessage(String text){
        String actual= errorHeadingText.getText();
        boolean verifyError=actual.contains(text);
        log.info("verifying error message: '"+errorHeadingText.getText()+"'");
        Assert.assertTrue(verifyError);
    }



    public void verifyMyAccount(String accontName){
      boolean actual=nameVerify.getText().contains(accontName);
      log.info("verify account name text : " );
        AssertJUnit.assertTrue(actual);
    }


    public void enterEmailfornewacountcreation() {

        randomEmail(emailfornewaccount);
        log.info("Entering email for new account user: " + emailfornewaccount.toString());
    }

    public void clickOnCreateAnAccountButton() {
        clickOnElement(createAccounTAB);
        log.info("clicking on create an account button: " + createAccounTAB.toString());
    }

    public void enterYourFirstName(String name) {

        sendTextToElement(firstName, name);
        log.info("Entering First Name : " + firstName.toString());
    }

    public void enterYourLastName(String surname) {

        sendTextToElement(lastName, surname);
        log.info("Entering Last Name: " + lastName.toString());
    }

    public void enterYourPassword(String pass) {

        sendTextToElement(password, pass);
        log.info("Entering Password : " + password.toString());
    }

    public void enterYourAddress(String add) {

        sendTextToElement(address, add);
        log.info("Entering address : " + address.toString());
    }

    public void enterYourCity(String cityy) {
        sendTextToElement(city, cityy);
        log.info("Entering city: " + cityy.toString());
    }

    public void selectYourState(String st) {
        selectByValueFromDropDown(state, st);
        log.info("Entering State: " + state.toString());
    }

    public void enterYourPhoneNumber(String phone) {
        sendTextToElement(phoneNumber, phone);
        log.info("Entering Phone number: " + phoneNumber.toString());
    }

    public void enterYourPostalCode(String postal) {
        sendTextToElement(postcode, postal);
        log.info("Entering postcode: " + postcode.toString());
    }

    public void selectYourCountry(String countryy) {
        selectByValueFromDropDown(country, countryy);
        log.info("Entering Country: " + country.toString());
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("clicking on register button: " + registerButton.toString());
    }




}
