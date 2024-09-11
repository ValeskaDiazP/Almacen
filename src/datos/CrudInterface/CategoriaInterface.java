package datos.CrudInterface;

import java.util.List;

/**
 *
 * @author SENATI1
 */
public interface CategoriaInterface<T> {
    
    public List<T> listar(String texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj); 
    public boolean desactualizar(T obj);
    public boolean activar(T obj);
    public int total();
    public boolean existe(String obj);
}
