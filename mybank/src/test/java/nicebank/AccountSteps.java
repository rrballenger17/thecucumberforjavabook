package nicebank;

import cucumber.api.java.en.*;
import cucumber.api.Transform;

import org.junit.*;

import support.KnowsTheDomain;
import transforms.MoneyConverter;


public class AccountSteps {

    KnowsTheDomain helper;

    public AccountSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount)
            throws Throwable {
        helper.getMyAccount().deposit(amount);

        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }


}
