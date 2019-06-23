/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

import java.util.ArrayList;

/**
 *
 * @author mayci
 */
public class Auto extends Vehiculo {

    int cantPuertas;
    
    public Auto(){
        
        this.cantPuertas = 0;
    }
    
    public Auto(String marca, String modelo, double precio, int cantPuertas ){
        
        super.marca= marca; 
        super.modelo=modelo;
        super.precio=precio;
        this.cantPuertas=cantPuertas;
    }
    public int getCantPuertas() {
        return cantPuertas;
    }
    
    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
   
    public  ArrayList<Auto> almacenarVehiculo(Auto auto1, Auto auto2){
     
        ArrayList<Auto> arrayListAuto;
        arrayListAuto = new ArrayList<>();
        //set values
        auto1.setMarca("Peugeot");
        auto1.setModelo("206");
        auto1.setCantPuertas(4);
        auto1.setPrecio(200000.00);
        
        auto2.setMarca("Peugeot");
        auto2.setModelo("208");
        auto2.setCantPuertas(5);
        auto2.setPrecio(250000.00);
        //add to list
        arrayListAuto.add(auto1);
        arrayListAuto.add(auto2);
     
        return arrayListAuto;
    
    }

    @Override
    public ArrayList<Vehiculo> almacenarVehiculo(Vehiculo v1, Vehiculo v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
