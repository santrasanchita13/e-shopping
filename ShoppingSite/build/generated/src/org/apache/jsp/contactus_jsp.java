package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contact Us</title>\n");
      out.write("        <style>\n");
      out.write("p.margin\n");
      out.write("{\n");
      out.write("margin-right:250px;\n");
      out.write("margin-left:250px;\n");
      out.write("}\n");
      out.write("</style>\n");
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
      out.write("        <p class=\"margin\">  <font style=\"Calibri\" size=\"6\"><u><b>Contact Us</b></u></font>\n");
      out.write(" <br><br>\n");
      out.write(" \n");
      out.write("Have a question? We have 24x7 customer service.\n");
      out.write("Before you contact us, skim through our Help section for quicker answers.\n");
      out.write("\n");
      out.write("<div id=\"call\" style=\"height:250px;width:250px;float:left;margin-left: 200px;margin-right:200px;\">\n");
      out.write("   <img src=\"ph.png\" width=\"25\" height=\"25\"><font size=\"5\"> <b>Call</b></font><br>\n");
      out.write("Pick up the phone and call us on 1800 208 9888 or (091) 4540000.<br>\n");
      out.write(" We're available 24 hours a day, 7 days a week.<br>\n");
      out.write("</div>\n");
      out.write("        <div id=\"mail\" style=\"height:250px;width:250px;float:right;margin-left: 200px;margin-right:200px;\">\n");
      out.write("        <img src=\"mail.png\" width=\"20\" height=\"15\"><b><font size=\"5\">  Mail us <br></font></b>\n");
      out.write("        eBazaar Internet Private Limited,<br>\n");
      out.write("Manbach WorldCenter Park,<br>\n");
      out.write("#18 & 13, 23th Floor,<br>\n");
      out.write("Dollar Colony,Devasandra,<br>\n");
      out.write("Bangalore - 560061,<br>\n");
      out.write("Karnataka, India.<br>\n");
      out.write("</div>\n");
      out.write("   <div style=\"clear:both;\">     \n");
      out.write("       <hr width=\"950\"></div>\n");
      out.write("       <p class=\"margin\"><b>For Trade/Business Related Enquiries:</b><br>\n");
      out.write("           </p>\n");
      out.write("           \n");
      out.write("           <div id=\"seller\" style=\"height:250px;width:250px;float:left;margin-left: 200px;margin-right:200px;\">\n");
      out.write("    <b>Seller/Distributor<br></b>\n");
      out.write("Email: <i>jintu123@gmail.com<br></i>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<b>Publisher/Author<br></b>\n");
      out.write("Email: <i>santra.sanchita13@gmail.com<br></i>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<b>For Sales Queries<br></b>\n");
      out.write("Email: <i>poulamig4@gmail.com</i></div>\n");
      out.write("<div id=\"buss\" style=\"height:250px;width:250px;float:right;margin-left: 200px;margin-right:200px;\">\n");
      out.write("  <b>  For Business Queries<br></b>\n");
      out.write("Email: <i>divyashekhar1993@yahoo.co.in</i><br>\n");
      out.write("<br><br>\n");
      out.write("<b>Affiliate Related Queries<br></b>\n");
      out.write("Email:<i> archanakumari959@gmail.com</i></div>\n");
      out.write("\n");
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
