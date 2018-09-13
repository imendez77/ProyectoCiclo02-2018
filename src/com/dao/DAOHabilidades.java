
package com.dao;

import com.conexion.Conexion;
import java.util.ArrayList;
import modelo.Operaciones;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Categoria_empresa;
import modelo.Habilidades;

/**
 *Nombre:Habilidades
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class DAOHabilidades implements Operaciones{
    Conexion db = new Conexion();
    Habilidades ha = new Habilidades();
    @Override
    public boolean insertar(Object obj) {
        ha = (Habilidades) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into habilidades (habilidad,descripcion,fecha_creacion,fecha_modif,estado) values (?,?,?,?,?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, ha.getHabilidad());
            pst.setString(2, ha.getDescripcion());
            pst.setString(3, ha.getFecha_creacion());
            pst.setString(4, ha.getFecha_modif());
            pst.setInt(5, ha.getEstado());
            
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
        ha = (Habilidades) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update habilidades set habilidad=?, descripcion=?, fecha_creacion=?, fecha_modif=?, estado= ? where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, ha.getHabilidad());
            pst.setString(2, ha.getDescripcion());
            pst.setString(3, ha.getFecha_creacion());
            pst.setString(4, ha.getFecha_modif());
            pst.setInt(5, ha.getEstado());
            pst.setInt(6, ha.getId());
            
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
        ha = (Habilidades) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update habilidades set estado=0 where id = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, ha.getId());
            
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
        String sql = "select * from habilidades";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                Object[] rows = new Object[6];
                for (int i = 0; i <=5; i++) {
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
