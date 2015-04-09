/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author a
 */
public class LoginServlet extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //String uid=request.getParameter("t1");
        //String pass=request.getParameter("t2");
        RequestDispatcher rd=null;
        ServletContext sc=getServletContext();
        HttpSession hs=request.getSession(true);
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.10.200.5:1521:orcl1","lt1","lt1");
			if(con==null)
				out.println("Connection not created");
			else
				out.println("Connection created");
		
        /*if(uid.equals("abc")&&pass.equals("abc123"))
        {
            hs.setAttribute("user",uid);
            request.setAttribute("password",pass);
            rd=sc.getRequestDispatcher("/HelloServlet");
        }
        else
        {
            //out.println("<H1>Sorry, you are not allowed to login!</H1>");
            rd=request.getRequestDispatcher("login.html");
        }
        rd.forward(request, response);*/
        }
        catch(Exception e){}
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
