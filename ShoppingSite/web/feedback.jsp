<%-- 
    Document   : feedback
    Created on : Aug 7, 2013, 12:21:28 PM
    Author     : Bonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
    </head>
    <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
    <center>
        <jsp:include page="header2.jsp" />
                <%
        if (session.getAttribute("uid") == null) {
response.sendRedirect("login.jsp");
        } %>
        <h2>Feedback Form</h2>
        
        <form name="f" action="feedback" method="post">
            <table>
                <tr>
                    <td><input type="hidden" value="<%=(String) session.getAttribute("uid")%>" name="t1"></td>
                </tr>
                <tr>
                    <th>Title:</th><td><input type="text" name="t2"></td>
                </tr>
                <tr>
                    <th>Message:</th><td><textarea name="t3" rows="5" cols="20"></textarea></td>
                </tr>
                <tr><td align="center"><input type="submit" value="Submit" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td>
                    <td align="center"><input type="reset" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td></tr>
                
            </table>
                
        </form>
                <br>
                <a href="viewfeed.jsp"><button type="button" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:250pt;height:20pt">View Feedback from Users</button></a>
                <br>
                <br><br><br><br><br><br><br><br>
        <jsp:include page="footer.html" />
    </center>
    </body>
</html>
