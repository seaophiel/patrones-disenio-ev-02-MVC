<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SNF</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <script>
            function goUsuarios()
            {
                 location.href = "usuario.htm";
            }
            
            function goLogin()
            {
                 location.href = "login.htm";
            }
            
            function goProductos()
            {
                 location.href = "producto.htm";
            }
        </script>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h2>Menú SNF</h2>
                </div>
        <div class="card-body">
        <table>
            <tr>
                <td>El siguiente proyecto tiene por objetivo mostrar diversas funcionalidades para el cliente SNF</td>
            </tr>
            <tr>
                <td>
                    <button type="button" onclick="goLogin();" class="btn btn-primary">Ingreso</button>
                    <button type="button" onclick="goUsuarios();" class="btn btn-primary">Mantenedor Usuarios</button>
                    <button type="button" onclick="goProductos();" class="btn btn-primary">Ver Productos</button>
                </td>
            </tr>
            <tr>
                <td></td>
            </tr>
        </table>
        </div>
            </div>
        </div>
        
        
    </body>
</html>
