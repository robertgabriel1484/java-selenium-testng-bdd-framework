# Sample Bug Report

## Title

Invalid login error message is not displayed when user enters incorrect password

## Environment

- Application: Public demo login page
- Browser: Chrome
- Test type: Regression / Negative login validation
- Automation: Java, Selenium, TestNG, Cucumber

## Preconditions

User is on the login page.

## Steps to reproduce

1. Navigate to `/login`.
2. Enter valid username: `tomsmith`.
3. Enter invalid password: `WrongPassword123`.
4. Click Login.

## Expected result

Application displays an error message containing:

```text
Your password is invalid!
```

## Actual result

Example placeholder:

```text
No error message displayed.
```

## Severity

Medium

## Priority

High

## Impact

Users may not receive clear feedback when login fails, which could increase support requests and reduce confidence in authentication workflows.

## Evidence

- Screenshot attached by automation on failure.
- Cucumber report generated under `target/cucumber-reports/`.
- Scenario: `Invalid password shows an error`
