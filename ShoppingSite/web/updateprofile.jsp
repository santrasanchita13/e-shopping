<%-- 
    Document   : updateprofile
    Created on : Aug 7, 2013, 12:41:53 PM
    Author     : Bonny
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <script>
        function fun() {

            if(document.f.t2.value.length<6) {
                alert("Password must be at least 6 units long");
                return false;
            }
            if(document.f.t2.value != document.f.t21.value) {
                alert("Confirmed password does not match Password");
                return false;
            }
            if(document.f.t3.value.length<1) {
                alert("Name must be provided");
                return false;
            }
        }
            </script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update My Profile</title>
    </head>
    
    <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
        <jsp:include page="header2.jsp" />
                <%
        if (session.getAttribute("uid") == null) {
response.sendRedirect("login.jsp");
        } %>
    <center>
        <h2>My profile</h2>
        <form action="updateprofile" name="f" method="post" onsubmit="return fun()">
        <table style="font-size:15pt;">
        <%
        try {
        String a = (String) session.getAttribute("uid");
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        PreparedStatement st;
        st = con.prepareStatement("select * from users where usid = ?");
        st.setString(1, a);
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
               %>
               
            
                <tr><th colspan="2" align="center"><font size="6">Update My Profile</font></th></tr>
                <tr><th>UserId:</th><td><input type="hidden" name="t1" value="<%=rs.getString(1)%>"><%=rs.getString(1)%></td></tr>
                
                <tr><th>Password:</th><td><input type="password" name="t2" value="<%=rs.getString(2)%>"></td></tr>
                <tr><th>Confirm Password:</th><td><input type="password" name="t21"></td></tr>
                
                <tr><th>Name:</th><td><input type="text" name="t3" value="<%=rs.getString(3)%>"></td></tr>
                
                <tr><th>Phone no:</th><td><input type="text" name="t4" value="<%=rs.getString(4)%>"></td></tr>
                               
                <tr><th>Email id:</th><td><input type="text" name="t5" value="<%=rs.getString(5)%>"></td></tr>
                
                 <tr><th>Address:</th><td><textarea name="t6" rows="5" cols="20"><%=rs.getString(6)%></textarea></td></tr>
                 
                 <tr><th>Security Question:(type your question)</th><td><textarea name="t7" rows="2" cols="20"><%=rs.getString(7)%></textarea></td></tr>
                                 
                 <tr><th>Answer to security question:</th><td><input type="text" name="t8" value="<%=rs.getString(8)%>"></td></tr>
                
                <tr><td align="center"><input type="submit" value="Submit" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td>
                    <td align="center"><input type="reset" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td></tr>
                
            
            
            <%
                       }
        rs.close(); con.close(); %>
                </table>
               </form>
                
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
