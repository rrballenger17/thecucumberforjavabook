Feature: Cash Withdrawal
  Scenario: Successful withdrawal from an account in credit
    Given my account has been credited with $200.00
    When I withdraw $10
    Then $10 should be dispensed
    And the balance of my account should be $190.00


  Scenario: Unsuccessful withdrawal due to technical fault
    Given my account has been credited with $100.00
    But the cash slot has developed a fault
    When I withdraw $20
    Then I should see an out-of-order message
    And $0 should be dispensed
    And the balance of my account should be $100.00

#  Scenario: Unsuccessful withdrawal due to technical fault
#    Given my account is in credit
#    But the cash slot has developed a fault
#    When I request some of my money
#    Then I should see an out-of-order message
#    And $0 should be dispensed
#    And the balance of my account should be unchanged

  Scenario: Unsuccessful withdrawal due to insufficient ATM funds
    Given my account is in credit
    And the ATM contains $10
    When I withdraw $20
    Then I should see an ask-for-less-money message
    And $0 should be dispensed
    And the balance of my account should be unchanged


  @x
  Scenario: Unsuccessful withdrawal due to insufficient ATM funds
    Given my account is in credit
    And the ATM contains $10
    When I type $20
    Then I should see an ask-for-less-money message





