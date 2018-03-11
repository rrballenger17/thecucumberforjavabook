package nicebank;

import cucumber.api.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;
import support.AtmUserInterface;

public class TellerSteps {

    @Autowired
    AtmUserInterface teller;

    @Autowired
    Account account;

    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int amount) throws Throwable {
        teller.withdrawFrom(account, amount);
    }
}