package controladores;

import config.Conexion;
import data_access.UsuarioDao;
import entidad.Usuario;
import java.util.HashSet;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class LoginController {
    
    ModelAndView modelAndView =  new ModelAndView();
    List datos;
    int idUsuario;
    UsuarioDao usuariosDao = new UsuarioDao();
    
    @RequestMapping("login.htm")
    public ModelAndView listar(){
        modelAndView.setViewName("login/login");
        return modelAndView;
    }
    
    @RequestMapping(value = "login.htm", method = RequestMethod.POST)
    public ModelAndView ingreso(HttpServletRequest request){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if (email == null || password == null){
            modelAndView.setViewName("login");    
        }
        else{
            Usuario usuario = usuariosDao.getByCredentials(email, password);
            if (usuario != null){
                modelAndView.setViewName("login/login_ver");
                modelAndView.addObject("registro", usuario);
            }
            else{
                modelAndView.setViewName("login/login");
                modelAndView.addObject("mensaje", "Datos no coinciden.");
            }
        }
        
        
        return modelAndView;
    }
    
    
}
