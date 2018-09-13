
package modelo;

/**
 *Nombre:Idiomas
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Idiomas {
    private int id;
    private String idioma;
    private String nivel;
    private String lugar_de_estudio;
    private String fecha_creacion;
    private String fecha_modif;
    private int estado;

    public Idiomas() {
    }

    public Idiomas(int id, String idioma, String nivel, String lugar_de_estudio, String fecha_creacion, String fecha_modif, int estado) {
        this.id = id;
        this.idioma = idioma;
        this.nivel = nivel;
        this.lugar_de_estudio = lugar_de_estudio;
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getLugar_de_estudio() {
        return lugar_de_estudio;
    }

    public void setLugar_de_estudio(String lugar_de_estudio) {
        this.lugar_de_estudio = lugar_de_estudio;
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
