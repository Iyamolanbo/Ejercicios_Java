/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Producto {
    //Atributos /////////////////////
    String nombre;
    double precio;
    int stock;
    
    
    //Constructores /////////////////////
    public Producto(){
    }
    
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Métodos y Funciones ///////////////////// 
    public double calcularValorTotal(double precio, int stock){
        double valorTotal = precio * (double) stock;
        return valorTotal;
    }
    
}
