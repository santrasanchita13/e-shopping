package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script>\n");
      out.write("        function fun() {\n");
      out.write("            if(document.f.t1.value.length<1) {\n");
      out.write("                alert(\"UserId must be provided\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.f.t2.value.length<1) {\n");
      out.write("                alert(\"Password not given\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: url('back1.jpg') repeat; background-attachment:fixed;\">\n");
      out.write("    <center>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("<form action=\"login\" method=\"post\" name=\"f\" onsubmit=\"return fun()\">\n");
      out.write("<table>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <th>Enter UserId:</th>\n");
      out.write("        <td><input type = \"text\" name=\"t1\"></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <th>Enter Password:</th>\n");
      out.write("        <td><input type = \"password\" name=\"t2\"></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><input type = \"submit\" value=\"OK\" style=\"background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt\"></td>\n");
      out.write("<td><input type=\"reset\" value=\"Reset\" style=\"background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr><th><a href=\"forgot.jsp\">Forgot Password</a></th></tr>\n");

String c = request.getParameter("c");
if(c!=null) {


      out.write("\n");
      out.write("<tr><td colspan=\"2\"><b>Password Updated. Login to continue</b></td></tr>\n");
 }

      out.write('\n');
      out.write('\n');

String a = request.getParameter("a");
if(a!=null) {


      out.write("\n");
      out.write("<tr><td colspan=\"2\"><b>User Id and Password are mismatched</b></td></tr>\n");
 }

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("</center>\n");
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
