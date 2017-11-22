package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminCentral_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <title>Administracion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div style=\"background-image: url(img/banner.jpg); background-position: right; background-size: 100%; \" class=\"jumbotron text-center\">\n");
      out.write("              <h4 class=\"display-3\">Inmobiliaria <br> Adeudadito mas Feliz</h4>\n");
      out.write("            <h5 class=\"lead\">El lugar donde su sueño se hace <h5 style=\"color: red\">Realidad</h5></h5>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"./ServletPrincipal\" name=\"fom1\" method=\"POST\">\n");
      out.write("            <table class=\"table text-center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td> <img src=\"img/nuevoEdificio.jpg\" width=\"120\" height=\"120\"> </td>\n");
      out.write("                    <td><img src=\"img/BuscarEdificio.jpg\" width=\"120\" height=\"120\"></td>\n");
      out.write("                    <td><img src=\"img/arriendo.jpg\" width=\"120\" height=\"120\"></td>\n");
      out.write("                    <td><img src=\"img/user.jpg\" width=\"120\" height=\"120\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" name=\"btn_nEdificio\"  value=\"Crear nuevo Edificio\" class=\"btn btn-info\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" name=\"btn_buscarEdi\"  value=\"Buscar Edificio\" class=\"btn btn-success\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" name=\"btn_Ingresa_Departamento\"  value=\"Ingresar Departamento\" class=\"btn btn-danger\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" name=\"btn_usuarios\"  value=\"Usuarios\" class=\"btn btn-warning\">\n");
      out.write("                    </td>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
