package ru.otus.demo.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.otus.demo.logic.factory.WebDriverFactory;
import ru.otus.demo.logic.pages.MainPage;

public class Test001 {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    public void SetUp() {
        driver = WebDriverFactory.getWebDriver("chrome");
        mainPage = new MainPage(driver);
        driver.get("https://otus.ru");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test01() {
        mainPage
                .clickRandomLesson();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
