/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
 ***/
package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import nicebank.Account;
import nicebank.AtmServer;
import nicebank.CashSlot;
import org.springframework.beans.factory.annotation.Autowired;

public class ServerHooks {
    public static final int PORT = 8887;

    private AtmServer server;

    @Autowired
    private CashSlot cashSlot;

    @Autowired
    private Account account;

    // start atmserver and pass cashslot and account
    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT, cashSlot, account);
        server.start();
    }

    @After
    public void stopServer() throws Exception {
        server.stop();
    }
}