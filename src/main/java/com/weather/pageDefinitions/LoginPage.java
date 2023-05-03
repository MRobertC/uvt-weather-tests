package com.weather.pageDefinitions;

import com.weather.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private ChromeWebDriver driver;
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    public LoginPage(ChromeWebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        WebElement element = driver.findElement(usernameField);
        element.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement element = driver.findElement(passwordField);
        element.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement element = driver.findElement(loginButton);
        element.click();
    }
}