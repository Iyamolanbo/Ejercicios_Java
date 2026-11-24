/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospersonales.Clases;

/**
 *
 * @author bombe
 */
public class Fraccion {
    
    //Atributos ////////
    double numerador;
    double denominador;
    double media;
    
    
    //Constructores ////////
    public Fraccion(){
    }
    
    public Fraccion(double nume, double deno){
        this.numerador = nume;
        this.denominador = deno;
        this.media = 1;
    }
    
    //Métodos y Funciones   ////////  
    public void cogerValor(double val1, double val2){
        this.numerador = val1;
        this.denominador = val2;
    }
    
    public void invertir(double val1, double val2){
        this.numerador = val2;
        this.denominador = val1;
    }
    
    public void mostrar(){
        System.out.println("Los datos de la fraccion son:");
        System.out.println("============================");
        System.out.println("Numerador: "+numerador);
        System.out.println("Denominador: "+denominador);
    }
    
    
    
    
    
    
    
    
    
}
