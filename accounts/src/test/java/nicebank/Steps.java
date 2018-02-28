
 	
package nicebank;
 	
 	
import cucumber.api.java.en.*;
 	
import cucumber.api.PendingException;

import static org.junit.Assert.assertTrue;
 	
 	
public class Steps {
 	
  private int balance = 0;

  private int toDispense = 0;
 	
  @Given("^I have deposited \\$(\\d+) in my account$")
 	
  public void iHaveDeposited$InMyAccount(int amount) throws Throwable {
 	
    // Write code here that turns the phrase above into concrete actions
 	
    balance += amount;
 	
  }
 	
 	
  @When("^I request \\$(\\d+)$")
 	
  public void iRequest$(int arg1) throws Throwable {
 	
      // Write code here that turns the phrase above into concrete actions
 	
      balance -= arg1;

      assertTrue(balance >= 0);

      toDispense += arg1;
 	
  }
 	
 	
  @Then("^\\$(\\d+) should be dispensed$")
 	
  public void $ShouldBeDispensed(int arg1) throws Throwable {
 	
      // Write code here that turns the phrase above into concrete actions
 	  assertTrue(arg1 == toDispense);

    toDispense = 0;
      
 	
  }
 	
 	
}


