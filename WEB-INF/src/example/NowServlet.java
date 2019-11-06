package example;

import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;



public class NowServlet extends HttpServlet{
    //@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html; charset=utf-8");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Time now</title></head>");
        out.println("<body>");
        out.println("Time now");
        out.println(new Date());
        out.println("</body></html>");

    }
}