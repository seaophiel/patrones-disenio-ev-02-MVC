package entidad;


public class Producto {

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    public int getPrecioCompetencia() {
        return precioCompetencia;
    }

    public void setPrecioCompetencia(int precioCompetencia) {
        this.precioCompetencia = precioCompetencia;
    }
    
    public boolean isEsOferta() {
        return esOferta;
    }

    public void setEsOferta(boolean esOferta) {
        this.esOferta = esOferta;
    }

    public boolean isEsSimilar() {
        return esSimilar;
    }

    public void setEsSimilar(boolean esSimilar) {
        this.esSimilar = esSimilar;
    }
    
    public int getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(int precioOferta) {
        this.precioOferta = precioOferta;
    }
    
    private String nombreCategoria;
    private String nombreProducto;
    private int precio;
    private int precioCompetencia;
    private int idProducto;
    private int idCategoria;
    private boolean esOferta;
    private boolean esSimilar;
    private int precioOferta;
    
}
