package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.JavaScriptAlertsPage;
import com.theinternet.tests.base.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlertsTest extends TestBase {

    private JavaScriptAlertsPage openAlertsPage() {
        driver.get("https://the-internet.herokuapp.com/");
        HomePage home = new HomePage(driver);
        home.openJavaScriptAlerts();
        return new JavaScriptAlertsPage(driver);
    }

    @Test
    public void userCanAcceptJsAlert() throws InterruptedException {

        JavaScriptAlertsPage alertsPage = openAlertsPage();

        alertsPage.clickJsAlertButton();
        Thread.sleep(1500);
        alertsPage.acceptAlert();

        Assert.assertEquals(
                alertsPage.getResultText(),
                "You successfully clicked an alert"
        );
    }

    @Test
    public void userCanAcceptJsConfirm() {

        JavaScriptAlertsPage alertsPage = openAlertsPage();

        alertsPage.clickJsConfirmButton();
        alertsPage.acceptAlert();

        Assert.assertEquals(
                alertsPage.getResultText(),
                "You clicked: Ok"
        );
    }

    @Test
    public void userCanCancelJsConfirm() {

        JavaScriptAlertsPage alertsPage = openAlertsPage();

        alertsPage.clickJsConfirmButton();
        alertsPage.dismissAlert();

        Assert.assertEquals(
                alertsPage.getResultText(),
                "You clicked: Cancel"
        );
    }

    @Test
    public void userCanEnterTextInJsPrompt() {

        JavaScriptAlertsPage alertsPage = openAlertsPage();

        alertsPage.clickJsPromptButton();
        alertsPage.enterTextInPrompt("Tala");

        Assert.assertEquals(
                alertsPage.getResultText(),
                "You entered: Tala"
        );
    }

    @Test
    public void userCanSeeJsConfirmText() {

        JavaScriptAlertsPage alertsPage = openAlertsPage();

        alertsPage.clickJsConfirmButton();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Confirm");

        alert.accept();
    }
}
