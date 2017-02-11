
package controllers;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by volkan on 2/11/17.
 */


@WebServlet(name = "hello", urlPatterns = "/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rew, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hey!");
    }
}