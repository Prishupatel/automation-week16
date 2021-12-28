package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class WomenPage extends Utility {
    private static final Logger log= LogManager.getLogger(WomenPage.class.getName());

    public WomenPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenTab;

    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Summer Dresses'][normalize-space()='Summer Dresses']")
    WebElement summerDress;

    @FindBy(xpath = "//span[@class='cat-name']")
    WebElement verifyPage;

    @FindBy(xpath = "//div[@id='left_column']//a[2]")
    WebElement slider;



    public void mouseHoveronWomenTab(){
        mouseHoverToElement(womenTab);
        log.info("mouse hover to women tab :" +womenTab.toString());
    }

    public void clickOnSummerDress(){
        clickOnElement(summerDress);
        log.info("click on summer dress :" +summerDress.toString());

    }

    public void verifySummerDressPage(){
        String expected="SUMMER DRESSES ";
        String actual=getTextFromElement(verifyPage);
        AssertJUnit.assertEquals("Page not matched",expected,actual);

    }
    public void sliderAction() throws InterruptedException {
        Actions action= new Actions(driver);
        action.click(slider).build().perform();
        Thread.sleep(1000);
        for (int i=0;i<75;i++){
            action.sendKeys(Keys.ARROW_LEFT).build().perform();
        }
    }




}
