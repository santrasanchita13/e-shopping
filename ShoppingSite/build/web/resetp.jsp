<%-- 
    Document   : resetp
    Created on : Aug 15, 2013, 6:35:25 PM
    Author     : Bonny
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
           
        }
            </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
    </head>
    <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
    <center><jsp:include page="header.html" />
        <h1>Reset Password</h1>
        <form action="resetp" method="post" name="f" onsubmit="return fun()">
            <table>  
        <%
        try {
        String t1 = request.getParameter("t1");
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        PreparedStatement st1;
        st1 = con.prepareStatement("select usid from users where usid = ?");
        st1.setString(1, t1);
        ResultSet rs1 = st1.executeQuery();
        if (!rs1.next()) {
            %>
           <tr><td><font size="10">UserId not Found</font></td></tr>
           <%
        }
        rs1.close();
        
        PreparedStatement st;
        st = con.prepareStatement("select usid, securityq from users where usid = ?");
        st.setString(1, t1);
        ResultSet rs = st.executeQuery();
        while(rs.next()) { 
               %>               
    <tr><th>Security Question:</th><td><%=rs.getString(2)%></td></tr>
<tr>
        <th>Enter Answer:</th>
        <td><input type="text" name="t3" value="Enter answer"></td>
    </tr>
    <tr><td><input type="hidden" name="t1" value="<%=rs.getString(1)%>"></td></tr>
<tr>
        <th>Enter New Password:</th>
        <td><input type = "password" name="t2"></td>
    </tr>
    <tr>
        <th>Confirm Password:</th>
        <td><input type = "password" name="t21"></td>
    </tr>
<tr>
<td><input type = "submit" value="OK" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td>
</tr>

          
        <%        
              }
        rs.close(); con.close(); 
        %>

        
        </table>
</form>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
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
