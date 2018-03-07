$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cash_withdrawal.feature");
formatter.feature({
  "line": 1,
  "name": "Cash Withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 411930,
  "status": "passed"
});
formatter.before({
  "duration": 1279526,
  "status": "passed"
});
formatter.before({
  "duration": 80115153,
  "status": "passed"
});
formatter.before({
  "duration": 1989861958,
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
  "duration": 315473187,
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
  "duration": 76289333307,
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
  "duration": 2980575,
  "error_message": "java.lang.AssertionError: Incorrect amount dispensed - expected:\u003c10\u003e but was:\u003c0\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat org.junit.Assert.assertEquals(Assert.java:555)\n\tat nicebank.CashSlotSteps.$ShouldBeDispensed(CashSlotSteps.java:21)\n\tat ✽.Then $10 should be dispensed(cash_withdrawal.feature:5)\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.after({
  "duration": 64541,
  "status": "passed"
});
formatter.after({
  "duration": 254425,
  "status": "passed"
});
formatter.after({
  "duration": 141474202,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4919869337,
  "status": "passed"
});
});