<center>
    <STYLE>
        h1 {font-size:300%;
        text-shadow: 5px 5px #000000;}
        a:link {color:#B40404;}    
        a:visited {color:#DF7401;} 
        a:hover {color:#01DF01;}   
        a:active {color:#2E2EFE;}
        </STYLE>
    
    <%
        String b = (String) session.getAttribute("uid");
        %>
        <h1><font face="Alepholon" color="#FF8000">e Bazaar</font>&nbsp;&nbsp;&nbsp;<img src="cart.png" width="50" height="35"></h1><h4 align="right">You are logged in as <%=b%></h4>
    <table width="100%">
        <tr align="center">
            <td>
                <a href="home.jsp">
                    <button type="button" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt">   Home   </button>
                </a>
            </td>
            <td>
                <a href="viewprofile.jsp">
                    <button type="button" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt">My Profile</button>
                </a>
            </td>
            <td>
                <a href="viewothers.jsp">
                    <button type="button" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt">Other Users</button>
                </a>
            </td>
            <td>
                <a href="products.jsp">
                    <button type="button" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt">  Products  </button>
                </a>
            </td>
            <td>
                <a href="cart.jsp">
                    <button type="button" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt">  My Cart  </button>
                </a>
            </td>
            <td>
                <a href="feedback.jsp">
                    <button type="button" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt">Give Feedback</button>
                </a>
            </td>
            <td>
                <a href="logout.jsp">
                    <button type="button" style="background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt">  Logout  </button>
                </a>
            </td>
        </tr>
    </table>
        <br>
        <br>
</center>