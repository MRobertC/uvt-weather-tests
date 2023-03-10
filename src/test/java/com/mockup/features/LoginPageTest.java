package com.mockup.features;

import com.mockup.MyWebDriver;
import com.mockup.pageDefinitions.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginPageTest extends MyWebDriver {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/robert.curetean/Desktop/Projects/Java Selenium Mockup/src/main/resources/chromedriver");
        driver.get("https://www.google.com");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.setUsername("username");
        loginPage.setPassword("password");
        loginPage.clickLoginButton();
        // Add assertions to verify successful login
    }

    @After
    public void destroy() {
        driver.quit();
    }
}