<%-- 
    Document   : viewothers
    Created on : Aug 7, 2013, 12:20:47 PM
    Author     : Bonny
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Other Users</title>
    </head>
   <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
        <jsp:include page="header2.jsp" />
                <%
        if (session.getAttribute("uid") == null) {
response.sendRedirect("login.jsp");
        } %>
    <center>
        <h2>Other Users</h2>
        <table style="font-size:15pt;">
        <%
        try {
        String a = (String) session.getAttribute("uid");
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        PreparedStatement st;
        st = con.prepareStatement("select * from users where usid<>?");
        st.setString(1, a);
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
               %>
            
            <tr><th>Name:</th><td><%=rs.getString(3)%></td></tr>
            <tr><th>Phone:</th><td><%=rs.getString(4)%> </td></tr>
            <tr><th>Email Id:</th><td><%=rs.getString(5)%> </td></tr>
            <tr><th>Address:</th><td><%=rs.getString(6)%> </td></tr>
            <tr><td><br></td></tr>
               <tr><td><br></td></tr>
               <tr><td><br></td></tr>
            <%
                       }
        rs.close(); con.close(); %>
                </table>
                <br><br><br><br><br><br><br><br><br>
               <jsp:include page="footer.html" />
               <%
            } catch(Exception e) {System.out.println(e); }
            finally {            
            out.close();
        }
            
        %>
           
    </center>
    </body>
</html>
