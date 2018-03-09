package nicebank;

import cucumber.api.java.en.*;
import support.AtmUserInterface;
import support.TestAccount;

public class TellerSteps {

    AtmUserInterface teller;
    TestAccount account;

    public TellerSteps(AtmUserInterface teller, TestAccount account) {
        this.teller = teller;
        this.account = account;
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int amount) throws Throwable {
        teller.withdrawFrom(account, amount);
    }
}