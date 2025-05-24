/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josed
 */
// Creacion de la clase persona (Clase Padre)
public class Persona {
    private String nombre;
    private String identidad;
    private String telefono;
    private String correo;
    
    //Constructor
    public Persona(String nombre, String identidad, String telefono, String correo){
        this.nombre = nombre;
        this.identidad = identidad;
        this.telefono = telefono;
        this.correo = correo;   
    }
    
    //Metodos
    //Getters y Setters para ver y actualizar datos
    //nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //identidad
    public String getIdentidad(){
        return identidad;
    }
    public void setIdentidad(String identidad){
         this.identidad = identidad;
    }
    
    //telefono
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
        
    }
    
    //email
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    // Metodo para mostrar los datos
    
    public void mostrarDatos (){
    System.out.println("Nombre: " + getNombre());
    System.out.println("Identidad: " + getIdentidad());
    System.out.println("Teléfono: " + getTelefono());
    System.out.println("Correo: " + getCorreo());
    }
    
    // Metodo para actualizar los datos
    public void actualizarDatos(String nombre, String identidad, String telefono, String correo) {
    setNombre(nombre);
    setIdentidad(identidad);
    setTelefono(telefono);
    setCorreo(correo);
}
    
}
