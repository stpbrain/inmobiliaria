<%-- 
    Document   : EditarEdificio
    Created on : 22-nov-2017, 10:02:40
    Author     : papalominos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="container-fluid">
            <div style="background-image: url(img/banner.jpg); background-position: right; background-size: 100%; " class="jumbotron text-center">
                <h4 class="display-4" >Inmobiliaria <br> Adeudadito mas Feliz</h4>
                <h5 class="lead">El lugar donde su sueño se hace <h5 style="color: red">Realidad</h5></h5>
            </div>
        </div>
        
        <div class="container">
            <table class="table container text-center table-striped table-bordered table-hover">
                <tr>
                    <td colspan="2"><h3>Portal de Modificacion </h3></td>
                </tr>
                <tr>
                    <td>El codigo del edificio es : </td>
                    <td> </td>
                </tr>
                <tr>
                    <td>Ingrese nuevo nombre de Edificio:</td>
                    <td></td>
                </tr>
                <tr>
                    <td>Ingrese nueva Direccion :</td>
                    <td> </td>
                    
                </tr>
                <tr>
                    <td>Estado actual del permiso : </td>
                     <td>
                            <select name="permiso">
                                <option value="0"> No posee Permiso</option>
                                <option value="1"> Si posee Permiso</option>
                            </select>
                        </td>
                </tr>
                
                
            </table>
        </div>
        
    </body>
</html>
