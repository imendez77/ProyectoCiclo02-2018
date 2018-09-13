
package modelo;

/**
 *Nombre:Habilidades
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Habilidades {
    private int id;
    private String habilidad;
    private String descripcion;
    private String fecha_creacion;
    private String fecha_modif;
    private int estado;

    public Habilidades() {
    }

    public Habilidades(int id, String habilidad, String descripcion, String fecha_creacion, String fecha_modif, int estado) {
        this.id = id;
        this.habilidad = habilidad;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
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
