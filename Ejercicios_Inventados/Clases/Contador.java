/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Contador {
    //Atributos /////////////////////
    int valor;
    
    //Constructores /////////////////////
    public Contador(){
        this.valor = 0;
    }
    
    public Contador(int valorInicial){
        this.valor = valorInicial;
    }
    
    //Métodos y Funciones ///////////////////// 
    public void incrementar(int valUsu){
        this.valor = valor+valUsu;
    }
    
    public void decrementar(int valUsu){
        this.valor = valor-valUsu;
    }
    
    public void resetear(){
        this.valor = 0;
    }
    
    public void mostrar(){
        System.out.println("Valor: "+valor);
    }
    
}
