Feature: Dice job search
  As a user, I should be able to search for jobs, using a key word and zipcode,
  then see result in total
  @dice
  Scenario: User searches for a job
    Given User is on dice homepage
    When User enters keyword and zipcode
    Then User should see search results
