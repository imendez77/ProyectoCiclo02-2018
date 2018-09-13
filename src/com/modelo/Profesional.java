
package modelo;

/**
 *Nombre:Profesional
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Profesional {
    
    private int id;
    private int id_usuario;
    private String nombres;
    private String apellidos;
    private String genero;
    private String direccion;
    private String objetivos;
    private String capacidades;
    private String intereses;
    private String disponibilidad;
    private String email_contacto;
    private int id_habilidad;
    private int id_profesion;
    private int id_cursos;
    private int id_experiencia;
    private int id_categoria;
    private int id_idiomas;
    private int estado;
    private String fecha_creacion;
    private String fecha_modif;

    public Profesional() {
    }

    public Profesional(int id, int id_usuario, String nombres, String apellidos, String genero, String direccion, String objetivos, String capacidades, String intereses, String disponibilidad, String email_contacto, int id_habilidad, int id_profesion, int id_cursos, int id_experiencia, int id_categoria, int id_idiomas, int estado, String fecha_creacion, String fecha_modif) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.direccion = direccion;
        this.objetivos = objetivos;
        this.capacidades = capacidades;
        this.intereses = intereses;
        this.disponibilidad = disponibilidad;
        this.email_contacto = email_contacto;
        this.id_habilidad = id_habilidad;
        this.id_profesion = id_profesion;
        this.id_cursos = id_cursos;
        this.id_experiencia = id_experiencia;
        this.id_categoria = id_categoria;
        this.id_idiomas = id_idiomas;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modif = fecha_modif;
    }

    public String getFecha_modif() {
        return fecha_modif;
    }

    public void setFecha_modif(String fecha_modif) {
        this.fecha_modif = fecha_modif;
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getCapacidades() {
        return capacidades;
    }

    public void setCapacidades(String capacidades) {
        this.capacidades = capacidades;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEmail_contacto() {
        return email_contacto;
    }

    public void setEmail_contacto(String email_contacto) {
        this.email_contacto = email_contacto;
    }

    public int getId_habilidad() {
        return id_habilidad;
    }

    public void setId_habilidad(int id_habilidad) {
        this.id_habilidad = id_habilidad;
    }

    public int getId_profesion() {
        return id_profesion;
    }

    public void setId_profesion(int id_profesion) {
        this.id_profesion = id_profesion;
    }

    public int getId_cursos() {
        return id_cursos;
    }

    public void setId_cursos(int id_cursos) {
        this.id_cursos = id_cursos;
    }

    public int getId_experiencia() {
        return id_experiencia;
    }

    public void setId_experiencia(int id_experiencia) {
        this.id_experiencia = id_experiencia;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_idiomas() {
        return id_idiomas;
    }

    public void setId_idiomas(int id_idiomas) {
        this.id_idiomas = id_idiomas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    
    
    
}
