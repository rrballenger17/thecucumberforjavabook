package nicebank;

import cucumber.api.java.en.*;
import cucumber.api.Transform;

import org.junit.*;

import org.springframework.beans.factory.annotation.Autowired;

import transforms.MoneyConverter;


public class AccountSteps {

    @Autowired
    Account account;

    private Money originalBalance;

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

    @Given("^my account is in credit$")
    public void myAccountIsInCredit$() throws Throwable {
        originalBalance = new Money(30, 00);
        account.credit(originalBalance);
    }

    @Then("^the balance of my account should be unchanged$")
    public void theBalanceOfMyAccountShouldBeUnchanged() throws Throwable {
        checkBalanceIs(originalBalance);
    }

    private void checkBalanceIs(Money amount) throws Throwable {
        int timeoutMilliSecs = 3000;
        int pollIntervalMilliSecs = 100;

        while (!account.getBalance().equals(amount) && timeoutMilliSecs > 0) {
            Thread.sleep(pollIntervalMilliSecs);
            timeoutMilliSecs -= pollIntervalMilliSecs;
        }

        Assert.assertEquals(
                "Incorrect account balance -",
                amount,
                account.getBalance());
    }

}
