
package modelo;

/**
 *Nombre:Publicacion
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Publicacion {
    private int id; 
    private String publicacion;
    private String hora;
    private String usuario_id;
    private String fecha_creacion;
    private String hora_creacion;
    private String fecha_modif;
    private String hora_modif;
    private String estado;

    public Publicacion() {
    }

    public Publicacion(int id, String publicacion, String hora, String usuario_id, String fecha_creacion, String hora_creacion, String fecha_modif, String hora_modif, String estado) {
        this.id = id;
        this.publicacion = publicacion;
        this.hora = hora;
        this.usuario_id = usuario_id;
        this.fecha_creacion = fecha_creacion;
        this.hora_creacion = hora_creacion;
        this.fecha_modif = fecha_modif;
        this.hora_modif = hora_modif;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getHora_creacion() {
        return hora_creacion;
    }

    public void setHora_creacion(String hora_creacion) {
        this.hora_creacion = hora_creacion;
    }

    public String getFecha_modif() {
        return fecha_modif;
    }

    public void setFecha_modif(String fecha_modif) {
        this.fecha_modif = fecha_modif;
    }

    public String getHora_modif() {
        return hora_modif;
    }

    public void setHora_modif(String hora_modif) {
        this.hora_modif = hora_modif;
    }
    
    
}
