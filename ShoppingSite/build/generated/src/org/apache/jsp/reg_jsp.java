package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        function fun() {\n");
      out.write("            if(document.f.t1.value.length<1) {\n");
      out.write("                alert(\"UserId must be provided\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.f.t2.value.length<6) {\n");
      out.write("                alert(\"Password must be at least 6 units long\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.f.t3.value.length<1) {\n");
      out.write("                alert(\"Name must be provided\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.f.t7.value.length<1) {\n");
      out.write("                alert(\"Security question must be provided\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.f.t8.value.length<1) {\n");
      out.write("                alert(\"Security answer must be provided\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.f.t2.value != document.f.t21.value) {\n");
      out.write("                alert(\"Confirmed password does not match Password\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("            </script>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: url('back1.jpg') repeat; background-attachment:fixed;\">\n");
      out.write("    <center>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("        <form action=\"reg\" name=\"f\" method=\"post\" onsubmit=\"return fun()\">\n");
      out.write("            <table style=\"font-size:15pt\">\n");
      out.write("                <tr><th colspan=\"2\" align=\"center\"><font size=\"6\">User Registration</font></th></tr>\n");
      out.write("                <tr><th>UserId:</th>\n");
      out.write("                    <td><input type=\"text\" name=\"t1\"></td></tr>\n");
      out.write("                \n");
      out.write("                <tr><th>Password:</th><td><input type=\"password\" name=\"t2\"></td></tr>\n");
      out.write("                <tr><th>Confirm Password:</th><td><input type=\"password\" name=\"t21\"></td></tr>\n");
      out.write("                \n");
      out.write("                <tr><th>Name:</th><td><input type=\"text\" name=\"t3\"></td></tr>\n");
      out.write("                \n");
      out.write("                <tr><th>Phone no:</th><td><input type=\"text\" name=\"t4\"></td></tr>\n");
      out.write("                               \n");
      out.write("                <tr><th>Email id:</th><td><input type=\"text\" name=\"t5\"></td></tr>\n");
      out.write("                \n");
      out.write("                 <tr><th>Address:</th><td><textarea name=\"t6\" rows=\"5\" cols=\"20\"></textarea></td></tr>\n");
      out.write("                 \n");
      out.write("                 <tr><th>Security Question:(type your question)</th><td><textarea name=\"t7\" rows=\"2\" cols=\"20\"></textarea></td></tr>\n");
      out.write("                                 \n");
      out.write("                 <tr><th>Answer to security question:</th><td><input type=\"text\" name=\"t8\"></td></tr>\n");
      out.write("                <tr><td align=\"center\"><input type=\"submit\" value=\"Submit\" style=\"background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt\"></td>\n");
      out.write("                    <td align=\"center\"><input type=\"reset\" style=\"background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt\"></td></tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
