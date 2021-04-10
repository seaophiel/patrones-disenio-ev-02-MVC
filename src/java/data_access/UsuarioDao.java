package data_access;

import entidad.Usuario;
import interfaces.Dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.Optional.empty;


public class UsuarioDao implements Dao<Usuario> {
    
    private List<Usuario> usuarios = new ArrayList<>();
    
    public UsuarioDao(){
        
    }
    
    public Usuario getByCredentials(String email, String password){
        String sql = "select * from usuario where email = '" + email + "' and password = '" + password + "'";
        usuarios = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        
        if (rows == null || rows.size() <= 0){
            return null;
        }
        else{
            for (Map row : rows) {
                Usuario obj = new Usuario();

                obj.setIdUsuario((Integer) row.get("IdUsuario"));
                obj.setEmail((String) row.get("Email"));
                obj.setPassword((String) row.get("Password"));
                obj.setNombre((String) row.get("Nombre"));
                obj.setApellidoPaterno((String) row.get("ApellidoPaterno"));
                obj.setApellidoMaterno((String) row.get("ApellidoMaterno"));
                obj.setDireccion((String) row.get("Direccion"));

                usuarios.add(obj);
            }

            return usuarios.get(0);
        }
    }

    @Override
    public Usuario get(long id) {
        String sql = "select * from usuario where idUsuario = " + id;
        usuarios = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            Usuario obj = new Usuario();

            obj.setIdUsuario((Integer) row.get("IdUsuario"));
            obj.setEmail((String) row.get("Email"));
            obj.setPassword((String) row.get("Password"));
            obj.setNombre((String) row.get("Nombre"));
            obj.setApellidoPaterno((String) row.get("ApellidoPaterno"));
            obj.setApellidoMaterno((String) row.get("ApellidoMaterno"));
            obj.setDireccion((String) row.get("Direccion"));
            
            usuarios.add(obj);
        }
        
        return usuarios.get(0);
    }

    @Override
    public List<Usuario> getALL() {
        /*
        List datos;
        String sql = "select * from usuario";
        datos = this.jdbcTemplate.queryForList(sql);
        return datos;
        */
        
        String sql = "select * from usuario";
        usuarios = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            Usuario obj = new Usuario();

            obj.setIdUsuario((Integer) row.get("IdUsuario"));
            obj.setEmail((String) row.get("Email"));
            obj.setPassword((String) row.get("Password"));
            obj.setNombre((String) row.get("Nombre"));
            obj.setApellidoPaterno((String) row.get("ApellidoPaterno"));
            obj.setApellidoMaterno((String) row.get("ApellidoMaterno"));
            obj.setDireccion((String) row.get("Direccion"));
            
            usuarios.add(obj);
        }
        
        return usuarios;
        
    }

    @Override
    public void save(Usuario usuario) {
        String sql = "insert into usuario (email, password, nombre, apellidoPaterno, apellidoMaterno, direccion) values (?,?,?,?,?,?)";
        jdbcTemplate.update(sql, usuario.getEmail(), usuario.getPassword(), usuario.getNombre(), usuario.getApellidoPaterno(), usuario.getApellidoMaterno(), usuario.getDireccion());
    }

    @Override
    public void update(Usuario usuario) {
        String sql = "update usuario set email=?, password=?, nombre=?, apellidoPaterno=?, apellidoMaterno=?, direccion=? where idUsuario=?";
        this.jdbcTemplate.update(sql, usuario.getEmail(), usuario.getPassword(), usuario.getNombre(), usuario.getApellidoMaterno(), usuario.getApellidoMaterno(), usuario.getDireccion(), usuario.getIdUsuario());
    }

    @Override
    public void delete(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
