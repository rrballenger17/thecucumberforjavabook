Feature: Cash Withdrawal
  Scenario: Successful withdrawal from an account in credit
    Given my account has been credited with $200.00
    When I withdraw $10
    Then $10 should be dispensed
    And the balance of my account should be $190.00








