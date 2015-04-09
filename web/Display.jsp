<%-- 
    Document   : Display
    Created on : Jun 30, 2014, 12:28:29 PM
    Author     : a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			if(con==null)
				out.println("Connection not created");
			else
				out.println("Connection created");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("SELECT * FROM STUDENT");
ResultSetMetaData rsm=rs.getMetaData();
int col=rsm.getColumnCount();
        %>
        <table border=9>
            <%
            for(int i=1;i<=col;i++)
              {%>
            <th><%=rsm.getColumnName(i)%></th>  
            <%}
        while(rs.next()) 
    {%>
    <tr>
    <%for(int i=1;i<=col;i++)
        {
    %>
    <td><%=rs.getString(i)%></td>
            <%} %>
        </tr>
    <%}
%>
        </table>
        
    </body>
</html>
