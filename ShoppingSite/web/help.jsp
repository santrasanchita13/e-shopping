<%-- 
    Document   : help
    Created on : Aug 7, 2013, 1:31:37 PM
    Author     : Bonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Help</title>
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
        <p class="margin"><u><font size="5"><b>FAQ</b></font></u></p>
<p class="margin"><b><i>1. I don't remember my password. Help!</i></b>
<br>Don't worry. Here's what you need to do:<br>
<br>

All you need to Do is<br>
Click the Forgot your password link available on the bottom right of the login window.<br>
Enter your e-mail ID in the displayed field.<br>
We will ask you a security question,all you got is to answer it.<br>
You can reset your password instantly by clicking the link.<br></p>
 <br>
 <br>
<p class="margin"><b><i> 2. I am concerned about the privacy of my personal information I have shared with eBazaar.</i></b>
<br>
 
We understand that you value your privacy, and we respect it.<br>
eBazaar is committed to maintaining complete confidentiality and privacy of the data that you share with us.<br>
You may go through our privacy policy.<br></p>
<br>
<br>
<p class="margin"><b><i>3. Do your products come with guarantee/warrantee details?</i></b>
<br>
eBazaar guarantees 100% customer satisfaction, security, quality, support and value for money. All products sold on eBazaar are original and covered under fixed period manufacturer warranty for hardware or software issues, wherever applicable. Please read the product page carefully for more details.<br>
Visit the eBazaar Guarantee page to know more about this.</p>
<br>
<br>
<br>
<p class="margin"><b><i>4. I did not get an invoice with my product bought from eBazaar. What should I do?</i></b><br>
All eBazaar products are delivered along with an invoice. In case an invoice is not given to you along with your delivered product, please fill in our Contact Us form with your transaction details and we will look into it immediately.</p><br>
<br><br>

<p class="margin"><b><i>5. How do I know my purchase is complete?</i></b><br>
You will see a confirmation message on the screen along with your order number.<br>
If you have bought products, you will also receive your eBazaar reciept after your purchase.</p>
        <br><br>
        <br>
        
<p class="margin"><b><i>6. Which cities are these deals available in?</i></b><br>
eBazaar offers products in over 1400 cities all over India. Our aim is to reach and serve maximum customers in every corner of the country.    
</p><br>
<br>
<br>
<p class="margin"><b><i>7. What about refund after cancellation?</i></b><br>
You don’t have to worry as your payment is protected under Trustpay. We take anywhere from 7-15 working days to complete your refund request. The refund amount will be credited in the same account as you had made the payment from.
</p><br>
<br>
<br>
<p class="margin"><b><i>8. I want to ship something abroad. Can I do that?</i></b><br>
We don't deliver products internationally right. You can, however, place orders in India from anywhere in the world.
<br>
<br>
        <jsp:include page="footer.html" />
    </body>
</html>
