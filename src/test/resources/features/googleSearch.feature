@title
Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  1. User is on Google search page
  2. User types apple in the google search box and clicks enter
  3. User sees Steve Jobs is in the google title

  Scenario: Search page title verification
    Given user is on Google search page
    When user types apple in the google search box and clicks enter
    Then user sees apple is in the google title

  Scenario: Search page title verification
    Given user is on Google search page
    When user types "apple" in the google search box and clicks enter
    Then user sees "apple" is in the google title

  Scenario: Data Driven Testing Format preparation
    Given user is on Google search page
    When user types "capital of Turkey" and clicks enter
    Then User should see "Ankara" in the result

  Scenario Outline: Search functionality in a Data Driven Testing Format
    Given user is on Google search page
    When user types "capital of <country>" and clicks enter
    Then User should see "<capital>" in the result
    Examples:
      |country|capital|
      |Turkey |Ankara |
      |USA    |Washington, D.C.|
      |Ukraine|Kyiv         |
      |Gemany |Berlin       |
      |UK     |London       |
      |Latvia |Riga         |
      |Greece |Athens       |




