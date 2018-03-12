package nicebank;

import cucumber.api.java.en.*;
import org.junit.Assert;
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


    @Then("^I should see an out-of-order message$")
    public void iShouldSeeAnOutOfOrderMessage() throws Throwable {

        Assert.assertTrue(
                "Expected error message not displayed",
                teller.isDisplaying("Out of order"));
    }

    @Then("^I should see an ask-for-less-money message$")
    public void iShouldSeeAnAskForLessMoneyMessage() throws Throwable {
        Assert.assertTrue(
                "Expected error message not displayed",
                teller.isDisplaying("Insufficient ATM funds"));
    }

    @When("^I type \\$(\\d+)$")
    public void iType$(int amount) throws Throwable {
        teller.type(amount);
    }

}