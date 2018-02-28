Feature: Cash Withdrawal
  Scenario: Successful withdrawal from an account in credit
    Given I have deposited $200.00 in my account
    When I withdraw $10
    Then $10 should be dispensed
