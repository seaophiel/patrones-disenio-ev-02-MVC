<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SNF - Agregar Usuario</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </head>
    <body>
        
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Agregar nuevo Usuario</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>E-Mail</label>
                        <input type="text" name="email" class="form-control" />
                        
                        <label>Password</label>
                        <input type="text" name="password" class="form-control" />
                        
                        <label>Nombre</label>
                        <input type="text" name="nombre" class="form-control" />
                        
                        <label>Apellido Paterno</label>
                        <input type="text" name="apellidoPaterno" class="form-control" />
                        
                        <label>Apellido Materno</label>
                        <input type="text" name="apellidoMaterno" class="form-control" />
                        
                        <label>Direccion</label>
                        <input type="text" name="direccion" class="form-control" />
                        
                        <input type="submit" value="Agregar" class="btn btn-success"/>
                        <a href="usuario.htm" class="btn btn-primary">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
        
    </body>
</html>
