package com.dao;

import modelo.Operaciones;
import com.conexion.Conexion;
import com.modelo.Usuario;
import modelo.Profesional;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Operaciones;

/**
 *
 * @author Escanor
 */
public class DAOProfesional implements Operaciones{
    Conexion db = new Conexion();
    Profesional pro = new Profesional();
    @Override
    public boolean insertar(Object obj) {
        
        pro = (Profesional) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into profesional(id_usuario,nombres,apellidos,genero,direccion,objetivos,capacidades,intereses,disponibilidad,email_contacto,id_habilidad,id_profesion,id_cursos,id_experiencia,id_categoria,id_idiomas,estado,fecha_creacion) values (?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?.?,?,?, now())";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
           
            pst.setInt(1, pro.getId_usuario());
            pst.setString(2, pro.getNombres());
            pst.setString(3, pro.getApellidos());
            pst.setString(4, pro.getGenero());
            pst.setString(5, pro.getDireccion());
            pst.setString(6, pro.getObjetivos());
            pst.setString(7, pro.getCapacidades());
            pst.setString(8, pro.getIntereses());
            pst.setString(9, pro.getDisponibilidad());
            pst.setString(10, pro.getEmail_contacto());
            pst.setInt(11, pro.getId_habilidad());
            pst.setInt(12, pro.getId_profesion());
            pst.setInt(13, pro.getId_cursos());
            pst.setInt(14, pro.getId_experiencia());
            pst.setInt(15, pro.getId_categoria());
            pst.setInt(16, pro.getId_idiomas());
            pst.setInt(17, pro.getEstado());
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
        pro = (Profesional) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update profesional set id_usuario=?, nombres=?, apellidos=?, genero=?, direccion=?,objetivos=?,capacidades=?,intereses=?,disponibilidad=?,email_contacto=?,id_habilidad=?,id_profesion=?,id_cursos=?,id_experiencia=?,id_categoria=?,id_idiomas?=,estado=?,fecha_modif=now()  where id=?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
           
            pst.setInt(1, pro.getId_usuario());
            pst.setString(2, pro.getNombres());
            pst.setString(3, pro.getApellidos());
            pst.setString(4, pro.getGenero());
            pst.setString(5, pro.getDireccion());
            pst.setString(6, pro.getObjetivos());
            pst.setString(7, pro.getCapacidades());
            pst.setString(8, pro.getIntereses());
            pst.setString(9, pro.getDisponibilidad());
            pst.setString(10, pro.getEmail_contacto());
            pst.setInt(11, pro.getId_habilidad());
            pst.setInt(12, pro.getId_profesion());
            pst.setInt(13, pro.getId_cursos());
            pst.setInt(14, pro.getId_experiencia());
            pst.setInt(15, pro.getId_categoria());
            pst.setInt(16, pro.getId_idiomas());
            pst.setInt(17, pro.getEstado());
            pst.setInt(18, pro.getId());
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
        pro = (Profesional) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update profesional set estado=0 where id = ?";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            
             pst.setInt(21, pro.getId());
            
            int row = pst.executeUpdate();
            
            if(row>0)
            {
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar: "+e.getMessage(), "ERROR", 0);
            return false;
        }
    }
    public ArrayList<Object[]> mostrar() {
        ArrayList<Object[]> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from profesional";
        
        try 
        {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                Object[] rows = new Object[19];
                for (int i = 0; i < 18; i++) {
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
