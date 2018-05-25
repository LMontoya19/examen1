/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author Inspiron
 */
public class usuario {
    String nombre;
    String edad;
    String email;
    String user;
    String contraseña;
    ArrayList<Clase> clases = new ArrayList();

    public usuario(String nombre, String edad, String email, String user, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.user = user;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", user=" + user + ", contrase\u00f1a=" + contraseña + ", clases=" + clases + '}';
    }

}
