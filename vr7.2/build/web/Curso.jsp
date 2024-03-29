<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="modeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.CursoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloVO.CursosVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html>
    <head>
        <link rel="icon" type="image/png" href="imagenes/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/noui/nouislider.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
        
        <link rel="stylesheet" href="tablas_bien.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
        
        
        
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Curso</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">


        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="assets/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>

        <link href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" rel="stylesheet">
        <script src="vendor/jquery/jquery.dataTables.min.js" type="text/javascript"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js%22%3E"></script>
        

    </head>
    <body>
       
      
    <%
            try {
                HttpSession miSesion = (HttpSession) request.getSession();
                UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("usuLogin");
                UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        %> 
        <%@include file="WEB-INF/Sesiones/sesion-validate.jspf"%>
        <%@include file="WEB-INF/Sesiones/sesion.jspf" %>
        <%        if (usuVO.getusuRol().equals("1")) {%>

        <aside id="left-panel" class="left-panel">

            <nav class="navbar navbar-expand-sm navbar-default">
                <div id="main-menu" class="main-menu collapse navbar-collapse">
                    <ul class="nav navbar-nav">



                        <li class="active">
                            <a href="Menu_principal.jsp"><i class="menu-icon fa fa-laptop"></i>Menú</a>
                        </li>

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Profesores</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-table"></i><a href="Profesor.jsp">Ver </a></li>
                                <li><i class="fa fa-table"></i><a href="ingresarProfesor.jsp">Registrar</a></li>
                            </ul>

                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Cursos</a>
                            <ul class="sub-menu children dropdown-menu">

                                <li><i class="fa fa-table"></i><a href="Curso.jsp">Ver </a></li>
                                <li><i class="fa fa-table"></i><a href="insertarCurso.jsp">Registrar</a></li>
                            </ul>

                        </li>

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Estudiantes</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-table"></i><a href="Estudiantes.jsp">Ver </a></li>
                                <li><i class="fa fa-table"></i><a href="ingresarEstudiante.jsp">Registrar</a></li>
                            </ul>

                        </li>

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Empleados</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-table"></i><a href="Empleado.jsp">Ver </a></li>
                                <li><i class="fa fa-table"></i><a href="insertarEmpleados.jsp">Registrar</a></li>
                            </ul>             
                        </li>

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-th"></i>Producto</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-th"></i><a href="Producto.jsp">Ver </a></li>
                                <li><i class="fa fa-table"></i><a href="ingresarProducto.jsp">Registrar</a></li>
                            </ul>
                        </li>

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Préstamos</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-table"></i><a href="Prestamo.jsp">Realizar préstamos </a></li>
                                <li><i class="fa fa-table"></i><a href="Lista_prestamos.jsp">Ver préstamos activos</a></li>
                                <li><i class="fa fa-table"></i><a href="Listar_todos_prestamos.jsp">Ver todos los préstamos</a></li>
                                <li><i class="fa fa-table"></i><a href="ControlesProducto.jsp">Ver Controles de productos</a></li>
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Mi sesión</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-table"></i><a href="Csesion">Cerrar sesión</a></li> 
                                <li><i class="fa fa-table"></i><a href="Cambio_de_clave.jsp">Cambiar mi contraseña</a></li>
                                <li><i class="fa fa-table"></i><a href="https://drive.google.com/open?id=1jaewsQYWcdjaUFfatu39EXdKLbSQ6e0a">Ayuda</a></li>
                            </ul>
                        </li> 

                        </nav>
                        </aside>

                        <% } else if (usuVO.getusuRol().equals("2")) {%>
                        <aside id="left-panel" class="left-panel">

                            <nav class="navbar navbar-expand-sm navbar-default">
                                <div id="main-menu" class="main-menu collapse navbar-collapse">
                                    <ul class="nav navbar-nav">



                                        <li class="active">
                                            <a href="Menu_principal.jsp"><i class="menu-icon fa fa-laptop"></i>Menú</a>
                                        </li>

                                        <li class="menu-item-has-children dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Profesores</a>
                                            <ul class="sub-menu children dropdown-menu">
                                                <li><i class="fa fa-table"></i><a href="Profesor.jsp">Ver </a></li>
                                                <li><i class="fa fa-table"></i><a href="ingresarUsuario.jsp">Registrar</a></li>
                                            </ul>

                                        </li>
                                        <li class="menu-item-has-children dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Cursos</a>
                                            <ul class="sub-menu children dropdown-menu">

                                                <li><i class="fa fa-table"></i><a href="Curso.jsp">Ver </a></li>
                                                <li><i class="fa fa-table"></i><a href="insertarCurso.jsp">Registrar</a></li>
                                            </ul>

                                        </li>

                                        <li class="menu-item-has-children dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Estudiantes</a>
                                            <ul class="sub-menu children dropdown-menu">
                                                <li><i class="fa fa-table"></i><a href="Estudiantes.jsp">Ver </a></li>
                                                <li><i class="fa fa-table"></i><a href="ingresarEstudiante.jsp">Registrar</a></li>
                                            </ul>                     
                                        </li>


                                        <li class="menu-item-has-children dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-th"></i>Producto</a>
                                            <ul class="sub-menu children dropdown-menu">
                                                <li><i class="menu-icon fa fa-th"></i><a href="Producto.jsp">Ver </a></li>
                                                <li><i class="fa fa-table"></i><a href="ingresarProducto.jsp">Registrar producto</a></li>
                                            </ul>

                                        </li>

                                        <li class="menu-item-has-children dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Préstamos</a>
                                            <ul class="sub-menu children dropdown-menu">
                                                <li><i class="fa fa-table"></i><a href="Prestamo.jsp">Realizar préstamos </a></li>
                                                <li><i class="fa fa-table"></i><a href="Lista_prestamos.jsp">Ver préstamos activos</a></li>
                                                <li><i class="fa fa-table"></i><a href="Listar_todos_prestamos.jsp">Ver todos los préstamos</a></li>
                                                <li><i class="fa fa-table"></i><a href="ControlesProducto.jsp">Ver Controles de productos</a></li>
                                            </ul>
                                        </li>
                                        <li class="menu-item-has-children dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Mi sesión</a>
                                            <ul class="sub-menu children dropdown-menu">
                                                <li><i class="fa fa-table"></i><a href="Csesion">Cerrar sesión</a></li> 
                                                <li><i class="fa fa-table"></i><a href="Cambio_de_clave.jsp">Cambiar mi contraseña</a></li>
                                                <li><i class="fa fa-table"></i><a href="https://drive.google.com/open?id=1jaewsQYWcdjaUFfatu39EXdKLbSQ6e0a">Ayuda</a></li>
                                            </ul>
                                        </li> 
                                        </nav>
                                        </aside>
                                        <% }
                                        %>
    <div id="right-panel" class="right-panel">

        <!-- Header-->
        <header id="header" class="header">
            <div class="top-left">
                <div class="navbar-header">
                    <a class="navbar-brand" href="./"><img src="images/Gema_Complete_logo.png" alt="Logo"></a>
                    <a class="navbar-brand hidden" href="./"><img src="images/logo2.png" alt="Logo"></a>
                    <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                </div>
            </div>

        </header>

        <div class="container" overflow="auto">
            <div class="container-contact100" overflow="auto">
                <div class="wrap-contact100"overflow="auto">
                    <form class="contact100-form validate-form" method="post" action="Profesor">
                        <span class="contact100-form-title">
                            Ver Cursos
                        </span>


                        <table id="table_id" class="table display AllDataTables"  style="width:100%">

                            <thead>
                                <tr>
                                    <th>Curso</th>
                                    <th>id profe</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    CursosVO cuVO = new CursosVO();
                                    CursoDAO cuDAO = new CursoDAO(cuVO);
                                    ArrayList<CursosVO> cursos = cuDAO.listarcursos();
                                    for (int i = 0; i < cursos.size(); i++) {
                                        cuVO = cursos.get(i);
                                %>
                                <tr>

                                    <td>
                                        <%= cuVO.getIdCurso()%>
                                    </td>

                                    <td>
                                        <%= cuVO.getIdprofesor()%>
                                    </td>

                                    <td>

                                        <a href="actualizarCurso.jsp?id=<%= cuVO.getIdCurso()%>" title="Modificar Curso">Actualizar</a>
                                    </td>

                                </tr>

                                <%}%>
                            </tbody>
                        </table>
                        

                    </form>
                </div>
            </div>



        </div>

    </div>

    <div class="clearfix"></div>


    <!-- Scripts -->
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>
    <script>
        $(document).ready(function () {
            $('#example').DataTable();
        });
    </script>
    <!--===============================================================================================-->
    <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/animsition/js/animsition.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/bootstrap/js/popper.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="script_select.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/daterangepicker/moment.min.js"></script>
    <script src="vendor/daterangepicker/daterangepicker.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/countdowntime/countdowntime.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/noui/nouislider.min.js"></script>

    <!--===============================================================================================-->
    <script src="js/main.js"></script>

    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>

    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
    <script src="assets/js/main.js"></script>

    <!--  Chart js -->
    <script src="https://cdn.jsdelivr.net/npm/chart.js@2.7.3/dist/Chart.bundle.min.js"></script>

    <!--Chartist Chart-->
    <script src="https://cdn.jsdelivr.net/npm/chartist@0.11.0/dist/chartist.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chartist-plugin-legend@0.6.2/chartist-plugin-legend.min.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/jquery.flot@0.8.3/jquery.flot.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/flot-pie@1.0.0/src/jquery.flot.pie.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/flot-spline@0.0.1/js/jquery.flot.spline.min.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/simpleweather@3.1.0/jquery.simpleWeather.min.js"></script>
    <script src="assets/js/init/weather-init.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.js"></script>
    <script src="assets/js/init/fullcalendar-init.js"></script>

    <!--Local Stuff-->
    <script src="scripts_globales.js"></script>

       <%
                                    if (request.getAttribute("MensajeExito") != null) {
                                %>
                                <link href="css/Alerts/AlertsExito.css" rel="stylesheet" type="text/css"/>
                                <div class="modal" id="img1">   
                                    <div class="imagen">
                                        <div class="div-img"> <img class="imagen2" src="images/chulo.png" width="150px"/></div>           
                                        <div id="contenedor_text">${MensajeExito}</div>
                                        <br>
                                        <div id="contenedor_box">
                                            <form method="post" action="Curso.jsp">  
                                                <button class="btn12" id="btnalert" value="Enter" >Ok</button>           
                                            </form> 
                                        </div>      
                                    </div>
                                </div>             
                                <% }%>
    <% } catch (Exception e) {
            response.sendRedirect("Index.jsp");
        }
    %>
    </body>
</html>

