/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josed
 */
import java.util.ArrayList;

public class Veterinario extends Persona{ //Hereda de Persona
    private String especialidad;
    private ArrayList<Citas> asignarCita;
    private ArrayList<Tratamientos> tratamientos;
    
    
    //Llamada al construtor de la clase Persona
    public Veterinario(String nombre, String identidad, String telefono, String correo, String especialidad){
        super (nombre, identidad, telefono, correo);
        this.especialidad = especialidad;
        this.asignarCita = new ArrayList<>(); 
        this.tratamientos = new ArrayList<>();
    }
    //Metodos
    // Creacion se Getter para ver agenda
    public ArrayList<Citas> getAsignarCita(){
        return asignarCita;
    }
    
    //Metodo para agendar citas
    public void agendarCitas (Citas cita){
        this.asignarCita.add(cita);  
    }
    
    //Registrar tratamientos
    public void registrarTratamientos(Tratamientos tratamientos){
        this.tratamientos.add(tratamientos);  
    }
    
}
    
    

