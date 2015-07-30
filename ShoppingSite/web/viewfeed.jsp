<%-- 
    Document   : viewfeed
    Created on : Aug 15, 2013, 9:16:18 PM
    Author     : Bonny
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedbacks</title>
    </head>
    <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
        <%
        if (session.getAttribute("uid") == null) {
        %>
        <jsp:include page="header.html" />
        <% }
               else {
        %>
        <jsp:include page="header2.jsp" />
        <% } %>
    <center>
        <h2>Feedback from Users</h2>
        <table style="font-size:15pt;">
        <%
        try {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        PreparedStatement st;
        st = con.prepareStatement("select * from feedback");
        
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
               %>
            
            <tr><th>User Id:</th><td><%=rs.getString(1)%></td></tr>
            <tr><th>Title:</th><td><%=rs.getString(2)%> </td></tr>
            <tr><th>Message:</th><td><%=rs.getString(3)%> </td></tr>
            
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
