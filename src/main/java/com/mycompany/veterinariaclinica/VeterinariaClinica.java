/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterinariaclinica;
import modelo.*;

/**
 *
 * @author josed
 */
public class VeterinariaClinica {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Creacion del objeto Cliente
        Cliente cliente1 = new Cliente ("Adalberto", "04717878-9", "7192-6920","jidiazlue@gmail.com", "Tercera avenida norte Caluco");
        
        //Creacion del objeto Mascota
        Mascotas mascota1 = new Mascotas ("Terry","Canis lupus Familiaris", "Pitbull", 3 );
        
        //Agregar una mascota a la lista del cliente
        cliente1.agregarMascota(mascota1);
        
        
    }
}
