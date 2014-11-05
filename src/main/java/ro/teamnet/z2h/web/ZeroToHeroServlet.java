package ro.teamnet.z2h.web;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ZeroToHeroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write(handleRequest(req));
    }

    private String handleRequest(HttpServletRequest req) {
        String response = "Hello <b>"+req.getParameter("firstName")+" "+req.getParameter("lastName")+"</b>! Welcome to Zero To Hero!!!";
        return response;
    }
}
