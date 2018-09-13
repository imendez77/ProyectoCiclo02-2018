
package modelo;

/**
 *Nombre:Cursos_estudios
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Cursos_estudios {
    
    private int id;
    private String estudio_cursado;
    private String nivel_curso;
    private String lugar_estudios;
    private String estado_curso;
    private String descripcion_curso;
    private String fecha_creacion;
    private String fecha_modif;
    private int estado;

    public Cursos_estudios() {
    }

    public Cursos_estudios(int id, String estudio_cursado, String nivel_curso, String lugar_estudios, String estado_curso, String descripcion_curso, String fecha_creacion, String fecha_modif, int estado) {
        this.id = id;
        this.estudio_cursado = estudio_cursado;
        this.nivel_curso = nivel_curso;
        this.lugar_estudios = lugar_estudios;
        this.estado_curso = estado_curso;
        this.descripcion_curso = descripcion_curso;
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

    public String getEstudio_cursado() {
        return estudio_cursado;
    }

    public void setEstudio_cursado(String estudio_cursado) {
        this.estudio_cursado = estudio_cursado;
    }

    public String getNivel_curso() {
        return nivel_curso;
    }

    public void setNivel_curso(String nivel_curso) {
        this.nivel_curso = nivel_curso;
    }

    public String getLugar_estudios() {
        return lugar_estudios;
    }

    public void setLugar_estudios(String lugar_estudios) {
        this.lugar_estudios = lugar_estudios;
    }

    public String getEstado_curso() {
        return estado_curso;
    }

    public void setEstado_curso(String estado_curso) {
        this.estado_curso = estado_curso;
    }

    public String getDescripcion_curso() {
        return descripcion_curso;
    }

    public void setDescripcion_curso(String descripcion_curso) {
        this.descripcion_curso = descripcion_curso;
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
