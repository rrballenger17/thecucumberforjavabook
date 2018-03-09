package nicebank;

import cucumber.api.java.en.*;
import cucumber.api.Transform;

import org.junit.*;

import support.TestAccount;
import transforms.MoneyConverter;


public class AccountSteps {

    TestAccount account;

    public AccountSteps(TestAccount account) {
        this.account = account;
    }

    @Given("^my account has been credited with (\\$\\d+\\.\\d+)$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount)
            throws Throwable {
        account.credit(amount);

    }


    @Then("^the balance of my account should be (\\$\\d+\\.\\d+)$")
    public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class) Money amount) throws Throwable {

        int timeoutMilliSecs = 3000;

        int pollIntervalMilliSecs = 100;

        // poll until account balance is updated or 3 seconds
        // directly accesses database
        while (!account.getBalance().equals(amount)

                && timeoutMilliSecs > 0){

            Thread.sleep(pollIntervalMilliSecs);

            timeoutMilliSecs -= pollIntervalMilliSecs;

        }


        Assert.assertEquals(

                "Incorrect account balance -",

                amount,

                account.getBalance());

    }

}
