package controladores;

import data_access.UsuarioDao;
import entidad.Usuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class UsuarioController {

    ModelAndView modelAndView =  new ModelAndView();
    List datos;
    int idUsuario;
    UsuarioDao usuariosDao = new UsuarioDao();
    
    //Mostrar usuarios
    @RequestMapping("usuario.htm")
    public ModelAndView listar(){
        List<Usuario> usuarios = usuariosDao.getALL();
        modelAndView.addObject("lista", usuarios);
        modelAndView.setViewName("usuario/usuario");
        return modelAndView;
    }
    
    //Agregar usuario (mostrar)
    @RequestMapping(value = "usuario_agregar.htm", method = RequestMethod.GET)
    public ModelAndView agregar(){
        modelAndView.addObject(new Usuario());
        modelAndView.setViewName("usuario/usuario_agregar");
        return modelAndView;
    }
    
    //Agregar usuario (guardar)
    @RequestMapping(value = "usuario_agregar.htm", method = RequestMethod.POST)
    public ModelAndView agregar(Usuario usuario){
        usuariosDao.save(usuario);
        return new ModelAndView("redirect:/usuario.htm");
    }
    
    //Editar usuario (mostrar)
    @RequestMapping(value="usuario_editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        Usuario usuario = usuariosDao.get(idUsuario);
        modelAndView.addObject("registro", usuario);
        modelAndView.setViewName("usuario/usuario_editar");
        return modelAndView;
    }
    
    //Editar usuario (actualizar)
    @RequestMapping(value = "usuario_editar.htm", method = RequestMethod.POST)
    public ModelAndView editar(Usuario usuario){
        usuariosDao.update(usuario);
        return new ModelAndView("redirect:/usuario.htm");
    }
    
}
