
package com.dao;

import com.conexion.Conexion;
import java.util.ArrayList;
import modelo.Operaciones;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Categoria_empresa;
import modelo.Categoria_profesional;

/**
 *Nombre:DAOCategoriaProfesional
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class DAOCategoriaProfesional implements Operaciones{
    Conexion db = new Conexion();
    Categoria_profesional catP = new Categoria_profesional();
    @Override
    public boolean insertar(Object obj) {
        catP = (Categoria_profesional) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into categoria_profesional (nombre,fecha_creacion,fecha_modif,estado) values (?,?,?,?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, catP.getNombre());
            pst.setString(2, catP.getFecha_creacion());
            pst.setString(3, catP.getFecha_modif());
            pst.setInt(4, catP.getEstado());
            
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
        catP = (Categoria_profesional) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update categoria_profesional set nombre=?, fecha_creacion=?, fecha_modif=?, estado= ? where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, catP.getNombre());
            pst.setString(2, catP.getFecha_creacion());
            pst.setString(3, catP.getFecha_modif());
            pst.setInt(4, catP.getEstado());
            pst.setInt(5, catP.getId());
            
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
        catP = (Categoria_profesional) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update categoria_profesional set estado=0 where id = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, catP.getId());
            
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
        String sql = "select * from categoria_profesional";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                Object[] rows = new Object[5];
                for (int i = 0; i <=4; i++) {
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
