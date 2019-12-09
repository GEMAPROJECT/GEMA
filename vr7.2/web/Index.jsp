<%-- 
    Document   : Index
    Created on : Jun 11, 2019, 8:05:07 AM
    Author     : APRENDIZ
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!----------------------------------------->
        <title>Inicio Sesión</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
        <link rel="stylesheet" href="css/Login.css">
        <link rel="stylesheet" href="sweetalert2.min.css"/>
    </head>
    
</head>
<body
    
    
    
    
    <div class="container h-100">
        <div class="d-flex justify-content-center h-100">
            <div class="user_card">
                <div class="d-flex justify-content-center">
                    <div class="brand_logo_container">
                        <img src="IMG/Gema_logo.png" class="brand_logo" alt="Logo"/>
                    </div>
                </div>
                <div class="d-flex justify-content-center form_container">
                    <form method="post" action="Usuario">
                        <div class="input-group mb-3">
                            <div class="input-group-append">
                                <span class="input-group-text"><i class="fas fa-user"></i></span>
                            </div>
                            <input type="text" name="textUsuLogin" class="form-control input_user" placeholder="Usuario">
                        </div>
                        <div class="input-group mb-2">
                            <div class="input-group-append">
                                <span class="input-group-text"><i class="fas fa-key"></i></span>
                            </div>
                            <input type="password" name="textUsuPassword" class="form-control input_pass" placeholder="Contraseña">
                        </div>
                        <div class="d-flex justify-content-center mt-3 login_container">
                            <input   type="submit" name="button" class="btn login_btn" value="Iniciar Sesión">
                            <input type="hidden" name="opcion" value="3">
                        </div>
                    </form>
                </div>		
            </div>
        </div>      
     <%
        if (request.getAttribute("MensajeError") != null) {
    %>
    <link href="css/Alerts/AlertsLogin.css" rel="stylesheet" type="text/css"/>
    <div class="modal" id="img1">   
        <div class="imagen">
            <div class="div-img"> <img class="imagen2" src="images/x.png" width="100px"/></div>           
                <div id="contenedor_text">${MensajeError}</div>
                <br>
                <div id="contenedor_box">
                    <form method="post" action="Index.jsp">  
                         <button class="btn12" id="btnalert" value="Enter" >Ok</button>           
                     </form> 
                </div>      
        </div>
    </div>             
<% }%>
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
                                            <form method="post" action="Index.jsp">  
                                                <button class="btn12" id="btnalert" value="Enter" >Ok</button>           
                                            </form> 
                                        </div>      
                                    </div>
                                </div>             
                                <% }%>

</body>
</html>
