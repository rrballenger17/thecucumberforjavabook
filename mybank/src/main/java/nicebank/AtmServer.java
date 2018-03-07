package nicebank;

import org.javalite.activejdbc.Base;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class AtmServer
{
    private final Server server;

    public AtmServer(int port, CashSlot cashSlot, Account account) {

        // new jetty server
        server = new Server(port);

        // servletContextHandler
        ServletContextHandler context =
                new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        // servlets - withdraw servlet and atm servlet
        context.addServlet(new ServletHolder(
                new WithdrawalServlet(cashSlot, account)),"/withdraw");
        context.addServlet(new ServletHolder(new AtmServlet()),"/");
    }

    public void start() throws Exception {
        server.start();
        System.out.println("Listening on " + server.getURI());
    }

    public void stop() throws Exception {
        server.stop();
        System.out.println("Server shutdown");
    }

    public static void main(String[] args) throws Exception {
        Base.open(
                "com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost/bank",
                "teller", "password");
        new AtmServer(9988, new CashSlot(), new Account()).start();
    }
}