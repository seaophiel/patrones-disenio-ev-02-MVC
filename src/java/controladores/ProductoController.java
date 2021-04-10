package controladores;

import data_access.ProductoDao;
import entidad.Producto;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class ProductoController {

    ModelAndView modelAndView =  new ModelAndView();
    List datos;
    int idUsuario;
    ProductoDao productosDao = new ProductoDao();
    
    //Mostrar productos
    @RequestMapping("producto.htm")
    public ModelAndView listar(){
        List<Producto> productos = productosDao.getALL();
        modelAndView.addObject("lista", productos);
        modelAndView.setViewName("producto/producto");
        return modelAndView;
    }
    
    
}
