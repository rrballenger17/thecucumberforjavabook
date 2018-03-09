/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
 ***/
package hooks;

import cucumber.api.java.Before;

import nicebank.Account;
import nicebank.TransactionQueue;
import org.javalite.activejdbc.Base;


public class ResetHooks {

    // clear all the transactions
    @Before(order = 1)
    public void reset() {

        if (!Base.hasConnection()){

            // open(String driver, String url, String user, String password)
            Base.open(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost/bank",
                    "teller", "password");
        }

        // clear the database
        Account.deleteAll();

        TransactionQueue.clear();
    }
}



