Feature: The user can change their own password
  Rule: As a user
  I want to be able to change my own password within the guidelines of password policy
  So that the integrity of my account security requirements are met.

  Background:
      Given the user "Tester" exists with password "Test1"

    Scenario: Successful password change
      When the user enters the Username "Tester"
      And the user enters the current password "Test1"
      And the user enters a new password "Test2"
      And the user verify the new password "Test2"
      And the user click on the submit button
      Then the password should be changed successfully
      And the user should be able to login with the new password "Test2"


