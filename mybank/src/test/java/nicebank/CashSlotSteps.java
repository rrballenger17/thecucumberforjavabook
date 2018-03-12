package nicebank;

import cucumber.api.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;


import org.junit.*;
import support.TestCashSlot;

public class CashSlotSteps {

    @Autowired
    TestCashSlot cashSlot;

    @Given("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars,
                cashSlot.getContents());
    }


    @Given("^the cash slot has developed a fault$")
    public void theCashSlotHasDevelopedAFault() throws Throwable {
        cashSlot.injectFault();
    }

    @Given("^the ATM contains \\$(\\d+)$")
    public void theATMContains$(int dollars) throws Throwable {
        cashSlot.load(dollars);
    }

}
