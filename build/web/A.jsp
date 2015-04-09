<%-- 
    Document   : A
    Created on : Jun 30, 2014, 12:10:49 PM
    Author     : a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Hi Galaxy!</h2>
        <%--<jsp:forward page="B.jsp"></jsp:forward>--%>
        <jsp:include page="B.jsp"></jsp:include>
        <h2>Hi Universe!</h2>
    </body>
</html>
