package impl;

import entidad.Usuario;
import interfaz.ICuentaUsuario;

public class CuentaAdministrador implements ICuentaUsuario
{

    @Override
    public void creaCuentaUsuario(Usuario usuario) {
        System.out.println("Cuenta administrador creada: " + usuario.idUsuario);
    }
    
}
