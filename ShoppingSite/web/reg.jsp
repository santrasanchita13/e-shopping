<html>
    
    <script>
        function fun() {
            if(document.f.t1.value.length<1) {
                alert("UserId must be provided");
                return false;
            }
            if(document.f.t2.value.length<6) {
                alert("Password must be at least 6 units long");
                return false;
            }
            if(document.f.t3.value.length<1) {
                alert("Name must be provided");
                return false;
            }
            if(document.f.t7.value.length<1) {
                alert("Security question must be provided");
                return false;
            }
            if(document.f.t8.value.length<1) {
                alert("Security answer must be provided");
                return false;
            }
            if(document.f.t2.value != document.f.t21.value) {
                alert("Confirmed password does not match Password");
                return false;
            }
        }
            </script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
    <center>
        <jsp:include page="header.html" />
        <form action="reg" name="f" method="post" onsubmit="return fun()">
            <table style="font-size:15pt">
                <tr><th colspan="2" align="center"><font size="6">User Registration</font></th></tr>
                <tr><th>UserId:</th>
                    <td><input type="text" name="t1"></td></tr>
                
                <tr><th>Password:</th><td><input type="password" name="t2"></td></tr>
                <tr><th>Confirm Password:</th><td><input type="password" name="t21"></td></tr>
                
                <tr><th>Name:</th><td><input type="text" name="t3"></td></tr>
                
                <tr><th>Phone no:</th><td><input type="text" name="t4"></td></tr>
                               
                <tr><th>Email id:</th><td><input type="text" name="t5"></td></tr>
                
                 <tr><th>Address:</th><td><textarea name="t6" rows="5" cols="20"></textarea></td></tr>
                 
                 <tr><th>Security Question:(type your question)</th><td><textarea name="t7" rows="2" cols="20"></textarea></td></tr>
                                 
                 <tr><th>Answer to security question:</th><td><input type="text" name="t8"></td></tr>
                <tr><td align="center"><input type="submit" value="Submit" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td>
                    <td align="center"><input type="reset" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt"></td></tr>
                
            </table>
        </form>
        <br><br><br><br><br><br><br><br><br><br><br><br>
        <jsp:include page="footer.html" />
    </center>
    </body>
</html>