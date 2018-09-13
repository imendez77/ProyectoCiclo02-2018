
package modelo;

/**
 *Nombre:Vacante
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class Vacante {
    
    private int id;
    private int id_empresa;
    private String puesto;
    private String area;
    private String tipo_contrato;
    private String exp_requerida;
    private String genero_requerido;
    private int edad_requerida;
    private double salario;
    private String vehiculo_requerido;
    private String ciudad;
    private String descripcion;
    private String fecha_creacion;
    private String fecha_modif;
    private int estado;

    public Vacante() {
    }

    public Vacante(int id, int id_empresa, String puesto, String area, String tipo_contrato, String exp_requerida, String genero_requerido, int edad_requerida, double salario, String vehiculo_requerido, String ciudad, String descripcion, String fecha_creacion, String fecha_modif, int estado) {
        this.id = id;
        this.id_empresa = id_empresa;
        this.puesto = puesto;
        this.area = area;
        this.tipo_contrato = tipo_contrato;
        this.exp_requerida = exp_requerida;
        this.genero_requerido = genero_requerido;
        this.edad_requerida = edad_requerida;
        this.salario = salario;
        this.vehiculo_requerido = vehiculo_requerido;
        this.ciudad = ciudad;
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

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public String getExp_requerida() {
        return exp_requerida;
    }

    public void setExp_requerida(String exp_requerida) {
        this.exp_requerida = exp_requerida;
    }

    public String getGenero_requerido() {
        return genero_requerido;
    }

    public void setGenero_requerido(String genero_requerido) {
        this.genero_requerido = genero_requerido;
    }

    public int getEdad_requerida() {
        return edad_requerida;
    }

    public void setEdad_requerida(int edad_requerida) {
        this.edad_requerida = edad_requerida;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getVehiculo_requerido() {
        return vehiculo_requerido;
    }

    public void setVehiculo_requerido(String vehiculo_requerido) {
        this.vehiculo_requerido = vehiculo_requerido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
