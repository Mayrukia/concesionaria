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


public class Moto extends Vehiculo{
    String cilindrada;

    public Moto(){
        this.cilindrada = "";
    }
     
    public Moto(String marca, String modelo, double precio, String cilindrada ){
        super.marca= marca;
        super.modelo=modelo;
        super.precio=precio;
        this.cilindrada = cilindrada;
    }
    
    public String getCilindrada() {
        return cilindrada;
    }
    ArrayList<Moto> arrayListMoto= new ArrayList<Moto>();

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

   public ArrayList<Moto> almacenarVehiculo(Moto moto1, Moto moto2){
     
        ArrayList<Moto> arrayListMoto;
        arrayListMoto = new ArrayList<>();
        //set values
        moto1.setMarca("Honda");
        moto1.setModelo("Titan");
        moto1.setCilindrada("125c");
        moto1.setPrecio(60000.00);
        moto2.setMarca("Yamaha");
        moto2.setModelo("YBR");
        moto2.setCilindrada("160c");
        moto2.setPrecio(80500.50);
        //add to list
        arrayListMoto.add(moto1);
        arrayListMoto.add(moto2);
        
        return arrayListMoto;
   }

    @Override
    public ArrayList<Vehiculo> almacenarVehiculo(Vehiculo v1, Vehiculo v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
