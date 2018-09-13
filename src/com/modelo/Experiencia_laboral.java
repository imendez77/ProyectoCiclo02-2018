
package modelo;

/**
 *Nombre:Experiencia_laboral
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Experiencia_laboral {
    private int id;
    private String empresa;
    private String cargo;
    private String tiempolaborado;
    private String descripcion;
    private String salario;
    private String fecha_creacion;
    private String fecha_modif;
    private int estado;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(int id, String empresa, String cargo, String tiempolaborado, String descripcion, String salario, String fecha_creacion, String fecha_modif, int estado) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.tiempolaborado = tiempolaborado;
        this.descripcion = descripcion;
        this.salario = salario;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTiempolaborado() {
        return tiempolaborado;
    }

    public void setTiempolaborado(String tiempolaborado) {
        this.tiempolaborado = tiempolaborado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
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
