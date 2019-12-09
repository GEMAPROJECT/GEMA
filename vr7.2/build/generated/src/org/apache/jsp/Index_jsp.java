package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!----------------------------------------->\n");
      out.write("        <title>Inicio Sesión</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Login.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"sweetalert2.min.css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container h-100\">\n");
      out.write("        <div class=\"d-flex justify-content-center h-100\">\n");
      out.write("            <div class=\"user_card\">\n");
      out.write("                <div class=\"d-flex justify-content-center\">\n");
      out.write("                    <div class=\"brand_logo_container\">\n");
      out.write("                        <img src=\"IMG/Gema_logo.png\" class=\"brand_logo\" alt=\"Logo\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex justify-content-center form_container\">\n");
      out.write("                    <form method=\"post\" action=\"Usuario\">\n");
      out.write("                        <div class=\"input-group mb-3\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"text\" name=\"textUsuLogin\" class=\"form-control input_user\" placeholder=\"Usuario\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group mb-2\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"password\" name=\"textUsuPassword\" class=\"form-control input_pass\" placeholder=\"Contraseña\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-flex justify-content-center mt-3 login_container\">\n");
      out.write("                            <input   type=\"submit\" name=\"button\" class=\"btn login_btn\" value=\"Iniciar Sesión\">\n");
      out.write("                            <input type=\"hidden\" name=\"opcion\" value=\"3\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>      \n");
      out.write("     ");

        if (request.getAttribute("MensajeError") != null) {
    
      out.write("\n");
      out.write("    <link href=\"css/Alerts/AlertsLogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <div class=\"modal\" id=\"img1\">   \n");
      out.write("        <div class=\"imagen\">\n");
      out.write("            <div class=\"div-img\"> <img class=\"imagen2\" src=\"images/x.png\" width=\"100px\"/></div>           \n");
      out.write("                <div id=\"contenedor_text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                <br>\n");
      out.write("                <div id=\"contenedor_box\">\n");
      out.write("                    <form method=\"post\" action=\"Index.jsp\">  \n");
      out.write("                         <button class=\"btn12\" id=\"btnalert\" value=\"Enter\" >Ok</button>           \n");
      out.write("                     </form> \n");
      out.write("                </div>      \n");
      out.write("        </div>\n");
      out.write("    </div>             \n");
 }
      out.write("\n");
      out.write("  ");

                                    if (request.getAttribute("MensajeExito") != null) {
                                
      out.write("\n");
      out.write("                                <link href=\"css/Alerts/AlertsExito.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("                                <div class=\"modal\" id=\"img1\">   \n");
      out.write("                                    <div class=\"imagen\">\n");
      out.write("                                        <div class=\"div-img\"> <img class=\"imagen2\" src=\"images/chulo.png\" width=\"150px\"/></div>           \n");
      out.write("                                        <div id=\"contenedor_text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                        <br>\n");
      out.write("                                        <div id=\"contenedor_box\">\n");
      out.write("                                            <form method=\"post\" action=\"Index.jsp\">  \n");
      out.write("                                                <button class=\"btn12\" id=\"btnalert\" value=\"Enter\" >Ok</button>           \n");
      out.write("                                            </form> \n");
      out.write("                                        </div>      \n");
      out.write("                                    </div>\n");
      out.write("                                </div>             \n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
