package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modeloVO.PrestamosVO;
import ModeloDAO.PrestamosDAO;
import java.util.ArrayList;
import modeloVO.*;
import ModeloDAO.*;
import modeloVO.UsuarioVO;

public final class ControlesProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/Sesiones/sesion-validate.jspf");
    _jspx_dependants.add("/WEB-INF/Sesiones/sesion.jspf");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"imagenes/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/noui/nouislider.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"tablas_bien.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Productos</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/cs-skin-elastic.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"vendor/jquery/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js%22%3E\"></script>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("      <!-- <script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js\"></script> -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Left Panel -->\n");
      out.write("      \n");
      out.write("    ");
 
        try{ 
        HttpSession miSesion=(HttpSession) request.getSession();
        UsuarioVO usuVO =(UsuarioVO) miSesion.getAttribute("usuLogin");
        UsuarioDAO usuDAO= new UsuarioDAO(usuVO);        
    
      out.write(" \n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    
    if (miSesion.getAttribute("usuLogin") == null) {

        request.removeAttribute("usuLogin");
        request.removeAttribute("id_usuario");
        request.removeAttribute("id_rol");
        request.removeAttribute("contraseña");
         
        miSesion.invalidate();

        request.getRequestDispatcher("Index.jsp").forward(request, response);
    }

      out.write('\n');
      out.write("\n");
      out.write("     ");
      out.write('\n');
      out.write('\n');

    response.setHeader("Pragma", "no-cache");
    response.addHeader("Cache-control", "must-revalidate");
    response.addHeader("Cache-control", "no-cache");
    response.addHeader("Cache-control", "no-store");
    response.setDateHeader("Expires", 0);
    

      out.write('\n');
      out.write("\n");
      out.write("    ");
 
    if(usuVO.getusuRol().equals("1")){
      out.write("\n");
      out.write("        \n");
      out.write("        <aside id=\"left-panel\" class=\"left-panel\">\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-default\">\n");
      out.write("            <div id=\"main-menu\" class=\"main-menu collapse navbar-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"Menu_principal.jsp\"><i class=\"menu-icon fa fa-laptop\"></i>Dashboard </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Profesores</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Profesor.jsp\">Ver </a></li>\n");
      out.write("                             <li><i class=\"fa fa-table\"></i><a href=\"ingresarProfesor.jsp\">Registrar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                       \n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Cursos</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                          \n");
      out.write("                             <li><i class=\"fa fa-table\"></i><a href=\"Curso.jsp\">Ver </a></li>\n");
      out.write("                             <li><i class=\"fa fa-table\"></i><a href=\"insertarCurso.jsp\">Registrar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                       \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Estudiantes</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Estudiantes.jsp\">Ver </a></li>\n");
      out.write("                             <li><i class=\"fa fa-table\"></i><a href=\"ingresarEstudiante.jsp\">Registrar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                       \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Empleados</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Empleado.jsp\">Ver </a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"insertarEmpleados.jsp\">Registrar</a></li>\n");
      out.write("                        </ul>             \n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-th\"></i>Producto</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"menu-icon fa fa-th\"></i><a href=\"Producto.jsp\">Ver </a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"ingresarProducto.jsp\">Registrar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Prestamos</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Prestamo.jsp\">Realizar préstamos  </a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Lista_prestamos.jsp\">Ver préstamos activos</a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Listar_todos_prestamos.jsp\">Ver todos los préstamos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Mi sesion</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Csesion\">Cerrar sesión</a></li> \n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Cambio_de_clave.jsp\">Cambiar mi contraseña</a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"https://drive.google.com/open?id=1jaewsQYWcdjaUFfatu39EXdKLbSQ6e0a\">Ayuda</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li> \n");
      out.write("                              \n");
      out.write("        </nav>\n");
      out.write("    </aside>\n");
      out.write("         \n");
      out.write("    ");
 } 
    else if(usuVO.getusuRol().equals("2")){
      out.write("\n");
      out.write("        <aside id=\"left-panel\" class=\"left-panel\">\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-default\">\n");
      out.write("            <div id=\"main-menu\" class=\"main-menu collapse navbar-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"Menu_principal.jsp\"><i class=\"menu-icon fa fa-laptop\"></i>Menú </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Profesores</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Profesor.jsp\">Ver </a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"ingresarUsuario.jsp\">Registrar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      \n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Cursos</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                          \n");
      out.write("                             <li><i class=\"fa fa-table\"></i><a href=\"Curso.jsp\">Ver </a></li>\n");
      out.write("                             <li><i class=\"fa fa-table\"></i><a href=\"insertarCurso.jsp\">Registrar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                       \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Estudiantes</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Estudiantes.jsp\">Ver </a></li>\n");
      out.write("                             <li><i class=\"fa fa-table\"></i><a href=\"ingresarEstudiante.jsp\">Registrar</a></li>\n");
      out.write("                        </ul>                     \n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-th\"></i>Producto</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"menu-icon fa fa-th\"></i><a href=\"Producto.jsp\">Ver </a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"ingresarProducto.jsp\">Registrar producto</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Préstamos</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Prestamo.jsp\">Realizar préstamos </a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Lista_prestamos.jsp\">Ver préstamos activos</a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Listar_todos_prestamos.jsp\">Ver todos los préstamos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Mi sesion</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Csesion\">Cerrar sesión</a></li> \n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"Cambio_de_clave.jsp\">Cambiar mi contraseña</a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"https://drive.google.com/open?id=1jaewsQYWcdjaUFfatu39EXdKLbSQ6e0a\">Ayuda</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li> \n");
      out.write("        </nav>\n");
      out.write("    </aside>\n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("    <div id=\"right-panel\" class=\"right-panel\">\n");
      out.write("\n");
      out.write("        <!-- Header-->\n");
      out.write("        <header id=\"header\" class=\"header\">\n");
      out.write("            <div class=\"top-left\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"./\"><img src=\"images/Gema_Complete_logo.png\" alt=\"Logo\"></a>\n");
      out.write("                    <a class=\"navbar-brand hidden\" href=\"./\"><img src=\"images/logo2.png\" alt=\"Logo\"></a>\n");
      out.write("                    <a id=\"menuToggle\" class=\"menutoggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"container-contact100\">\n");
      out.write("            <form class=\"contact100-form validate-form\" method=\"post\" action=\"Producto\">\n");
      out.write("               \n");
      out.write("\t\t<span class=\"contact100-form-title\">\n");
      out.write("\t\tVer Controles de producto\n");
      out.write("\t\t</span>\n");
      out.write("                <table id=\"table_id\" class=\"table display AllDataTables\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Serial</th>\n");
      out.write("                        <th>Nombre del producto</th>\n");
      out.write("                        <th>identificación del estudiante </th>\n");
      out.write("                        <th>Nombre del estudiante</th>\n");
      out.write("                        <th>Curso</th>\n");
      out.write("                        <th>Nombre del profesor</th>\n");
      out.write("                        <th>Nombre del prestamista</th>\n");
      out.write("                        <th>Descripción del producto</th>\n");
      out.write("                        <th>Estado del producto</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        ControlVO contrVO = new ControlVO();
                        ControlDAO ContrDAO = new ControlDAO(contrVO);
                        ArrayList<ControlVO> listar_Controles = ContrDAO.listar_Controles();
                        for (int i = 0; i < listar_Controles.size(); i++) {
                            contrVO = listar_Controles.get(i);
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                         <td>\n");
      out.write("                            ");
      out.print( contrVO.getSerial());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( contrVO.getNombre_producto());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( contrVO.getId_estudiante());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( contrVO.getNombre_estudiante());
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( contrVO.getId_curso());
      out.write("\n");
      out.write("                        </td>    \n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( contrVO.getId_profesor());
      out.write("\n");
      out.write("                        </td> \n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( contrVO.getId_empleado());
      out.write("\n");
      out.write("                        </td> \n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( contrVO.getDescripcion());
      out.write("\n");
      out.write("                        </td> \n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print( contrVO.getEstado());
      out.write("\n");
      out.write("                        </td> \n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</form>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("    <!-- Scripts -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#example').DataTable();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <!--===============================================================================================-->\n");
      out.write("    <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <!--===============================================================================================-->\n");
      out.write("    <script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("    <!--===============================================================================================-->\n");
      out.write("    <script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <!--===============================================================================================-->\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("    <script src=\"script_select.js\"></script>\n");
      out.write("\n");
      out.write("    <!--===============================================================================================-->\n");
      out.write("    <script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("    <script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("    <!--===============================================================================================-->\n");
      out.write("    <script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("    <!--===============================================================================================-->\n");
      out.write("    <script src=\"vendor/noui/nouislider.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--===============================================================================================-->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("    <script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Chart js -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js@2.7.3/dist/Chart.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--Chartist Chart-->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chartist@0.11.0/dist/chartist.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chartist-plugin-legend@0.6.2/chartist-plugin-legend.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery.flot@0.8.3/jquery.flot.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/flot-pie@1.0.0/src/jquery.flot.pie.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/flot-spline@0.0.1/js/jquery.flot.spline.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/simpleweather@3.1.0/jquery.simpleWeather.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/init/weather-init.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/init/fullcalendar-init.js\"></script>\n");
      out.write("\n");
      out.write("    <!--Local Stuff-->\n");
      out.write("\n");
      out.write("    <script src=\"scripts_globales.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    ");

        if (request.getAttribute("mensajeError") != null) {
    
      out.write("\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    ");
    }
      out.write("\n");
      out.write("\n");
      out.write("    ");

        if (request.getAttribute("mensajeExito") != null) {
    
      out.write("\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    ");
    }
      out.write("\n");
      out.write("\n");
      out.write("    ");
 } catch (Exception e) {
            response.sendRedirect("../Index.jsp");
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
