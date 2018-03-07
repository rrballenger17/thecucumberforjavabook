package nicebank;

import cucumber.api.java.en.*;

import org.junit.*;

import support.KnowsTheDomain;

import transforms.MoneyConverter;

public class CashSlotSteps {

    KnowsTheDomain helper;

    public CashSlotSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Given("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars,
                helper.getCashSlot().getContents());
    }


}
