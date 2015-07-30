package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About Us</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: url('silk3.jpg') repeat; background-attachment:fixed;\">\n");
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
      out.write("        <h1><font style=\"Calibri\" size=\"5\">About Us</font></h1>\n");
      out.write("           <br><br>   <p><font style=\"Calibri\" size=\"4\">Hello!</font></p>\n");
      out.write("\n");
      out.write("         <p><font style=\"Calibri\" size=\"4\">It's nice of you to take the time to get to know us better. Here are some things about us that we thought\n");
      out.write("                you might like to know.</font></p>\n");
      out.write("\n");
      out.write("            <p><font style=\"Calibri\" size=\"4\"><b>eBazaar</b> went alive in 2013 with the objective of making things easily available to anyone who had internet\n");
      out.write("                access. Today, we're present across various categories including movies, music, games, mobiles, cameras,\n");
      out.write("                computers, healthcare and personal products, home appliances and electronics, stationery, perfumes,\n");
      out.write("                toys, apparels, shoes – and still counting!</font></p>\n");
      out.write("\n");
      out.write("            <p><font style=\"Calibri\" size=\"4\">Be it our path-breaking services like Cash on Delivery, a 30-day replacement policy, EMI options, free\n");
      out.write("                shipping - and of course the great prices that we offer, everything we do revolves around our obsession\n");
      out.write("                with providing our customers a memorable online shopping experience. Then there's our dedicated Flipkart\n");
      out.write("                delivery partners who work round the clock to personally make sure the packages reach on time.</font></p>\n");
      out.write("\n");
      out.write("            <p><font style=\"Calibri\" size=\"4\">So it's no surprise that we're a favourite online shopping destination.</font></p>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
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
