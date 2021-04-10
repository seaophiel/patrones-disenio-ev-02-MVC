package interfaces;

import entidad.Producto;
import java.util.List;

public interface IContainer {
    public IIterator creaIterador(List<Producto> productos);
    
}
