/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class CuentaAhorro {
    //Atributos /////////////////////
    String titular;
    double saldo;
    
    //Constructores /////////////////////
    public CuentaAhorro(){
    }
    
    public CuentaAhorro(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    //Métodos y Funciones /////////////////////
    public void ingresar(double cantidad){
        this.saldo = saldo+cantidad;
    }
    
    public void retirar(double cantidad){
        if(cantidad < this.saldo){
            this.saldo = saldo - cantidad;
        } else{
            System.out.println("No dispone de saldo suficiente para acometer la operación");
        }
    }
    
    public void mostrarSaldo(){
        System.out.println("El titular "+titular);
        System.out.println("Cuenta con "+saldo+" en su cuenta");
    }
    
            
            
            
            
            
            
            
            
}
