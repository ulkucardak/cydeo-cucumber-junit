Feature: DDT example with CloudTables


  Scenario: Adding one person
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "Chuck" to firstname field
    And User enters "Norris" to lastname field
    And User enters "test" to position field
    And User enters "100000" to salary field
    And User clicks on create button
    Then User should be able to find person at the search box
  And User should be able to delete the person created

# change this scenario into DDT format---> turn it into scenario outline


  Scenario Outline: Adding one person
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "<firstName>" to firstname field
    And User enters "<lastName>" to lastname field
    And User enters "<position>" to position field
    And User enters "<salary>" to salary field
    And User clicks on create button
    Then User should be able to find person at the search box
    And User should be able to delete the person created

    Examples:
      | firstName | lastName   | position  | salary |
      | Marie     | Curie      | SDET      | 100000 |
      | Rosalind  | Franklin   | Developer | 150000 |
      | List      | Meitner    | QA        | 135000 |
      | Chien     | Wu         | SDET      | 125000 |
      | Barbara   | McClintock | QA        | 118000 |