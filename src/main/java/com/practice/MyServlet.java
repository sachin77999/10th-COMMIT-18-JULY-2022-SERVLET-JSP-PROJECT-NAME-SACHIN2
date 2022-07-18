
package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        
        System.out.println("this is get method........");
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1> this is get method of my servlet</h1>");
        out.println(new Date().toString());
    }
    
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
    {
         
        
    }    
    
}
