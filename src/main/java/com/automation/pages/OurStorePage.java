package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurStorePage extends Utility {

    private static final Logger log= LogManager.getLogger(OurStorePage.class.getName());

    public OurStorePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[@class='item']//a[@title='Our stores'][normalize-space()='Our stores']")
    WebElement ourstore;

    @FindBy(xpath = "//button[@class='dismissButton']")
    WebElement popUpOk;

    @FindBy(id = "//div[@id='center_column']")
    WebElement map;

    @FindBy (xpath = "//button[@title='Zoom out']")
    WebElement zoomOutButton;

    public void clickOnPopUp(){
        clickOnElement(popUpOk);
        log.info("click on pop up " +popUpOk.toString());
    }

    public void clickOnOurStorePage(){
        clickOnElement(ourstore);
        log.info("clicking on our store :" +ourstore.toString());
    }

    public void dragMapToMyLocation() throws InterruptedException {

        clickOnElement(zoomOutButton);
       Thread.sleep(1000);
        clickOnElement(zoomOutButton);
        Thread.sleep(1000);

        Actions builder=new Actions(driver);
        Action dragTheMap = builder.clickAndHold(map).moveByOffset(20, -300).moveToElement(map).release(map).build();
        dragTheMap.perform();
    }





}
