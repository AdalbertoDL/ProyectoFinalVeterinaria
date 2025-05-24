/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josed
 */
//Creacion del historial medico
import java.time.LocalDate;

public class HistorialMedico {
    private LocalDate fecha; // desde la clase de java para tomar la fecha y hora del sistema
    private Veterinario veterinario; // De la clase veterinario
    private String diagnostico; // atributo de la clase
    private Tratamientos tratamiento; //De la clase tratamiento
    
    public HistorialMedico (LocalDate fecha, Veterinario veterinario, String diagnostico, Tratamientos tratamiento){
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    
    // Getters y Setters 
    //Fecha
    public LocalDate getFecha() {
        return fecha;
    }
    
    // Veterinario
    public Veterinario getVeterinario() {
        return veterinario;
    }

    //Diagnostico
    public String getDiagnostico() {
        return diagnostico;
    }

    
    public Tratamientos getTratamientos() {
        return tratamiento;
    }

    @Override
    public String toString() {
        return "HistorialMedico [" +
               "fecha=" + fecha +
               ", veterinario=" + veterinario.getNombre() +
               ", diagnostico='" + diagnostico + '\'' +
               ", tratamiento=" + tratamiento.getDescripcion() +
               ']';
    }
     
    
}



