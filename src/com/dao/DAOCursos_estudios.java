
package com.dao;

import com.conexion.Conexion;
import java.util.ArrayList;
import modelo.Operaciones;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Categoria_profesional;
import modelo.Cursos_estudios;

/**
 *Nombre:DAOCursos_estudios
 * Version:1.0
 * Fecha:06/09/2018
 * CopyRight:ITCA
 * @author Javier González
 */
public class DAOCursos_estudios implements Operaciones{
    Conexion db = new Conexion();
    Cursos_estudios cu = new Cursos_estudios();
    
    @Override
    public boolean insertar(Object obj) {
        cu = (Cursos_estudios) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into cursos_estudios (estudio_cursado,nivel_curso,lugar_estudios,estado_curso,descripcion_curso,fecha_creacion,fecha_modif,estado) values (?,?,?,?,?,?,?,?)";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, cu.getEstudio_cursado());
            pst.setString(2, cu.getNivel_curso());
            pst.setString(3, cu.getLugar_estudios());
            pst.setString(4, cu.getEstado_curso());
            pst.setString(5, cu.getDescripcion_curso());
            pst.setString(6, cu.getFecha_creacion());
            pst.setString(7, cu.getFecha_modif());
            pst.setInt(8, cu.getEstado());
            
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
        cu = (Cursos_estudios) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update cursos_estudios set estudio_cursado=?,nivel_curso=?,lugar_estudios=?,estado_curso=?,descripcion_curso=?, fecha_creacion=?, fecha_modif=?, estado= ? where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setString(1, cu.getEstudio_cursado());
            pst.setString(2, cu.getNivel_curso());
            pst.setString(3, cu.getLugar_estudios());
            pst.setString(4, cu.getEstado_curso());
            pst.setString(5, cu.getDescripcion_curso());
            pst.setString(6, cu.getFecha_creacion());
            pst.setString(7, cu.getFecha_modif());
            pst.setInt(8, cu.getEstado());
            pst.setInt(9, cu.getId());
            
            
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
        cu = (Cursos_estudios) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update cursos_estudios set estado=0 where id = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, cu.getId());
            
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
        String sql = "select * from cursos_estudios";
        
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
