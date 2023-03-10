package com.mockup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChromeWebDriver extends EventFiringWebDriver {

    private final WebDriverWait wait;

    public ChromeWebDriver() {
        super(new ChromeDriver(getChromeOptions()));
        wait = new WebDriverWait(this, Duration.ofSeconds(20), Duration.ofMillis(2000));
    }

    private static ChromeOptions getChromeOptions() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--log-level=3");
        options.addArguments("--incognito");
        options.addArguments("--proxy-bypass-list=*");
        options.addArguments("--safebrowsing-disable-auto-update");
        options.addArguments("--disable-sync");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--no-first-run");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-default-apps");
        options.addArguments("--disable-logging");
        options.addArguments("--disable-permissions-api");
        //options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    public WebDriverWait getWebDriverWait() {
        return wait;
    }
}