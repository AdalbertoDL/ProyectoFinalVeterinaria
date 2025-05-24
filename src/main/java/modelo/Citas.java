/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josed
 */
import java.time.LocalDateTime; // importacion de clase del paquete java que toma la hora y fecha del sistema
//Creacion de la clase citas
public class Citas {
    private Mascotas mascota; // Referencia a la clase mascotas
    private Veterinario veterinario; // referencia a la clase verterinario
    private LocalDateTime fechaHora; // clase del paquete java
    private String motivoCita;
    private String estado;
    private String diagnostico;  
    
    //Creacion del constructor
    public Citas(Mascotas mascota, Veterinario veterinario, LocalDateTime fechaHora, String motivo, String estado, String diagnostico){
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fechaHora = fechaHora;
        this.estado = "Pendiente";  
        this.diagnostico = diagnostico;
    }
    
    //Metodos
    //getter y Setter
    //Mascotas
    public Mascotas getMascotas(){
        return mascota;
    }
    
    public void setMascotas (Mascotas mascota){
        this.mascota = mascota;
    }
    
    
    //Veterinario
    public Veterinario getVeterinario(){
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    // Fecha y Hora
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    // Motivo Cita
    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivo) {
        this.motivoCita = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // Diagnostico
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;

    }
    
    
    //Confirmar cita
    public void confirmarCita(){
        this.estado = "Cita confirmada";
    }
    
    //Eliminar Cita
    public void eliminarCita(){
        this.estado = "Cita cancelada";
    }
    
    //Registar diagnositco
    public void registrarDiagnostico(String diagnostico){
        this.diagnostico = diagnostico;
    }
    
    //Mostrar info. de la cita por medio de un toString
    @Override
    public String toString(){
        return "cita [mascota= " + mascota.getNombre()+
                ", veterinario=" + veterinario.getNombre() + 
                ", fecha y Hora=" + fechaHora + 
                ", motivo de la cita=" + motivoCita +
                ", estado=" + estado +
                ", diagnostico=" + (diagnostico != null? diagnostico : "N/A")+ "]"; // operador ternario para mostrar si hay un diagnostico o no
    } 
    
    
}
