
package com.dao;
import modelo.Operaciones;
import com.conexion.Conexion;
import com.modelo.Usuario;
import modelo.Profesion;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Escanor
 */
public class DAOProfesion implements Operaciones{
    Conexion db = new Conexion();
    Profesion Prof = new Profesion();

    @Override
    public boolean insertar(Object obj) {
    Prof = (Profesion) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into profesion values (0, ?,now(), ?,?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(2, Prof.getId());
            pst.setString(3, Prof.getProfesion());
            pst.setString(4, Prof.getFecha_creacion());
            pst.setInt(5, Prof.getEstado());
            
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
        Prof = (Profesion) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update Profesion set profesion=?,fecha_modif= now(),fecha_modif=?,estado=?, where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, Prof.getProfesion());
            pst.setString(2, Prof.getFecha_creacion());
            pst.setString(3, Prof.getFecha_modif());
            pst.setInt(4, Prof.getEstado());
            pst.setInt(6, Prof.getId());
            
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
        Prof = (Profesion) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update profesion set estado=0 where id = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, Prof.getId());
            
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
        String sql = "select * from profesion";
        
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
