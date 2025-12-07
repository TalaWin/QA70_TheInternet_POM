package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.tests.base.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void userCanOpenFormAuthenticationPage() {
        driver.get("https://the-internet.herokuapp.com/");
        HomePage home = new HomePage(driver);
        home.clickOnFormAuthentication();
    }

    @Test
    public void userCanOpenJavaScriptAlertsPage() {
        driver.get("https://the-internet.herokuapp.com/");
        HomePage home = new HomePage(driver);
        home.openJavaScriptAlerts();
    }


    @Test
    public void userCanOpenNestedFramesPage() {
        driver.get("https://the-internet.herokuapp.com/");
        HomePage home = new HomePage(driver);
        home.openNestedFrames();
    }
}
