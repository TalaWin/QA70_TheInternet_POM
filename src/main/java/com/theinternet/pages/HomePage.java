package com.theinternet.pages;

import com.theinternet.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Главная страница https://the-internet.herokuapp.com/
 * Каждая ссылка может вести на свой PageObject.
 */
public class HomePage extends BasePage {

    // Пример: ссылка "Form Authentication"
    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;

    public HomePage(WebDriver driver) {
        super(driver);
        // Инициализация всех @FindBy через PageFactory
        PageFactory.initElements(driver, this);
    }

    // Действие: клик по ссылке "Form Authentication"
    public void clickOnFormAuthentication() {
        click(formAuthenticationLink);
    }

    // В будущем можно добавить методы: клик по другим ссылкам и т.д.
}
