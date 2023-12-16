Feature: Validating STC Subscriptions

  Scenario: Validate KSA Subscriptions
    Given I am on the Subscription Home Page
    When I select KSA as the country
    Then the country name should be "KSA"
    And the package details for "<packageType>" should be "<price> <currency>"

  Scenario: Validate Bahrain Subscriptions
    Given I am on the Subscription Home Page
    When I select Bahrain as the country
    Then the country name should be "Bahrain"
    And the package details for "<packageType>" should be "<price> <currency>"

  Scenario: Validate Kuwait Subscriptions
    Given I am on the Subscription Home Page
    When I select Kuwait as the country
    Then the country name should be "Kuwait"
    And the package details for "<packageType>" should be "<price> <currency>"