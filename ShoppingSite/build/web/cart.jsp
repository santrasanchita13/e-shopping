<%-- 
    Document   : viewothers
    Created on : Aug 7, 2013, 12:20:47 PM
    Author     : Bonny
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.Date"%>
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
        <h2>My Cart</h2>
        <%
String b = request.getParameter("b");
if(b!=null) {

%>
<div><b>Your Products have been booked</b></div>
<% }
%>
        <%
        try {
        String a = (String) session.getAttribute("uid");
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        PreparedStatement st;
        st = con.prepareStatement("select * from cart");
        
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
               %>
        <form action="book" name="f" method="post">
        <table style="font-size:15pt;">
        
            
            <td><input type="hidden" name="t2" value="<%=rs.getString(7)%>"></td></tr>
               
                <tr><th>Product Id:</th><td><input type="text" name="t3" value="<%=rs.getString(1)%>"></td></tr>
                
                <tr><th>Quantity:</th><td><input type="text" name="t4" value="<%=rs.getString(4)%>"></td></tr>
                               <%Date d = new Date();%>
                <tr><th>Date Of Booking:</th><td><input type="text" name="t5" value="<%=d%>"></td></tr>
                
                <td><input type="hidden" name="t6" value="Delivered"></td></tr>
            
           
               
                 
        <tr><td align="center" colspan="2"><input type="submit" value="Buy Products" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100pt;height:20pt"></td>
                    <tr><td><br></td></tr>
               <tr><td><br></td></tr>
               <tr><td><br></td></tr>
                </table>
        </form>
                <%
                 
                       }
        
        rs.close(); con.close(); %>
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
