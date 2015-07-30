package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("        <style>\n");
      out.write("            p.margin\n");
      out.write("{\n");
      out.write("margin-right:250px;\n");
      out.write("margin-left:250px;\n");
      out.write("}\n");
      out.write("             </style>\n");
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
      out.write("        \n");
      out.write("        <font size=\"5\" face=\"calibri\" color=\"#B40431\">\n");
      out.write("        \n");
      out.write("     <marquee> WELCOME TO THE INDIA'S MOST PEOPLE'S VOTED AND FASHIONABLE SITE..!!</marquee>\n");
      out.write("        </font>\n");
      out.write("        <br><br><br>\n");
      out.write("       <p class=\"margin\"> <font size=\"4\" face=\"calibri\" color=\"#FE2E64\">\n");
      out.write("        In This Site You Find The World's Most Fashionable Apparels,Perfumes and Fragnances,Foot wears,Jackets,Electronic Gadgets,Computers,Mobile Phones,Sports Accessories,Utensils,Books,Novels,Health and Wellness,\n");
      out.write("        Bags and Laggage,Jewellery,Watches and a lot lot more things..<br>\n");
      out.write("        <br>\n");
      out.write("        You get 100% guaranteed Quality Products from this Shopping site..with a 100% people satisfaction,over fast and swift delivery of Products.<br>\n");
      out.write("        Click Here to <a href=\"products.jsp\"><blink>Enter</blink></a>To our Product Section.</font>\n");
      out.write("        </p>\n");
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
