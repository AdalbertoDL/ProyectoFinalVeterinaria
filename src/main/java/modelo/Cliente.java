package modelo;

import java.util.ArrayList;

//Clase cliente
public class Cliente extends Persona {
    private String direccion;
    private final ArrayList<Mascotas> mascotas; // Creacion de lista para mascotas
    
        //Llamada del constructor de la clase padre
    public Cliente(String nombre, String identidad, String telefono, String correo, String direccion){
        super(nombre, identidad, telefono, correo); // llamada al constructor de la clase padre
        this.direccion = direccion; // atributos propios de la clase cliente
        this.mascotas = new ArrayList<>(); // array de la clase cliente
    }
    
    //Metodos
    
    //Agregar una mascota
    public void agregarMascota (Mascotas mascota){
       this.mascotas.add(mascota);
    }
    
    // Metodo para listar todas las mascotas (mostrar info)
    public void listarMascotas() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            for (Mascotas m : mascotas) {
                System.out.println(m); // asumiendo que Mascota tiene un toString() bien definido
            }
        }
    }
      
    //Get y Set para direccion
    public  String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    //Array de mascotas
    public ArrayList<Mascotas> getMascotas(){
        return mascotas;
    }
    //public void setMascotas(ArrayList<Mascotas> mascotas){
        //this.mascotas = mascotas;
    //}  
}
