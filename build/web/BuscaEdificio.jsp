<%-- 
    Document   : BuscaEdificio
    Created on : 22-nov-2017, 2:44:51
    Author     : papalominos
--%>

<%@page import="Controlador.ControlEdificio"%>
<%@page import="Modelo.Edificio"%>
<%@page import="Modelo.Comuna"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HttpSession sesion = request.getSession(true);
    ArrayList<Comuna> com = (ArrayList<Comuna>) sesion.getAttribute("comuna");
    ArrayList<Edificio> lEdi = (ArrayList<Edificio>) sesion.getAttribute("lista_edi");
String control = "display:none";
 %>

<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Buscar Edificios</title>
    </head>
    <body>
        
         <div class="container-fluid">
            <div style="background-image: url(img/banner.jpg); background-position: right; background-size: 100%; " class="jumbotron text-center">
                <h4 class="display-4" >Inmobiliaria <br> Adeudadito mas Feliz</h4>
            <h5 class="lead">El lugar donde su sueño se hace <h5 style="color: red">Realidad</h5></h5>
            </div>
        </div>
        
        <div class="container ">
            <form name="f2" method="POST" action="./ServletEdificio">
                <table class="text-center">
                <tr>
                    <td> Ingrese comuna a Buscar </td>
                    <td>
                         <select name="comuna">
                               <%  
                               for (Comuna elem : com) {
                               %>  <option  value="<%= elem.getId() %>" > <%= elem.getN_comuna() %> </option>
                                   
                                   <% } %>
                                    
                                </select>
                    </td>
                    <td><input type="submit" name="btn_buscar" value="Buscar"  class="btn btn-success" </td>
                </tr>
            </table>
        </form>
        </div>
<hr>
<div class="container ">
    <form method="POST" action="./ServletEdificio" name="f3">   
                <table class="table container text-center table-striped table-bordered table-hover">
                    <tr>
                        
                        <th class="text-center"> Codigo de Edificio </th>
                        <th class="text-center">Nombre del Edificio</th>
                        <th class="text-center">Direccion del Edificio</th>
                        <th class="text-center">Comuna</th>
                        <th class="text-center">Posee Permiso</th>
                        <th class="text-center">Habilitar Permisos</th>
                        
                    </tr>
               <!-- </table> -->
            <% if(lEdi != null){for (Edificio e : lEdi) { %>
            <!--<table class="table container text-center ">-->
                  
                    <tr class="info">
                         
                        <td><%=e.getId_edificio() %></td>
                    <input type="text" name="id" value="<%=e.getId_edificio() %>" style="display: none">
                        <td><%=e.getN_edifico() %></td>
                        <td><%=e.getDireccion() %></td>
                        <td><% ControlEdificio c = new ControlEdificio();
                        String comuna =c.TraeComuna(e.getId_comuna());
                        %><h6 style="color : blue"><%= comuna %></h6></td>
                        <td><% if(e.getPosee_permiso() == 0)
                            
                        { control = "  "; %><h6 style="color: red ">No posee Permisos</h6> <%}
                          else {%><h6 style="color: green">Posee Permisos</h6> <% }
                        %></td>
                        <td> <input type="submit" name="btn_habilitar" value="Habilitar Permisos" class="btn btn-danger" style="<%= control %>" ></td>
                        
                         </tr>
                   
                   
                
                         <%}}else {%> <%}%>
                </table>  
</form>
        </div>                                   
                                  
    </body>
</html>
