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
public class Clase {
    private String clase;
    private ArrayList<String> metodos = new ArrayList();
    private ArrayList<String> atributos = new ArrayList();

    public Clase(String clase) {
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ArrayList<String> getMetodos() {
        return metodos;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }
    

    @Override
    public String toString() {
        return "Clase{" + "clase=" + clase + ", metodos=" + metodos + ", atributos=" + atributos + '}';
    }
    
}
