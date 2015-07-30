<%-- 
    Document   : aboutus
    Created on : Aug 7, 2013, 1:31:06 PM
    Author     : Bonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
    </head>
    <body style="background: url('back1.jpg') repeat; background-attachment:fixed;">
    <center>
                <%
        if (session.getAttribute("uid") == null) {
        %>
        <jsp:include page="header.html" />
        <% }
               else {
        %>
        <jsp:include page="header2.jsp" />
        <% } %>
        <h2><font style="Calibri" size="10">About Us</font></h2>
           <br><br>   <p><font style="Calibri" size="6">Hello!</font></p>

         <p><font style="Calibri" size="5">It's nice of you to take the time to get to know us better. Here are some things about us that we thought
                you might like to know.</font></p>

            <p><font style="Calibri" size="5"><b>eBazaar</b> went alive in 2013 with the objective of making things easily available to anyone who had internet
                access. Today, we're present across various categories including movies, music, games, mobiles, cameras,
                computers, healthcare and personal products, home appliances and electronics, stationery, perfumes,
                toys, apparels, shoes – and still counting!</font></p>

            <p><font style="Calibri" size="5" >Be it our path-breaking services like Cash on Delivery, a 30-day replacement policy, EMI options, free
                shipping - and of course the great prices that we offer, everything we do revolves around our obsession
                with providing our customers a memorable online shopping experience. Then there's our dedicated Flipkart
                delivery partners who work round the clock to personally make sure the packages reach on time.</font></p>

            <p><font style="Calibri" size="5" >So it's no surprise that we're a favourite online shopping destination.</font></p>
        <jsp:include page="footer.html" />
    </center>
    </body>
</html>
