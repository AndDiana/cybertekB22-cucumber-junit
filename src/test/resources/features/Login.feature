@regression @smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

    #THIS IS HOW WE COMMENT IN FEATURE FILE

  Background: Assuming user is on the login page
    Given user is on the login page

  @librarian @employee @login
  Scenario: Login as librarian
    Given user is on the login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student @login
  Scenario: Login as student
    Given user is on the login page
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee @login
  Scenario: Login as admin
    Given user is on the login page
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard


