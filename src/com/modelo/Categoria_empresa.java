
package modelo;

/**
 *Nombre:Categoria_empresa
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Categoria_empresa {
    private int id_catg_empresa;
    private String categoria;
    private String descripcion;
    private String fecha_creacion;
    private String fecha_modif;
    private int estado;

    public Categoria_empresa() {
    }

    public Categoria_empresa(int id_catg_empresa, String categoria, String descripcion, String fecha_creacion, String fecha_modif, int estado) {
        this.id_catg_empresa = id_catg_empresa;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modif = fecha_modif;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_catg_empresa() {
        return id_catg_empresa;
    }

    public void setId_catg_empresa(int id_catg_empresa) {
        this.id_catg_empresa = id_catg_empresa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_modif() {
        return fecha_modif;
    }

    public void setFecha_modif(String fecha_modif) {
        this.fecha_modif = fecha_modif;
    }
    
    
}
