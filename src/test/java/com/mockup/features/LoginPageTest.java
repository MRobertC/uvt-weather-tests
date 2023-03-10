package com.mockup.features;

import com.mockup.ChromeWebDriver;
import com.mockup.pageDefinitions.HomePage;
import com.mockup.pageDefinitions.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest {
    private LoginPage loginPage;
    private ChromeWebDriver driver;

    @Before
    public void setup() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();
    }

    @Test
    public void testLogin() {
        loginPage.setUsername("username");
        loginPage.setPassword("password");
        loginPage.clickLoginButton();
        driver.quit();
        // Add assertions to verify successful login
    }
}