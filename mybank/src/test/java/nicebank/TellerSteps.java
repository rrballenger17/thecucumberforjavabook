package nicebank;

import cucumber.api.java.en.*;
import support.KnowsTheDomain;
import support.AtmUserInterface;

public class TellerSteps {

    KnowsTheDomain helper;
    AtmUserInterface teller;

    public TellerSteps(KnowsTheDomain helper, AtmUserInterface teller) {
        this.teller = teller;
        this.helper = helper;
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int amount) throws Throwable {
        teller.withdrawFrom(helper.getMyAccount(), amount);
    }
}