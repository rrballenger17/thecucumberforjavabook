package nicebank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AtmServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(
                "<html><head><title>ATM</title>" +
                        "<script src=\"js/jquery.1.9.1.min.js\"></script>" +
                        "<script src=\"js/notifications.js\"></script>" +
                        "</head><body>" +
                        "<form id=\"withdrawalForm\" " +
                        "action=\"/withdraw\" method=\"post\">" +
                        "<label for=\"amount\">Amount</label>" +
                        "<input type=\"text\" id=\"amount\" " +
                        "name=\"amount\" autocomplete=\"off\">" +
                        "<button type=\"submit\" id=\"withdraw\">Withdraw</button>" +
                        "<ol class=\"notifications\">" +
                        "</ol></form></body>" +
                        "</html>");
    }
}