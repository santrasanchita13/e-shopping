<%-- 
    Document   : forgot
    Created on : Aug 15, 2013, 4:46:54 PM
    Author     : Bonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
    </head>
   <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
    <center><jsp:include page="header.html" />
        <h1>Forgot Password</h1>
        <form action="resetp.jsp" method="post" name="f" >
<table>
    
    <tr>
        <th>Enter UserId:</th>
        <td><input type = "text" name="t1"></td>
    </tr>

<tr>
<td><input type = "submit" value="OK" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td>
</tr>
<%
String d = request.getParameter("d");
if(d!=null) {
%>
<tr><td colspan="2"><b>Security Answer does not match</b></td></tr>    
      <% }%>
</table>
</form>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <jsp:include page="footer.html" />
</center>
    </body>
</html>
