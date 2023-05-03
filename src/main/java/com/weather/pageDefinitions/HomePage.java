package com.weather.pageDefinitions;

import com.weather.ChromeWebDriver;

public class HomePage {

    protected ChromeWebDriver driver;

    public HomePage(ChromeWebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver = new ChromeWebDriver();
        driver.get("https://www.emag.ro");
    }
}
