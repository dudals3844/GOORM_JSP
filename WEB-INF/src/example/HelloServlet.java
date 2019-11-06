package example;

import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{
    //@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Hello</title></head>");
        out.println("<body>");
        out.println("Hello choi");
        out.println(request.getParameter("name"));
        out.println("</body></html>");

    }
}