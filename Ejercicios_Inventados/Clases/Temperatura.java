/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Temperatura {
    //Atributos /////////////////////
    double gradosCelsius;
    
    //Constructores /////////////////////
    public Temperatura(double grados){
        this.gradosCelsius = grados;
    }

    //Métodos y Funciones ///////////////////// 
    public double aFahrenheit(){
        double val = (this.gradosCelsius*9/5)+32;
        return val;
    }
    
    public double aKelvin(){
        double val = this.gradosCelsius+273.15;
        return val;
    }
    
}
