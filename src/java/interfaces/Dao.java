
package interfaces;

import config.Conexion;
import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.JdbcTemplate;

public interface Dao<T> {
    
    T get(long id);
    List<T> getALL();
    void save(T t);
    void update(T t);
    void delete(T t);
    Conexion conexion = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conexion.Conectar());
    
}
