package com.theinternet.pages;

import com.theinternet.pages.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class JavaScriptAlertsPage extends BasePage {

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    private WebElement jsAlertButton;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    private WebElement jsConfirmButton;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    private WebElement jsPromptButton;

    @FindBy(id = "result")
    private WebElement resultText;

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);

        PageFactory.initElements(driver, this);
    }


    public void clickJsAlertButton() {
        click(jsAlertButton);
    }


    public void clickJsConfirmButton() {
        click(jsConfirmButton);
    }

    public void clickJsPromptButton() {
        click(jsPromptButton);
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void enterTextInPrompt(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    public String getResultText() {
        return getText(resultText);
    }
}
