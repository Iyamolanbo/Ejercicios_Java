/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Coche {
    //Atributos /////////////////////
    String marca;
    String modelo;
    double kilometros;
    
    //Constructores /////////////////////
    public Coche(String marca, String modelo, double kilometros){
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }
    

    //Métodos y Funciones ///////////////////// 
    public void recorrer(double km){
        this.kilometros = kilometros+km;
    }
    
    public void mostrar(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Kilómetros: "+kilometros);
    }
    
}
