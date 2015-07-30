<%-- 
    Document   : logout
    Created on : Aug 7, 2013, 12:22:28 PM
    Author     : Bonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
    <center>
        <jsp:include page="header.html" />
        <%
        session.invalidate();
        %>
        <h2>You have been logged out</h2>
        <a href="login.jsp">Login</a>
        <br><br><br><br>
        <jsp:include page="footer.html" />
        </center>
    </body>
</html>
