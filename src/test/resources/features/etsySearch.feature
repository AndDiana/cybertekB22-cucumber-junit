#TC#24: Etsy Search Functionality Title Verification
#1. User is on https://www.etsy.com/
#2. User types Wooden Spoon in the search box
#3. User clicks search button
#4. User sees Wooden Spoon is in the title


Feature: Etsy search feature
  Agile Story: As a user, when I am on the Etsy search page,
  I should be able to search whatever I want and see
  relevant information

  User story #/ Jira# AU756


  Scenario: Etsy default title verification
    Given user is on the Etsy landing page
    Then user should see Etsy title as expected

    #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  Scenario: Etsy Search Functionality Title Verification
    Given user is on the Etsy landing page
    When user types Wooden Spoon in the search bar
    And user clicks to search button
    Then user sees title is Wooden spoon | Etsy