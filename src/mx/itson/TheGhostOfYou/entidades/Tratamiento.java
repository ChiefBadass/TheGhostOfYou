/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.TheGhostOfYou.entidades;

import java.util.List;

/**
 * Atributos de un Tratamiento.
 * @author Carlos Daniel Rebollo Toledo
 */
public class Tratamiento {
    private String nombre;
    private String instruccion;
    private int orden;
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the instruccion
     */
    public String getInstruccion() {
        return instruccion;
    }

    /**
     * @param instruccion the instruccion to set
     */
    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    /**
     * @return the orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    
    
}
