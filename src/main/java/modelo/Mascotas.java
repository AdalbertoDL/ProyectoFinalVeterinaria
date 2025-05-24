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
    //Clase Mascota
public class Mascotas {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private ArrayList<HistorialMed> historialMed; //Historial medico
    private ArrayList<Citas> citas; // Crear lista de citas
    
    //Constructor
    
    public Mascotas (String nombre, String especie, String raza, int edad){
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.historialMed = new ArrayList<>();
    this.citas = new ArrayList<>();
     
    }
    
    // Metodo para agendar cita
    public void agendarCita (Citas cita){
        citas.add(cita);
    }
    
    // Metodo para actualizarDatos 

    public void actualizarDatos (String nuevoNombre, String nuevaEspecie, String nuevaRaza, int nuevaEdad){
        this.nombre = nuevoNombre;
        this.especie = nuevaEspecie;
        this.raza = nuevaRaza;
        this.edad = nuevaEdad;
    }
    
    //Metodo para mostrar datos
    public void mostrarDatos (){
        System.out.println("Nombre" + nombre);
        System.out.println("Especie" + especie);
        System.out.println("Raza" + raza);
        System.out.println("Edad" + edad);
        
        if (citas.isEmpty()){
            System.out.println("No hay citas agendadas.");
        } else{
            System.out.println("Citas agendadas:");
            for (Citas c : citas){
                System.out.println("-" + c.getDetalles()); 
            
            }
        
        }   
    }
   //Getter y Setter  
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public ArrayList<Citas> getCitas() { return citas; }


}
   
