package com.theinternet.pages;

import com.theinternet.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;

    @FindBy(linkText = "JavaScript Alerts")
    private WebElement javaScriptAlertsLink;

    @FindBy(linkText = "Nested Frames")
    private WebElement nestedFramesLink;

    public void clickOnFormAuthentication() {
        click(formAuthenticationLink);
    }

    public void openJavaScriptAlerts() {
        click(javaScriptAlertsLink);
    }

    public void openNestedFrames() {
        click(nestedFramesLink);
    }
}
