/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Semaforo {
    //Atributos /////////////////////
    String color;
    
    //Constructores /////////////////////
    public Semaforo(String color){
        //this.color = color;
        String mayus = color.toUpperCase();
        if((!mayus.equals("ROJO"))&&(!mayus.equals("AMARILLO"))&&(!mayus.equals("VERDE"))){
            this.color = "ROJO";
        } else{
            this.color = color.toUpperCase();
        }
    }
    
    
    //Métodos y Funciones ///////////////////// 
    public void cambiarSiguiente(){
        String color = this.color;
        if(color.equals("ROJO")){
            this.color = "VERDE";
        } else if(color.equals("VERDE")){
            this.color = "AMARILLO";
        } else if(color.equals("AMARILLO")){
            this.color = "ROJO";
        }
    }
    
    
    public void mostrar(){
        System.out.println("El estado del semáforo es: "+this.color);
        System.out.println("");
    }
    
    
}
