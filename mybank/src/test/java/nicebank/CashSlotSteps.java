package nicebank;

import cucumber.api.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;


import org.junit.*;

public class CashSlotSteps {

    @Autowired
    CashSlot cashSlot;

    @Given("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars,
                cashSlot.getContents());
    }


}
