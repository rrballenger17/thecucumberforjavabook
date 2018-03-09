package nicebank;

import cucumber.api.java.en.*;

import org.junit.*;

public class CashSlotSteps {

    CashSlot cashSlot;

    public CashSlotSteps(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    @Given("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars,
                cashSlot.getContents());
    }


}
