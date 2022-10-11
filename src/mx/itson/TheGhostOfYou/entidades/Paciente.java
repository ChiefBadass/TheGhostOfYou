/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.TheGhostOfYou.entidades;

import java.util.List;
import mx.itson.TheGhostOfYou.enumeradores.Sexo;

/**
 * Atributos de un Paciente.
 * @author Carlos Daniel Rebollo Toledo
 */
public class Paciente {

    
    private String nombre;
    private int edad;
    private int expediente;
    private Sexo sexo;
    private String enfermedad;
    private List<Tratamiento> tratamiento;

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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the expediente
     */
    public int getExpediente() {
        return expediente;
    }

    /**
     * @param expediente the expediente to set
     */
    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    /**
     * @return the tratamiento
     */
    public List<Tratamiento> getTratamiento() {
        return tratamiento;
    }

    /**
     * @param tratamiento the tratamiento to set
     */
    public void setTratamiento(List<Tratamiento> tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    /**
     * @return the enfermedad
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     * @param enfermedad the enfermedad to set
     */
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
}
