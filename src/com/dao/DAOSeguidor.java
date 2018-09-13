package com.dao;

import modelo.Operaciones;
import com.conexion.Conexion;
import modelo.Seguidor;
import com.modelo.Usuario;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Escanor
 */
public class DAOSeguidor implements Operaciones{
    Conexion db = new Conexion();
    Seguidor se = new Seguidor();

    @Override
    public boolean insertar(Object obj) {
        se = (Seguidor) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into seguidor(id_usuario,id_seguidor,tipo,fecha_creacion,estado) values (?, ?, ?, now(), ?, ?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, se.getId_usuario());
            pst.setInt(2, se.getId_seguidor());
            pst.setString(3, se.getTipo());
            pst.setInt(4, se.getEstado());
            
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
        se = (Seguidor) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update seguidor set id_usuario=?, id_seguidor=?, tipo=?, fecha_modif=now(), estado= ? where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, se.getId_usuario());
            pst.setInt(2, se.getId_seguidor());
            pst.setString(3, se.getTipo());
            pst.setInt(4, se.getEstado());
            pst.setInt(5, se.getId());
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
            JOptionPane.showMessageDialog(null, "Error al Modificar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        se = (Seguidor) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update seguidor set estado=0 where id_user = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, se.getId());
            
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
            JOptionPane.showMessageDialog(null, "Error al Eliminar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }
    public ArrayList<Object[]> mostrar() {
        ArrayList<Object[]> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from seguidor";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                Object[] rows = new Object[6];
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
    @Override
    public ArrayList<Object[]> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
