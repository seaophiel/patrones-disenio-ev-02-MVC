package data_access;

import entidad.Producto;
import interfaces.Dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.Optional.empty;


public class ProductoDao implements Dao<Producto> {
    
    private List<Producto> productos = new ArrayList<>();
    
    public ProductoDao(){
        
    }

    @Override
    public Producto get(long id) {
        String sql = "select p.*, c.NombreCategoria from producto p inner join categoria c on p.IdCategoria = c.idCategoria where p.idProducto = " + id;
        productos = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            Producto obj = new Producto();

            obj.setIdProducto((Integer) row.get("IdProducto"));
            obj.setIdCategoria((Integer) row.get("IdCategoria"));
            obj.setNombreCategoria((String) row.get("NombreCategoria"));
            obj.setNombreProducto((String) row.get("NombreProducto"));
            obj.setPrecio((Integer) row.get("Precio"));
            
            productos.add(obj);
        }
        
        return productos.get(0);
    }

    @Override
    public List<Producto> getALL() {
        
        String sql = "select p.*, c.NombreCategoria from producto p inner join categoria c on p.IdCategoria = c.idCategoria";
        productos = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            Producto obj = new Producto();

            obj.setIdProducto((Integer) row.get("IdProducto"));
            obj.setIdCategoria((Integer) row.get("IdCategoria"));
            obj.setNombreCategoria((String) row.get("NombreCategoria"));
            obj.setNombreProducto((String) row.get("NombreProducto"));
            obj.setPrecio((Integer) row.get("Precio"));
            
            productos.add(obj);
        }
        
        return productos;
        
    }

    @Override
    public void save(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
