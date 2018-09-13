
package com.dao;

import com.conexion.Conexion;
import com.modelo.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Categoria_empresa;
import modelo.Operaciones;
import java.sql.*;

/**
 *Nombre:DAOCategoria_empresa
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class DAOCategoria_empresa implements Operaciones{
    Conexion db = new Conexion();
    Categoria_empresa catE = new Categoria_empresa();
    @Override
    public boolean insertar(Object obj) {
        catE = (Categoria_empresa) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into categoria_empresa (categoria,descripcion,fecha_creacion,fecha_modif,estado) values (?,?,?,?,?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, catE.getCategoria());
            pst.setString(2, catE.getDescripcion());
            pst.setString(3, catE.getFecha_creacion());
            pst.setString(4, catE.getFecha_modif());
            pst.setInt(5, catE.getEstado());
            
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
        catE = (Categoria_empresa) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update categoria_empresa set categoria=?, descripcion=?, fecha_creacion=?, fecha_modif=?, estado= ? where id_catg_empresa=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, catE.getCategoria());
            pst.setString(2, catE.getDescripcion());
            pst.setString(3, catE.getFecha_creacion());
            pst.setString(4, catE.getFecha_modif());
            pst.setInt(5, catE.getEstado());
            pst.setInt(6, catE.getId_catg_empresa());
            
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
        catE = (Categoria_empresa) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update categoria_empresa set estado=0 where id_catg_empresa = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, catE.getId_catg_empresa());
            
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
        String sql = "select * from categoria_empresa";
        
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
