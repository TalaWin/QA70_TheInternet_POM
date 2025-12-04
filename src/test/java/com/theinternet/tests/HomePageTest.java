package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.tests.base.TestBase;
import org.testng.annotations.Test;


/**
 * Простой тест, который:
 * - открывает главную страницу (через TestBase)
 * - кликает по "Form Authentication" через POM
 */
public class HomePageTest extends TestBase {

    @Test
    public void userCanOpenFormAuthenticationPage() {
        // Создаём объект главной страницы и передаём туда driver
        HomePage homePage = new HomePage(driver);

        // Кликаем по ссылке "Form Authentication"
        homePage.clickOnFormAuthentication();

        // Здесь потом добавим:
        // - проверку URL
        // - создание LoginPage и т.д.
    }
}
