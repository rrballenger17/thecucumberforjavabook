 	
package step_definitions;

import static org.junit.Assert.*;
	
import implementation.Checkout;
 	
import cucumber.api.java.en.*;
 	
import cucumber.api.PendingException;

import java.util.Map;
import java.util.HashMap;
 	
 	
public class CheckoutSteps {

	Map<String, Integer> items = new HashMap<String, Integer>(); 	

    Checkout checkout;	

 	
	@Given("^the price of a \"(.*?)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
	    items.put(name, price);
	}


	@When("^I checkout (\\d+) \"(.*?)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
    	checkout = new Checkout();
    	checkout.add(itemCount, items.get(itemName));
	}

 	
	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable {
    	assertEquals(total, checkout.total());
	}






 	
}
