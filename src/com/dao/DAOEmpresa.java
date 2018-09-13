
package com.dao;

import com.conexion.Conexion;
import java.util.ArrayList;
import modelo.Operaciones;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Experiencia_laboral;

/**
 *Nombre:DAOEmpresa
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class DAOEmpresa implements Operaciones{
    Conexion db = new Conexion();
    Empresa emp = new Empresa();
    @Override
    public boolean insertar(Object obj) {
        emp = (Empresa) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into empresa (descripcion,direccion,ciudad,mision,vision,contacto,id_categoria_e,id_usuario,fecha_creacion,fecha_modif,estado) values (?,?,?,?,?,?,?,?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, emp.getDescripcion());
            pst.setString(2, emp.getDireccion());
            pst.setString(3, emp.getCiudad());
            pst.setString(4, emp.getMision());
            pst.setString(5, emp.getVision());
            pst.setString(6, emp.getContacto());
            pst.setString(7, emp.getFecha_creacion());
            pst.setString(8, emp.getFecha_modif());
            pst.setInt(9, emp.getEstado());
            
            int row = pst.executeUpdate();
            
            if(row>0)
            {
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
         emp = (Empresa) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update empresa set descripcion=?,direccion=?,ciudad=?,mision=?,vision=?,contacto=?, fecha_creacion=?, fecha_modif=?, estado= ? where id_empresa=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, emp.getDescripcion());
            pst.setString(2, emp.getDireccion());
            pst.setString(3, emp.getCiudad());
            pst.setString(4, emp.getMision());
            pst.setString(5, emp.getVision());
            pst.setString(5, emp.getContacto());
            pst.setString(6, emp.getFecha_creacion());
            pst.setString(7, emp.getFecha_modif());
            pst.setInt(8, emp.getEstado());
            pst.setInt(9, emp.getId_empresa());
            
            
            int row = pst.executeUpdate();
            
            if(row>0)
            {
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        emp = (Empresa) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update empresa set estado=0 where id_empresa = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, emp.getId_empresa());
            
            int row = pst.executeUpdate();
            
            if(row>0)
            {
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> consultar() {
        ArrayList<Object[]> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from empresa";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                Object[] rows = new Object[12];
                for (int i = 0; i <=11; i++) {
                    rows[i] = rs.getObject(i+1);
                }
                datos.add(rows);
            }
            con.close();
        } 
        catch (SQLException | ClassNotFoundException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Mostrar: "+e.getMessage(), "ERROR", 0);
        }
        finally
        {
            return datos;
        }
    }
    
}
