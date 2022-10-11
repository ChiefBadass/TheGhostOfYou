/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.TheGhostOfYou.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.TheGhostOfYou.entidades.Doctor;
import mx.itson.TheGhostOfYou.entidades.Paciente;
import mx.itson.TheGhostOfYou.entidades.Tratamiento;
import mx.itson.TheGhostOfYou.enumeradores.Sexo;

/**
 * Asignacion de valores e imprimirlos.
 * @author Carlos Daniel Rebollo Toledo
 */
public class Main {
     public static void main(String[] args) {
         Doctor doctor = new Doctor();
         doctor.setNombre("Dr. Asael Armenta Herrera.");
         doctor.setEspecialidad("Medico Cirujano");
         doctor.setCedudaProfecional(7215530);
         doctor.setUniversidad("UNIVERSIDAD AUTONOMA DE SINALOA");
         
         Paciente paciente = new Paciente();
         paciente.setNombre("Carlos Rebollo");
         paciente.setEdad(19);
         paciente.setSexo(Sexo.MASCULINO);
         paciente.setEnfermedad("Diarrea y gastroenteritis de presunto origen infeccioso");
         paciente.setExpediente(420);
         
         List<Tratamiento> tratamiento = new ArrayList<>();
         Tratamiento tratamiento1 = new Tratamiento();
         tratamiento1.setOrden(1);
         tratamiento1.setNombre("LACTOBACILOS FORTE SIMIBACILOS CAPSULAS 1666 MILLONES UFC.");
         tratamiento1.setInstruccion("1 Tableta cada 8 horas durante 3 dias. Via de administración oral");
         tratamiento.add(tratamiento1);
         
         Tratamiento tratamiento2 = new Tratamiento();
         tratamiento2.setOrden(2);
         tratamiento2.setNombre("PINAVERD / DIMETICONA CAPSILAS 100 MG/300MG.");
         tratamiento2.setInstruccion("1 Tableta cada 8 horas durante 3 dias. Via de administración oral");
         tratamiento.add(tratamiento2);
         
         Tratamiento tratamiento3 = new Tratamiento();
         tratamiento3.setOrden(3);
         tratamiento3.setNombre("CEFALEXINA CAPSULAS 500MG.");
         tratamiento3.setInstruccion("1 Tableta cada 8 horas durante 7 dias. Via de administración oral");
         tratamiento.add(tratamiento3);
         
         paciente.setTratamiento(tratamiento);
         
         System.out.println("****RECETA MEDICA****");
         System.out.println(doctor.getNombre());
         System.out.println(doctor.getEspecialidad()+"   CED. PROF. "+doctor.getCedudaProfecional());
         System.out.println(doctor.getUniversidad());
         System.out.println("-------------------------------------------------------------------------------------------");
         System.out.println("Paciente: "+paciente.getNombre()+"              Número de expediente: "+paciente.getExpediente());
         System.out.println("Sexo: "+paciente.getSexo()+"                       Edad: "+paciente.getEdad()+" años");
         System.out.println("Enfermedad: "+paciente.getEnfermedad());
         System.out.println("-------------------------------------------------------------------------------------------");
         System.out.println("TRATAMIENTO");
         for(Tratamiento t : paciente.getTratamiento()){
             System.out.println(t.getOrden()+".- "+t.getNombre());
             System.out.println("  "+t.getInstruccion());
         }
         
         
         
     }
}
