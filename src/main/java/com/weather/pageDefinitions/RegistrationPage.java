package com.weather.pageDefinitions;

import com.weather.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private ChromeWebDriver driver;
    private final By usernameField = By.id("username");
    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By confirmPasswordField = By.id("confirm-password");
    private final By registerButton = By.id("register-button");

    public RegistrationPage(ChromeWebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        WebElement element = driver.findElement(usernameField);
        element.sendKeys(username);
    }

    public void setEmail(String email) {
        WebElement element = driver.findElement(emailField);
        element.sendKeys(email);
    }

    public void setPassword(String password) {
        WebElement element = driver.findElement(passwordField);
        element.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        WebElement element = driver.findElement(confirmPasswordField);
        element.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        WebElement element = driver.findElement(registerButton);
        element.click();
    }
}