package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "li[class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-in-line first-item-of-tablet-line last-item-of-mobile-line'] div[class='right-block'] a[title='Printed Dress']")
    WebElement printedDress;

    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addTocart;

    @FindBy(xpath = "//span[normalize-space()='There is 1 item in your cart.']")
    WebElement verifyMsg;

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    WebElement checkout;

    @FindBy(xpath = "//i[@class='icon-trash']")
    WebElement deleteIcon;

    @FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty.')]")
    WebElement emptyMsg;

    @FindBy(css = "a[title='Log in to your customer account']")
    WebElement signIn;

    public void clickOnPrintedDress(){
        clickOnElement(printedDress);
        log.info("click on printed dress");
    }

    public void clickOnAddToCart(){
        clickOnElement(addTocart);
        log.info("click on add to cart");
    }

    public void verifyCartMsg() throws InterruptedException {
        Thread.sleep(2000);
       String expected="There is 1 item in your cart.";
       String actual=getTextFromElement(verifyMsg);
        AssertJUnit.assertEquals("msg not matched",expected,actual);
        log.info("verify cart message");
    }

    public void clickOnProceedToCheckOut(){
        clickOnElement(checkout);
        log.info("click on checkout");
    }

    public void verifyTrashIcon(){
        deleteIcon.isDisplayed();
        log.info("verify delete  button is displayed");
    }

    public void clickOnDeleteButton(){
        clickOnElement(deleteIcon);
        log.info("click on delete button " +deleteIcon.toString());
    }

    public void verifyYourCartisEmpty() throws InterruptedException {
        String expected="Your shopping cart is empty.";
        Thread.sleep(2000);
        String actual=getTextFromElement(emptyMsg);
        AssertJUnit.assertEquals("msg not matched",expected,actual);


    }

    public void clickOnSignInLinkOnHomePage() {
        clickOnElement(signIn);
        log.info("clicking on sign In: " + signIn.toString());
    }





}
