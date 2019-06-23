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

public abstract class Vehiculo {
   
   String marca, modelo;
   double precio;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
     public abstract ArrayList<Vehiculo> almacenarVehiculo(Vehiculo v1, Vehiculo v2);
     

   
    public String vehiculoMasCaro(Auto a1, Auto a2, Moto m3, Moto m4){
        //max       
        Vehiculo[] miList = {a1,a2,m3,m4};	
		double max;
                String marca="", modelo=""; 
 
		max=miList[0].getPrecio();
 
		for(int i = 0; i < miList.length; i++)
		{
			if(max<miList[i].getPrecio())
			{
				max=miList[i].getPrecio();
                                marca= miList[i].getMarca();
                                modelo=miList[i].getModelo();
			}
		}
       return marca + " " + modelo;
    }
        
       public String vehiculoMasBarato(Auto a1, Auto a2, Moto m3, Moto m4){
        //min       
        Vehiculo[] miList = {a1,a2,m3,m4};
		
		double min;
                String marca = "", modelo = "";
 
		min=miList[0].getPrecio();
 
		for(int i = 0; i < miList.length; i++)
		{
			if(min>miList[i].getPrecio())
			{
				min=miList[i].getPrecio();
                                marca= miList[i].getMarca();
                                modelo=miList[i].getModelo();
			}
		}
       return marca + " " + modelo;
    }
}
