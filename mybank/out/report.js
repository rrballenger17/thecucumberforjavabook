$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cash_withdrawal.feature");
formatter.feature({
  "line": 1,
  "name": "Cash Withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1019202,
  "status": "passed"
});
formatter.before({
  "duration": 979479831,
  "status": "passed"
});
formatter.before({
  "duration": 55893861,
  "status": "passed"
});
formatter.before({
  "duration": 469662,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "id": "cash-withdrawal;successful-withdrawal-from-an-account-in-credit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "my account has been credited with $200.00",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I withdraw $10",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "$10 should be dispensed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "the balance of my account should be $190.00",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "$200.00",
      "offset": 34
    }
  ],
  "location": "AccountSteps.iHaveDeposited$InMyAccount(Money)"
});
formatter.result({
  "duration": 145866077,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 12
    }
  ],
  "location": "TellerSteps.iWithdraw$(int)"
});
formatter.result({
  "duration": 8068525905,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 1
    }
  ],
  "location": "CashSlotSteps.$ShouldBeDispensed(int)"
});
formatter.result({
  "duration": 3123802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$190.00",
      "offset": 36
    }
  ],
  "location": "AccountSteps.theBalanceOfMyAccountShouldBe$(Money)"
});
formatter.result({
  "duration": 939392500,
  "status": "passed"
});
formatter.after({
  "duration": 269374,
  "status": "passed"
});
formatter.after({
  "duration": 14306350,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4197624036,
  "status": "passed"
});
formatter.after({
  "duration": 50477,
  "status": "passed"
});
});