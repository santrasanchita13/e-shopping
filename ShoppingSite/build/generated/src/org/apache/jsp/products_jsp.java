package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Products</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: url('back1.jpg') repeat; background-attachment:fixed;\">\n");
      out.write("                ");

        if (session.getAttribute("uid") == null) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("        ");
 }
               else {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header2.jsp", out, false);
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h2>Our Products</h2>\n");
      out.write("        <form action=\"cart\" method=\"post\" name=\"f\">\n");
      out.write("        <table style=\"font-size:15pt;\">\n");
      out.write("        ");

        try {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        PreparedStatement st;
        st = con.prepareStatement("select * from products");
        
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
               
      out.write("\n");
      out.write("               <tr><td><input type=\"hidden\" name=\"t1\" value=\"");
      out.print(rs.getString(1));
      out.write("\"></td></tr>\n");
      out.write("               <tr><td><input type=\"hidden\" name=\"t2\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td></tr>\n");
      out.write("               <tr><td><input type=\"hidden\" name=\"t3\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td></tr>\n");
      out.write("               <tr><td><input type=\"hidden\" name=\"t4\" value=\"");
      out.print(rs.getString(4));
      out.write("\"></td></tr>\n");
      out.write("               <tr><td><input type=\"hidden\" name=\"t5\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td></tr>\n");
      out.write("               <tr><td><input type=\"hidden\" name=\"t6\" value=\"");
      out.print(rs.getString(6));
      out.write("\"></td></tr>\n");
      out.write("               <tr><td><input type=\"hidden\" name=\"t7\" value=\"");
      out.print(session.getAttribute("uid"));
      out.write("\"></td></tr>\n");
      out.write("            <tr align=\"center\"><td colspan=\"2\"><img width=\"100\" height=\"100\" src=\"");
      out.print(rs.getString(5));
      out.write("\" alt=\"Image\"></td></tr>\n");
      out.write("            <tr><th>Product Id:</th><td>");
      out.print(rs.getString(1));
      out.write("</td></tr>\n");
      out.write("            <tr><th>Product Name:</th><td>");
      out.print(rs.getString(2));
      out.write(" </td></tr>\n");
      out.write("            <tr><th>Description:</th><td>");
      out.print(rs.getString(3));
      out.write(" </td></tr>\n");
      out.write("            <tr><th>Price(one item):</th><td>");
      out.print(rs.getString(6));
      out.write(" </td></tr>\n");
      out.write("            <tr><th>Quantity:</th><td>");
      out.print(rs.getString(4));
      out.write(" </td></tr>\n");
      out.write("            <tr align=\"center\"><td colspan=\"2\"><input type=\"submit\" value=\"Add to Cart\" style=\"background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:50%;height:20pt\"></td></tr>\n");
      out.write("                    ");

String a = request.getParameter("a");
if(a!=null) {


      out.write("\n");
      out.write("<tr><td colspan=\"2\"><b>Product Added to Cart</b></td></tr>\n");
 }

      out.write("\n");
      out.write("            <tr><td><br></td></tr>\n");
      out.write("               <tr><td><br></td></tr>\n");
      out.write("               <tr><td><br></td></tr>\n");
      out.write("            ");

                       }
        rs.close(); con.close(); 
      out.write("\n");
      out.write("                </table>\n");
      out.write("        </form>\n");
      out.write("                <br><br><br>\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("               ");

            } catch(Exception e) {System.out.println(e); }
            finally {            
            out.close();
        }
            
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
