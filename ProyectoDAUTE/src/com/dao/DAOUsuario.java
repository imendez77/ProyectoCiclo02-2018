package com.dao;

import com.modelo.Operaciones;
import com.conexion.Conexion;
import com.modelo.Usuario;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Isra Méndez
 */
public class DAOUsuario implements Operaciones{
    Conexion db = new Conexion();
    Usuario user = new Usuario();
    
    @Override
    public boolean insertar(Object obj) {
        user = (Usuario) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into usuario values (0, ?, ?, ?, 1, ?, now(), 0)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(2, user.getEmail());
            pst.setString(3, user.getUsername());
            pst.setString(4, user.getPassword());
            pst.setInt(5, user.getId_rol());
            
            int row = pst.executeUpdate();
            
            if(row>0)
            {
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        user = (Usuario) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update usuario set email=?, username=?, pass=?, rol_id=?, fecha_modif= now() where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, user.getEmail());
            pst.setString(2, user.getUsername());
            pst.setString(3, user.getPassword());
            pst.setInt(4, user.getId_rol());
            pst.setInt(6, user.getId_user());
            
            int row = pst.executeUpdate();
            
            if(row>0)
            {
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        user = (Usuario) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update usuario set estado=0 where id_user = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, user.getId_user());
            
            int row = pst.executeUpdate();
            
            if(row>0)
            {
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> mostrar() {
        ArrayList<Object[]> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from usuario";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                Object[] rows = new Object[8];
                for (int i = 0; i < 8; i++) {
                    rows[i] = rs.getObject(i+1);
                }
                datos.add(rows);
            }
            con.close();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Mostrar: "+e.getMessage(), "ERROR", 0);
        }
        finally
        {
            return datos;
        }
    }
    
}
