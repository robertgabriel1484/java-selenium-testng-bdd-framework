# Java Selenium TestNG BDD Framework

Portfolio-ready QA automation framework demonstrating Java, Selenium WebDriver, TestNG, Cucumber/Gherkin BDD, Page Object Model design, reusable test utilities, screenshots on failure, and CI execution through GitHub Actions.

## What this project demonstrates

- Java-based UI automation
- Selenium WebDriver
- TestNG runner
- Cucumber/Gherkin BDD scenarios
- Page Object Model design
- Reusable DriverFactory
- Config-driven browser/base URL settings
- Screenshot capture on failure
- GitHub Actions CI workflow
- QA documentation: test strategy and sample bug report

## Demo application

The sample tests use the public demo login page:

https://the-internet.herokuapp.com/login

Demo credentials:

- Username: `tomsmith`
- Password: `SuperSecretPassword!`

## Tech stack

- Java 17
- Maven
- Selenium WebDriver
- TestNG
- Cucumber
- WebDriverManager
- GitHub Actions

## How to run locally

Prerequisites:

- Java 17+
- Maven
- Chrome browser

Run all tests:

```bash
mvn clean test
```

Run headed:

```bash
mvn clean test -Dheadless=false
```

## Project structure

```text
.github/workflows/ci.yml
docs/sample_bug_report.md
docs/test_strategy.md
src/test/java/com/robertgabriel/qa/core/
src/test/java/com/robertgabriel/qa/pages/
src/test/java/com/robertgabriel/qa/runners/
src/test/java/com/robertgabriel/qa/steps/
src/test/resources/features/login.feature
src/test/resources/config/config.properties
src/test/resources/testdata/users.csv
pom.xml
```

## Portfolio note

My production background is strongest in Java/Selenium automation, API testing, SQL validation, CI/CD-supported regression testing, and enterprise workflow validation. This repository demonstrates those automation fundamentals in a clean public project that can be shared with recruiters and hiring teams.
