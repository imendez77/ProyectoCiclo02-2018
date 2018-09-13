package com.modelo;

/**
 *
 * @author Isra Méndez
 */
public class Usuario {
    private int id_user;
    private String username;
    private String password;
    private String email;
    private int id_rol;

    public Usuario() {
    }

    public Usuario(int id_user, String username, String password, String email, int id_rol) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.email = email;
        this.id_rol = id_rol;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
    
    
}
