package impl;

import entidad.Usuario;
import interfaz.ICuentaUsuario;

public class CuentaUsuario implements ICuentaUsuario {

    @Override
    public void creaCuentaUsuario(Usuario usuario) {
        System.out.println("Cuenta usuario creada: " + usuario.idUsuario);
    }
    
}
