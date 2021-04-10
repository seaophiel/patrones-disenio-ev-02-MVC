<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SNF - Editar Usuario</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </head>
    <body>
        
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Actualizar Usuario</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        
                        <label>EMAIL</label>
                        <input type="text" name="email" value="${registro.email}" class="form-control" />
                        
                        <label>PASSWORD</label>
                        <input type="text" name="password" value="${registro.password}" class="form-control" />
                        
                        <label>NOMBRE</label>
                        <input type="text" name="nombre" value="${registro.nombre}" class="form-control" />
                        
                        <label>APELLIDO PATERNO</label>
                        <input type="text" name="apellidoPaterno" value="${registro.apellidoPaterno}" class="form-control" />
                        
                        <label>APELLIDO MATERNO</label>
                        <input type="text" name="apellidoMaterno" value="${registro.apellidoMaterno}" class="form-control" />
                        
                        <label>DIRECCION</label>
                        <input type="text" name="direccion" value="${registro.direccion}" class="form-control" />
                        
                        <input type="submit" value="Actualizar" class="btn btn-success"/>
                        <a href="usuario.htm" class="btn btn-primary">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
        
    </body>
</html>
