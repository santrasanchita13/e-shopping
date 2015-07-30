<%-- 
    Document   : contactus
    Created on : Aug 7, 2013, 1:29:28 PM
    Author     : Bonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
        <style>
p.margin
{
margin-right:250px;
margin-left:250px;
}
</style>
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
        <p class="margin">  <font style="Calibri" size="6"><u><b>Contact Us</b></u></font>
 <br><br>
 
Have a question? We have 24x7 customer service.
Before you contact us, skim through our Help section for quicker answers.

<div id="call" style="height:250px;width:250px;float:left;margin-left: 200px;margin-right:200px;">
   <img src="ph.png" width="25" height="25"><font size="5"> <b>Call</b></font><br>
Pick up the phone and call us on 1800 208 9888 or (091) 4540000.<br>
 We're available 24 hours a day, 7 days a week.<br>
</div>
        <div id="mail" style="height:250px;width:250px;float:right;margin-left: 200px;margin-right:200px;">
        <img src="mail.png" width="20" height="15"><b><font size="5">  Mail us <br></font></b>
        eBazaar Internet Private Limited,<br>
Manbach WorldCenter Park,<br>
#18 & 13, 23th Floor,<br>
Dollar Colony,Devasandra,<br>
Bangalore - 560061,<br>
Karnataka, India.<br>
</div>
   <div style="clear:both;">     
       <hr width="950"></div>
       <p class="margin"><b>For Trade/Business Related Enquiries:</b><br>
           </p>
           
           <div id="seller" style="height:250px;width:250px;float:left;margin-left: 200px;margin-right:200px;">
    <b>Seller/Distributor<br></b>
Email: <i>jintu123@gmail.com<br></i>
<br>
<br>
<b>Publisher/Author<br></b>
Email: <i>santra.sanchita13@gmail.com<br></i>
<br>
<br>
<b>For Sales Queries<br></b>
Email: <i>poulamig4@gmail.com</i></div>
<div id="buss" style="height:250px;width:250px;float:right;margin-left: 200px;margin-right:200px;">
  <b>  For Business Queries<br></b>
Email: <i>divyashekhar1993@yahoo.co.in</i><br>
<br><br>
<b>Affiliate Related Queries<br></b>
Email:<i> archanakumari959@gmail.com</i></div>

        <jsp:include page="footer.html" />
    </body>
</html>
