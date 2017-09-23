package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Language\" content=\"en-us\" />\n");
      out.write("\n");
      out.write("    <title>Simple Chat Application</title>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <form action=\"main.jsp\">\n");
      out.write("      <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\"\n");
      out.write("      style=\"border-collapse: collapse\" bordercolor=\"#111111\"\n");
      out.write("      width=\"33%\" id=\"AutoNumber1\">\n");
      out.write("        <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"100%\" colspan=\"2\" bgcolor=\"#0000FF\">\n");
      out.write("              <p align=\"center\">\n");
      out.write("                <b>\n");
      out.write("                  <font size=\"4\" color=\"#FFFFFF\">Chat Login</font>\n");
      out.write("                </b>\n");
      out.write("              </p>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"23%\">User ID</td>\n");
      out.write("\n");
      out.write("            <td width=\"77%\">\n");
      out.write("              <input type=\"text\" name=\"uid\" size=\"20\" />\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"100%\" colspan=\"2\">\n");
      out.write("              <p align=\"center\">\n");
      out.write("                <input type=\"submit\" value=\"Submit\"\n");
      out.write("                name=\"action\" />\n");
      out.write("\n");
      out.write("                <input type=\"reset\" value=\"Reset\" />\n");
      out.write("              </p>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("\n");
      out.write("      <p>&#160;</p>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <p>\n");
      out.write("      <i>Note: You may use any User ID you wish</i>\n");
      out.write("    </p>\n");
      out.write("  </body>\n");
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
