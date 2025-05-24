/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josed
 */
public class Tratamientos {
    private Citas citaRelacionada;
    private String descripcion;
    private double costo;
    private String duracion;
    
    //Constructor
    public Tratamientos(Citas citaRelacionada, String descripcion, double costo, String duracion){
        this.citaRelacionada = citaRelacionada;
        this.descripcion = descripcion;
        this.costo = costo;
        this. duracion = duracion;            
    }
    
    //Getters y Setters
    //Cita Relacionada
    public Citas getCitaRelacionada(){
        return citaRelacionada;
    }
    
    public void setCitaRelacionada (Citas citaRelacionada){
        this.citaRelacionada = citaRelacionada;
    }
    
    //Descripcion
     public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Costo
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    //Duracion
    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    //Metodo para mostrar info del tratamiento usando ToString
    @Override
    public String toString(){ 
        return "tratamiento [Cita relacionada=" + citaRelacionada +
                " ,descripcio= " + descripcion +
                " ,costo=" + costo + 
                "duracion=" + duracion + "minutos";
    }
    
}
