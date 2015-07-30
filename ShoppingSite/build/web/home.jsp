<%-- 
    Document   : home
    Created on : Aug 7, 2013, 12:13:04 PM
    Author     : Bonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
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
        
        <font size="5" face="calibri" color="#B40431">
        
     <marquee> WELCOME TO THE INDIA'S MOST PEOPLE'S VOTED AND FASHIONABLE SITE..!!</marquee>
        </font>
        <br><br><br>
       <p class="margin"> <font size="4" face="calibri" color="#FE2E64">
        In This Site You Find The World's Most Fashionable Apparels,Perfumes and Fragnances,Foot wears,Jackets,Electronic Gadgets,Computers,Mobile Phones,Sports Accessories,Utensils,Books,Novels,Health and Wellness,
        Bags and Laggage,Jewellery,Watches and a lot lot more things..<br>
        <br>
        You get 100% guaranteed Quality Products from this Shopping site..with a 100% people satisfaction,over fast and swift delivery of Products.<br>
        Click Here to <a href="products.jsp"><blink>Enter</blink></a>To our Product Section.</font>
        </p>
        <jsp:include page="footer.html" />
    </body>
</html>
