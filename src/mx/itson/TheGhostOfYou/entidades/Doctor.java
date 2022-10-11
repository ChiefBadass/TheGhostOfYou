/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.TheGhostOfYou.entidades;

/**
 * Atributos de un Doctor.
 * @author Carlos Daniel Rebollo Toledo
 */
public class Doctor {
    private String nombre;
    private String especialidad;
    private int cedudaProfecional;
    private String universidad;

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
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the cedudaProfecional
     */
    public int getCedudaProfecional() {
        return cedudaProfecional;
    }

    /**
     * @param cedudaProfecional the cedudaProfecional to set
     */
    public void setCedudaProfecional(int cedudaProfecional) {
        this.cedudaProfecional = cedudaProfecional;
    }

    /**
     * @return the universidad
     */
    public String getUniversidad() {
        return universidad;
    }

    /**
     * @param universidad the universidad to set
     */
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
}
