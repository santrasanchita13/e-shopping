package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Feedback</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: url('silk3.jpg') repeat; background-attachment:fixed;\">\n");
      out.write("    <center>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header2.jsp", out, false);
      out.write("\n");
      out.write("                ");

        if (session.getAttribute("uid") == null) {
response.sendRedirect("login.jsp");
        } 
      out.write("\n");
      out.write("        <h1>Feedback Form</h1>\n");
      out.write("        \n");
      out.write("        <form name=\"f\" action=\"feedback\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print((String) session.getAttribute("uid"));
      out.write("\" name=\"t1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Title:</th><td><input type=\"text\" name=\"t2\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Message:</th><td><textarea name=\"t3\" rows=\"5\" cols=\"20\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td align=\"center\"><input type=\"submit\" value=\"Submit\" style=\"background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt\"></td>\n");
      out.write("                    <td align=\"center\"><input type=\"reset\" style=\"background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:100%;height:20pt\"></td></tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"viewfeed.jsp\"><button type=\"button\" style=\"background-image:url('buttons.png');border:0pt;box-shadow: 4pt 2pt 5pt #888888;width:250pt;height:20pt\">View Feedback from Users</button></a>\n");
      out.write("                <br>\n");
      out.write("                <br><br><br><br><br><br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
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
