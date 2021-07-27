Feature: Smart Bear order

  User Story : As a user I should be able to login to Smart Bear website and place an order successfully

  Scenario: Verify order
    Given User is on SmartBear login page
    When User enters correct username and password
    And User navigates to Order page
    And User selects "FamilyAlbum" from product dropdown
    And User enters "4" to quantity
    And User enters "John Wick" to costumer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters "60056" for zipCode
    And User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
    Then User verifies "John Wick" is in the list










