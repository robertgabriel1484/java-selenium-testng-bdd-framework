package com.robertgabriel.qa.steps;

import com.robertgabriel.qa.core.ConfigReader;
import com.robertgabriel.qa.core.DriverFactory;
import com.robertgabriel.qa.pages.LoginPage;
import com.robertgabriel.qa.pages.SecureAreaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertTrue;

public class LoginSteps {
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private final SecureAreaPage secureAreaPage = new SecureAreaPage(DriverFactory.getDriver());

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.open(ConfigReader.get("base.url"));
    }

    @When("I log in with username {string} and password {string}")
    public void iLogInWithUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("I should see the secure area message {string}")
    public void iShouldSeeTheSecureAreaMessage(String expectedMessage) {
        String actualMessage = secureAreaPage.getSuccessMessage();
        assertTrue(actualMessage.contains(expectedMessage),
                "Expected success message to contain: " + expectedMessage + " but was: " + actualMessage);
    }

    @Then("I should see a login error message containing {string}")
    public void iShouldSeeALoginErrorMessageContaining(String expectedMessage) {
        String actualMessage = loginPage.getFlashMessage();
        assertTrue(actualMessage.contains(expectedMessage),
                "Expected error message to contain: " + expectedMessage + " but was: " + actualMessage);
    }
}
