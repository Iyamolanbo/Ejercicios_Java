/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class ReservaHotel {
    //Atributos /////////////////////
    String huesped;
    int noches;
    double precioPorNoche;
    
    //Constructores /////////////////////
    public ReservaHotel(String cliente, int tiempo){
        this.huesped = cliente;
        this.noches = tiempo;
        this.precioPorNoche = 25.0d;
    }
    
    //Métodos y Funciones ///////////////////// 
    public double calcularImporteTotal(){
        double importe = this.noches*this.precioPorNoche;
        return importe;
    }
    
    public double aplicarDescuentoPorEstancia(){
        double descuento = 0.0d;
        double totalDescuento = 0.0d;
        if(this.noches >= 5){
            descuento = (15*this.calcularImporteTotal())/100;
            totalDescuento = this.calcularImporteTotal()-descuento;
        }
        return totalDescuento;
    }
    
    
}
