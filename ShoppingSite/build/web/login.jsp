<html>
    <script>
        function fun() {
            if(document.f.t1.value.length<1) {
                alert("UserId must be provided");
                return false;
            }
            if(document.f.t2.value.length<1) {
                alert("Password not given");
                return false;
            }
        }
            </script>
            
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
    <center><jsp:include page="header.html" />
<form action="login" method="post" name="f" onsubmit="return fun()">
<table>
    
    <tr>
        <th>Enter UserId:</th>
        <td><input type = "text" name="t1"></td>
    </tr>

    <tr>
        <th>Enter Password:</th>
        <td><input type = "password" name="t2"></td>
    </tr>

<tr>
<td><input type = "submit" value="OK" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td>
<td><input type="reset" value="Reset" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td>
</tr>

<tr><th><a href="forgot.jsp">Forgot Password</a></th></tr>
<%
String c = request.getParameter("c");
if(c!=null) {

%>
<tr><td colspan="2"><b>Password Updated. Login to continue</b></td></tr>
<% }
%>

<%
String a = request.getParameter("a");
if(a!=null) {

%>
<tr><td colspan="2"><b>User Id and Password are mismatched</b></td></tr>
<% }
%>

</table>
</form>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <jsp:include page="footer.html" />
</center>
    </body>
</html>
