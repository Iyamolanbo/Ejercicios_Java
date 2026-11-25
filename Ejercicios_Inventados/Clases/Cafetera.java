/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Cafetera {
    //Atributos /////////////////////
    int capacidadMaxima;
    int cantidadActual;
    
    //Constructores /////////////////////
    public Cafetera(int capMax){
        this.cantidadActual = 0;
        this.capacidadMaxima = capMax; 
    }
    
    //Métodos y Funciones ///////////////////// 
    public void llenar(int cantidad){
        if((this.cantidadActual+cantidad) <= this.capacidadMaxima){
            this.cantidadActual = this.cantidadActual+cantidad;
        } else{
            System.out.println("La cafetera está al máximo");
        }
    }
    
    public void servirTaza(int cantidad){
        if((this.cantidadActual-cantidad) < 0){
            System.out.println("Queda menos café de lo que se quiere servir");
            System.out.println("Le he servido: "+this.cantidadActual);
            this.cantidadActual = this.cantidadActual-this.cantidadActual;
        } else{
            this.cantidadActual = this.cantidadActual-cantidad;
        }
    }
    
    public void mostrarNivel(){
        System.out.println("Queda: "+this.cantidadActual+" en la cafetera");
        System.out.println("");
    }
    
    
    
    
    
}
