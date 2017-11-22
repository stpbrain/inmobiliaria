<%-- 
    Document   : AdminCentral
    Created on : 20-nov-2017, 20:04:55
    Author     : papalominos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Administracion</title>
    </head>
    <body>
        <div class="container-fluid">
            <div style="background-image: url(img/banner.jpg); background-position: right; background-size: 100%; " class="jumbotron text-center">
              <h4 class="display-4">Inmobiliaria <br> Adeudadito mas Feliz</h4>
            <h5 class="lead">El lugar donde su sueño se hace <h5 style="color: red">Realidad</h5></h5>
        </div>
        </div>
        <div class="container">
            <form action="./ServletPrincipal" name="fom1" method="POST">
            <table class="table text-center">
                <tr>
                    <td> <img src="img/nuevoEdificio.jpg" width="120" height="120"> </td>
                    <td><img src="img/BuscarEdificio.jpg" width="120" height="120"></td>
                    <td><img src="img/arriendo.jpg" width="120" height="120"></td>
                    <td><img src="img/user.jpg" width="120" height="120"></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" name="btn_nEdificio"  value="Crear nuevo Edificio" class="btn btn-info">
                    </td>
                    <td>
                        <input type="submit" name="btn_buscarEdi"  value="Buscar Edificio" class="btn btn-success">
                    </td>
                    <td>
                        <input type="submit" name="btn_Ingresa_Departamento"  value="Ingresar Departamento" class="btn btn-danger">
                    </td>
                    <td>
                        <input type="submit" name="btn_usuarios"  value="Usuarios" class="btn btn-warning">
                    </td>
                    </form>
                    
                </tr>
                
            </table>
            </form>
        </div>
        
    </body>
</html>
