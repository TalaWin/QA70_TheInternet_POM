package com.theinternet.tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


/**
 * Базовый тестовый класс:
 * - поднимает браузер перед каждым тестом
 * - закрывает браузер после каждого теста
 * - хранит WebDriver как protected-поле,
 *   чтобы использовать его в наследниках (тестах)
 */
public class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Настраиваем драйвер через WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Создаём экземпляр ChromeDriver
        driver = new ChromeDriver();

        // Разворачиваем окно на весь экран
        driver.manage().window().maximize();

        // Неявное ожидание элементов
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Открываем сайт the-internet
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void tearDown() {
        // Если драйвер не равен null, закрываем браузер
        if (driver != null) {
            driver.quit();
        }
    }
}
