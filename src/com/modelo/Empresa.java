
package modelo;

/**
 *Nombre:Empresa
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Empresa {
    
    private int id_empresa;
    private String descripcion;
    private String direccion;
    private String ciudad;
    private String mision;
    private String vision;
    private String contacto;
    private int id_categoria_e;
    private int id_usuario;
    private String fecha_creacion;
    private String fecha_modif;
    private int estado;

    public Empresa() {
    }

    public Empresa(int id_empresa, String descripcion, String direccion, String ciudad, String mision, String vision, String contacto, int id_categoria_e, int id_usuario, String fecha_creacion, String fecha_modif, int estado) {
        this.id_empresa = id_empresa;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.mision = mision;
        this.vision = vision;
        this.contacto = contacto;
        this.id_categoria_e = id_categoria_e;
        this.id_usuario = id_usuario;
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

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getId_categoria_e() {
        return id_categoria_e;
    }

    public void setId_categoria_e(int id_categoria_e) {
        this.id_categoria_e = id_categoria_e;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
