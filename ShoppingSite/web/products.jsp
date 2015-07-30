<%@page import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
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
        <h2>Our Products</h2>
        <%
String a = request.getParameter("a");
if(a!=null) {

%>
<div><b>Product Added to Cart</b></div>
<% }
%>
        <%
        try {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        PreparedStatement st;
        st = con.prepareStatement("select * from products");
        
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
               %>
        <form action="<%  if (session.getAttribute("uid") == null) {    %>login.jsp<% }      else {    %>cart<% } %>" method="post" name="f">
        <table style="font-size:15pt;">
        
               <tr><td><input type="hidden" name="t1" value="<%=rs.getString(1)%>"></td></tr>
               <tr><td><input type="hidden" name="t2" value="<%=rs.getString(2)%>"></td></tr>
               <tr><td><input type="hidden" name="t3" value="<%=rs.getString(3)%>"></td></tr>
               <tr><td><input type="hidden" name="t4" value="1"></td></tr>
               <tr><td><input type="hidden" name="t5" value="<%=rs.getString(5)%>"></td></tr>
               <tr><td><input type="hidden" name="t6" value="<%=rs.getString(6)%>"></td></tr>
               <tr><td><input type="hidden" name="t7" value="<%=session.getAttribute("uid")%>"></td></tr>
            <tr align="center"><td colspan="2"><img width="100" height="100" src="<%=rs.getString(5)%>" alt="Image"></td></tr>
            <tr><th>Product Id:</th><td><%=rs.getString(1)%></td></tr>
            <tr><th>Product Name:</th><td><%=rs.getString(2)%> </td></tr>
            <tr><th>Description:</th><td><%=rs.getString(3)%> </td></tr>
            <tr><th>Price(one item):</th><td><%=rs.getString(6)%> </td></tr>
            <tr><th>Quantity:</th><td><%=rs.getString(4)%> </td></tr>
            <tr align="center"><td colspan="2"><input type="submit" value="Add to Cart" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:50%;height:20pt"></td></tr>
                    
            <tr><td><br></td></tr>
               <tr><td><br></td></tr>
               <tr><td><br></td></tr>
            
                </table>
        </form>
            <%
                       }
        rs.close(); con.close(); %>
                <br><br><br>
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
