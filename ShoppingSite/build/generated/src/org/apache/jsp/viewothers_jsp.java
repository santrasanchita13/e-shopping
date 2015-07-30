package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewothers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Other Users</title>\n");
      out.write("    </head>\n");
      out.write("   <body style=\"background: url('back1.jpg') repeat; background-attachment:fixed;\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header2.jsp", out, false);
      out.write("\n");
      out.write("                ");

        if (session.getAttribute("uid") == null) {
response.sendRedirect("login.jsp");
        } 
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h2>Other Users</h2>\n");
      out.write("        <table style=\"font-size:15pt;\">\n");
      out.write("        ");

        try {
        String a = (String) session.getAttribute("uid");
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        PreparedStatement st;
        st = con.prepareStatement("select * from users where usid<>?");
        st.setString(1, a);
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
               
      out.write("\n");
      out.write("            \n");
      out.write("            <tr><th>Name:</th><td>");
      out.print(rs.getString(3));
      out.write("</td></tr>\n");
      out.write("            <tr><th>Phone:</th><td>");
      out.print(rs.getString(4));
      out.write(" </td></tr>\n");
      out.write("            <tr><th>Email Id:</th><td>");
      out.print(rs.getString(5));
      out.write(" </td></tr>\n");
      out.write("            <tr><th>Address:</th><td>");
      out.print(rs.getString(6));
      out.write(" </td></tr>\n");
      out.write("            <tr><td><br></td></tr>\n");
      out.write("               <tr><td><br></td></tr>\n");
      out.write("               <tr><td><br></td></tr>\n");
      out.write("            ");

                       }
        rs.close(); con.close(); 
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <br><br><br><br><br><br><br><br><br>\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("               ");

            } catch(Exception e) {System.out.println(e); }
            finally {            
            out.close();
        }
            
        
      out.write("\n");
      out.write("           \n");
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
