
package com.dao;

import com.conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cursos_estudios;
import modelo.Experiencia_laboral;
import modelo.Operaciones;

/**
 *Nombre:DAOExperiencia_laboral
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class DAOExperiencia_laboral implements Operaciones {
    Conexion db = new Conexion();
    Experiencia_laboral ex = new Experiencia_laboral();
    @Override
    public boolean insertar(Object obj) {
        ex = (Experiencia_laboral) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into experiencia_laboral (empresa,cargo,tiempolaborado,descripcion,salario,fecha_creacion,fecha_modif,estado) values (?,?,?,?,?,?,?,?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, ex.getEmpresa());
            pst.setString(2, ex.getCargo());
            pst.setString(3, ex.getTiempolaborado());
            pst.setString(4, ex.getDescripcion());
            pst.setString(5, ex.getSalario());
            pst.setString(6, ex.getFecha_creacion());
            pst.setString(7, ex.getFecha_modif());
            pst.setInt(8, ex.getEstado());
            
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
        ex = (Experiencia_laboral) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update experiencia_laboral set empresa=?,cargo=?,tiempolaborado=?,descripcion=?,salario=?, fecha_creacion=?, fecha_modif=?, estado= ? where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, ex.getEmpresa());
            pst.setString(2, ex.getCargo());
            pst.setString(3, ex.getTiempolaborado());
            pst.setString(4, ex.getDescripcion());
            pst.setString(5, ex.getSalario());
            pst.setString(6, ex.getFecha_creacion());
            pst.setString(7, ex.getFecha_modif());
            pst.setInt(8, ex.getEstado());
            pst.setInt(9, ex.getId());
            
            
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
        ex = (Experiencia_laboral) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update experiencia_laboral set estado=0 where id = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, ex.getId());
            
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
        String sql = "select * from experiencia_laboral";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                Object[] rows = new Object[9];
                for (int i = 0; i <=8; i++) {
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
