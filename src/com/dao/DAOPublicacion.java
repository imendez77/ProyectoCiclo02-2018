package com.dao;

import modelo.Operaciones;
import com.conexion.Conexion;
import modelo.Publicacion;
import com.modelo.Usuario;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Escanor
 */
public class DAOPublicacion implements Operaciones{
    Conexion db = new Conexion();
    Publicacion pu = new Publicacion();

    @Override
    public boolean insertar(Object obj) {
        pu = (Publicacion) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into publicacion(publicacion,hora,usuario_id,fecha_creacion,hora_creacion,estado) values ( ?, ?, ?, now(), ?,?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, pu.getPublicacion() );
            pst.setString(2, pu.getHora());
            pst.setString(3, pu.getUsuario_id());
            pst.setString(4, pu.getHora_creacion());
            pst.setString(5, pu.getEstado());
            
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
        pu = (Publicacion) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update publicacion set publicacion=?, hora=?, usuario_id=?, fecha_modif=now(), hora_modif=?,estado=? where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, pu.getPublicacion() );
            pst.setString(2, pu.getHora());
            pst.setString(3, pu.getUsuario_id());
            pst.setString(4, pu.getHora_creacion());
            pst.setString(5, pu.getEstado());
            pst.setInt(6, pu.getId());
            
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
        pu = (Publicacion) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update publicacion set estado=0 where id_user = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(6, pu.getId());
            
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
        String sql = "select * from publicacion";
        
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

    @Override
    public ArrayList<Object[]> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
