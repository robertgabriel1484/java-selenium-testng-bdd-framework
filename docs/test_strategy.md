# Test Strategy

## Objective

Demonstrate a maintainable UI automation approach using Java, Selenium WebDriver, TestNG, Cucumber/Gherkin, and Page Object Model design.

## Scope

### In scope

- Login validation
- Positive login scenario
- Negative username/password scenarios
- Error-message validation
- Regression-friendly BDD coverage
- Screenshot capture on failure
- CI execution through GitHub Actions

### Out of scope

- Security testing
- Load/performance testing
- Database validation
- API validation

## Test types

- Smoke testing
- Regression testing
- Functional testing
- Negative testing
- BDD acceptance-style testing

## Automation design

- Feature files describe expected behavior in business-readable language.
- Step definitions map Gherkin steps to Java automation code.
- Page Objects contain UI locators and user actions.
- DriverFactory manages browser creation and cleanup.
- Hooks handle scenario setup, teardown, and failure screenshots.

## Quality signals

- Tests run successfully in CI.
- Failed tests produce screenshots.
- Reports are generated after each run.
- Scenarios are readable by technical and non-technical stakeholders.
