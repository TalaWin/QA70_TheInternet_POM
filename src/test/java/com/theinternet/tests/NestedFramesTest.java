package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.NestedFramesPage;
import com.theinternet.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFramesTest extends TestBase {

    private NestedFramesPage openNestedFramesPage() {
        driver.get("https://the-internet.herokuapp.com/");
        HomePage home = new HomePage(driver);
        home.openNestedFrames();
        return new NestedFramesPage(driver);
    }

    @Test
    public void userCanSeeLeftFrameText() {

        NestedFramesPage framesPage = openNestedFramesPage();

        String left = framesPage.getLeftFrameText();
        Assert.assertEquals(left, "LEFT");
    }

    @Test
    public void userCanSeeMiddleFrameText() {

        NestedFramesPage framesPage = openNestedFramesPage();

        String middle = framesPage.getMiddleFrameText();
        Assert.assertEquals(middle, "MIDDLE");
    }

    @Test
    public void userCanSeeRightFrameText() {

        NestedFramesPage framesPage = openNestedFramesPage();

        String right = framesPage.getRightFrameText();
        Assert.assertEquals(right, "RIGHT");
    }

    @Test
    public void userCanSeeBottomFrameText() {

        NestedFramesPage framesPage = openNestedFramesPage();

        String bottom = framesPage.getBottomFrameText();
        Assert.assertEquals(bottom, "BOTTOM");
    }
}
