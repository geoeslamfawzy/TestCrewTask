Feature: Subscription Management

  Scenario Outline: Validate Bahrain country
    Given I am on the subscription home page
    When I change the "<Country>" country
    Then I should see "<Country>" as the selected country
    Then I should validate all packages from "<sheet>" sheet
    Examples:
      | Country | sheet   |
      | KSA     | KSA     |
      | Bahrain | Bahrain |
      | Kuwait  | Kuwait  |