package com.robertgabriel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By flashMessage = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String baseUrl) {
        driver.get(baseUrl + "/login");
    }

    public void login(String username, String password) {
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public String getFlashMessage() {
        return driver.findElement(flashMessage).getText().trim();
    }
}
