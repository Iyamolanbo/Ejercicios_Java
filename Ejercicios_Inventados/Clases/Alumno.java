/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Alumno {
    //Atributos /////////////////////
    String nombre;
    double notaMedia;
    
    //Constructores /////////////////////
    public Alumno(){
        this.nombre = "Sin nombre";
        this.notaMedia = 0.0;
    }
    
    public Alumno(String name, double calification){
        this.nombre = name;
        this.notaMedia = calification;
    }
        
    //Métodos y Funciones /////////////////////    
    public boolean estaAprobado(){
        boolean evaluation = true;
        if(this.notaMedia >= 5){
            evaluation = true;
        } else{
            evaluation = false;
        }
        return evaluation;
    }
    
    
    
}
