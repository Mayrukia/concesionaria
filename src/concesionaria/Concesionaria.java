/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;
import java.util.ArrayList;
/**
 *
 * @author mayra luengo
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /* crea dos autos y dos motos
     */    
   
        ArrayList<Auto> autos= new ArrayList<>();
       
        Auto automovil= new Auto();
        Auto auto1= new Auto();
        Auto auto2= new Auto();
        
        ArrayList<Moto> motos= new ArrayList<>();
        Moto motocicleta= new Moto();
        Moto moto1= new Moto();
        Moto moto2= new Moto();
   
    
    //almacenar en list
     
       autos= automovil.almacenarVehiculo(auto1, auto2);
       motos= motocicleta.almacenarVehiculo(moto1, moto2);
    //print
        System.out.println(autos.size());
       System.out.println("Marca: " + autos.get(0).getMarca() + " // " + "Modelo: " + autos.get(0).getModelo() + " // " + "Puertas: " 
             + autos.get(0).getCantPuertas() + " // " + "Precio: " + "$" + autos.get(0).getPrecio());
       System.out.println("Marca: " + motos.get(0).getMarca() + " // " + "Modelo: " + motos.get(0).getModelo() + " // " + "Cilindrada: " 
             + motos.get(0).getCilindrada() + " // " + "Precio: " + "$" + motos.get(0).getPrecio());
       System.out.println("Marca: " + autos.get(1).getMarca() + " // " + "Modelo: " + autos.get(1).getModelo() + " // " + "Puertas: " 
             + autos.get(1).getCantPuertas() + " // " + "Precio: " + "$" + autos.get(1).getPrecio());
        System.out.println("Marca: " + motos.get(1).getMarca() + " // " + "Modelo: " + motos.get(1).getModelo() + " // " + "Cilindrada: " 
             + motos.get(1).getCilindrada() + " // " + "Precio: " + "$" + motos.get(1).getPrecio());
        System.out.println("=============================");
        System.out.println("Vehìculo mas caro: " + automovil.vehiculoMasCaro(auto1, auto2, moto1, moto2));
        System.out.println("Vehìculo mas Barato: " + automovil.vehiculoMasBarato(auto1, auto2, moto1, moto2));
    
}
 
    
        
        
                
       
}
