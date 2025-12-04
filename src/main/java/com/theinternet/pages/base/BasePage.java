package com.theinternet.pages.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Базовый класс страницы:
 * - хранит WebDriver
 * - общие методы (клик, ввод текста, скролл и т.д.)
 */
public class BasePage {

    protected WebDriver driver;

    // Конструктор принимает драйвер из теста
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Клик по элементу
    protected void click(WebElement element) {
        element.click();
    }

    // Ввод текста в поле
    protected void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    // Получить текст элемента
    protected String getText(WebElement element) {
        return element.getText();
    }

    // Прокрутка страницы через JavascriptExecutor
    protected void scrollBy(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }
}
