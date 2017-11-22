<%-- 
    Document   : CrearNuevoEdificio
    Created on : 20-nov-2017, 21:51:07
    Author     : papalominos
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Comuna"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HttpSession sesion = request.getSession(true);
    ArrayList<Comuna> com = (ArrayList<Comuna>) sesion.getAttribute("comuna");
   
 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Nuevo Edificio</title>
        
        
    </head>
    <body>
        <div class="container " style="width: 100%">
            <div class=" text-center " > 
                <table  >
                    <th colspan="2">
                        <h3>Ingrese los datos para un nuevo Edificio</h3>
                    </th>
                    <tr>
                        
                        <td><h4>Ingrese ID del Edificio :</h4></td>
                        <td><input type="text" name="id_edificio" class="form-control" </td>
                    </tr>
                    <tr>   
                        <td>
                            <h4>Ingrese Número del Edificio :</h4>
                        </td>
                        <td>
                            <input type="text" name="n_edificio" class="form-control"
                        </td>
                        
                    </tr>
                    <tr>
                        <td>
                            <h4>Ingrese Direccion del Edificio :</h4>
                        </td>
                        <td>
                            <input type="text" name="direccion" class="form-control"
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Ingrese comuna del Edificio:
                        </td>
                        <td>
                             <select name="comuna">
                               <%  
                               for (Comuna elem : com) {
                               %>  <option  value="<%= elem.getId() %>" > <%= elem.getN_comuna() %> </option>
                                   
                                   <% } %>
                                    
                                </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Posee Permiso :
                        </td>
                        <td>
                            <select name="permiso">
                                <option value="0"> No posee</option>
                                <option value="1"> Si posee</option>
                            </select>
                        </td>
                        
                    </tr>
                </table>
            </div>
            
            
        </div>
        
        
    </body>
</html>

