/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Lampara {
    //Atributos /////////////////////
    String color;
    boolean encendida;
    
    //Constructores /////////////////////
    public Lampara(){
        this.color = color;
        this.encendida = false;
    }
    
    //Métodos y Funciones ///////////////////// 
    public void encender(String color){
        this.color = color;
        encendida = true;
    }
    
    public void apagar(){
        this.color = "Ninguno";
        encendida = false;
    }
    
    public void mostrarEstado(){
        System.out.println("Color: "+color);
        System.out.println("Estado: "+encendida);
        System.out.println("");
    }
    
}
