package com.robertgabriel.qa.core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hooks {
    @Before
    public void startScenario() {
        DriverFactory.getDriver();
    }

    @After
    public void finishScenario(Scenario scenario) {
        WebDriver driver = DriverFactory.getDriver();

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failure-screenshot");
            saveScreenshotToTargetFolder(scenario.getName(), screenshot);
        }

        DriverFactory.quitDriver();
    }

    private void saveScreenshotToTargetFolder(String scenarioName, byte[] screenshot) {
        try {
            String safeName = scenarioName.replaceAll("[^a-zA-Z0-9-_]", "_");
            Path screenshotDir = Path.of("target", "screenshots");
            Files.createDirectories(screenshotDir);
            Files.write(screenshotDir.resolve(safeName + ".png"), screenshot);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save screenshot", e);
        }
    }
}
