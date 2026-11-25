/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Termostato {
    //Atributos /////////////////////
    double tempertaturaActual;
    double temperaturaObjetivo;
    
    //Constructores /////////////////////
    public Termostato(double temperatura1, double temperatura2){
        this.tempertaturaActual = temperatura1;
        this.temperaturaObjetivo = temperatura2;
    }
    
    //Métodos y Funciones ///////////////////// 
    public void ajustarHaciaObjetivo(){
        if(this.tempertaturaActual > this.temperaturaObjetivo){
            this.tempertaturaActual = this.tempertaturaActual-1;
        } else{
            this.tempertaturaActual = this.tempertaturaActual+1;
        }
    }
    
    public void mostrar(){
        System.out.println("La temperatura actual es: "+this.tempertaturaActual);
        System.out.println("La temperatura objetivo es: "+this.temperaturaObjetivo);
        System.out.println("");
    }
    
}
