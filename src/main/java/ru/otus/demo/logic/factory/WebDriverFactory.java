package ru.otus.demo.logic.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class WebDriverFactory {
    public static WebDriver getWebDriver(String browser) {
        switch (browser.trim().toLowerCase(Locale.ROOT)) {
            case "ff":
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
    }
}
