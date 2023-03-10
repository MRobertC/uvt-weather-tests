package com.mockup.pageDefinitions;

import com.mockup.ChromeWebDriver;

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
