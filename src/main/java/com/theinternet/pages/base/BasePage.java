/*
###HOMEWORK

В домашнем проекте https://the-internet.herokuapp.com/
создайте, пожалуйста, тесты для проверки кнопок
на странице JavaScript Alerts

В домашнем проекте https://the-internet.herokuapp.com,
где вы тестируете веб приложение, создайте, пожалуйста, тесты для проверки вложенных фреймов на странице Nested Frames
*/

package com.theinternet.pages.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(WebElement element) {
        return element.getText();
    }

    protected void scrollBy(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }
}
