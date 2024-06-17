Feature: Account statement

  Background:
    Given Account exists for Acc No. "12345678" with Name "Bob Smith"
    And deposits are made
      | INIT | 200 |
      | DEP1 | 100 |
      | DEP2 | 450 |
      | DEP3 | 50  |
    And withdrawls are made
      | CHQ001 | 675.55 |
    When statement is produced


  @regression
  Scenario: Statement includes account details
    Then statement includes "Name: Bob Smith"
    * statement includes "Account: 12345678"

  @regression
  Scenario: Balance is calculated on the statement
    Then statement include "Balance: 124.45"

  @regression
  Scenario: Statement includes transaction details
    Then Statement includes "INIT"
    * Statement includes "DEP1"
    * Statement includes "DEP2"
    * Statement includes "DEP3"
    * Statement includes "CHQ001"
