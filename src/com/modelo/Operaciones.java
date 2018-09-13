
package modelo;

import java.util.ArrayList;

/**
 *Nombre:Operaciones
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public interface Operaciones {
    public boolean insertar(Object obj);
    public boolean modificar(Object obj);
    public boolean eliminar(Object obj);
    public ArrayList<Object[]> consultar();
}
