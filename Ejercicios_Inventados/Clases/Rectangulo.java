/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Rectangulo {
    //Atributos /////////////////////
    double base;
    double altura;
    
    //Constructores /////////////////////
    public Rectangulo(){
    }
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    //Métodos y Funciones /////////////////////
    public double CalcularArea(double base, double altura){
        double area = base*altura;
        return area;
    }
    
    public double CalcularPerimetro(double base, double altura){
        double perimetro = (2*base)+(2*altura);
        return perimetro;
    }
    
    
}
