package com.theinternet.pages;

import com.theinternet.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;


    @FindBy(linkText = "JavaScript Alerts")
    private WebElement javaScriptAlertsLink;


    @FindBy(linkText = "Nested Frames")
    private WebElement nestedFramesLink;


    @FindBy(linkText = "File Upload")
    private WebElement fileUploadLink;


    public void clickOnFormAuthentication() {
        click(formAuthenticationLink);
    }


    public void openJavaScriptAlerts() {
        click(javaScriptAlertsLink);
    }


    public void openNestedFrames() {
        click(nestedFramesLink);
    }


    public void openFileUpload() {
        click(fileUploadLink);
    }
}
