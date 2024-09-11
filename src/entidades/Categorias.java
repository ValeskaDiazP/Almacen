package entidades;

/**
 *
 * @author SENATI1
 */
public class Categorias {
  
    private int idcategoria;
    private String nombre;
    private String descripcion;
    private boolean condicion;
    
    //constructor

    public Categorias() {
    }

    public Categorias(int idcategoria, String nombre, String descripcion, boolean condicion) {
        this.idcategoria = idcategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.condicion = condicion;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Categorias{" + "idcategoria=" + idcategoria + ", nombre=" + nombre + ", descripcion=" + descripcion + ", condicion=" + condicion + '}';
    }
    
    
    
}
