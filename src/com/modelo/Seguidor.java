
package modelo;

/**
 *Nombre:Seguidor
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Seguidor {
    
    private int id;
    private int id_usuario;
    private int id_seguidor;
    private String tipo;
    private String fecha_creacion;
    private String fecha_modif;
    private int estado;

    public Seguidor() {
    }

    public Seguidor(int id, int id_usuario, int id_seguidor, String tipo, String fecha_creacion, String fecha_modif, int estado) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_seguidor = id_seguidor;
        this.tipo = tipo;
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

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_seguidor() {
        return id_seguidor;
    }

    public void setId_seguidor(int id_seguidor) {
        this.id_seguidor = id_seguidor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
