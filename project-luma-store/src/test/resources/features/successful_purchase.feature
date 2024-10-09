Feature: Submit a form
  Scenario: Submit a test form on Luma page
    Given VIK is on the homepage
    When she completes the process of purchasing items
    Then she transaction success message is generated