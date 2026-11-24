/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospersonales.Clases;

/**
 *
 * @author bombe
 */
public class Caballo {
    
    //Atributos ////////
    String nombre;
    String raza;
    int edad;
    String pelaje;
    char sexo;
    String chip;
    
    
    //Constructores ////////
    public Caballo(){
    }
    
    public Caballo(String nombre, String raza, int edad, String pelaje, char sexo, String chip){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
    }
    
    
    //Funciones y Métodos   ////////
    public void comer(){
        System.out.println("El caballo "+nombre+" come.");
    }
    
    public void dormir(){
        System.out.println("El caballo "+nombre+" duerme.");
    }
    
    public void mostrar(){
        System.out.println("Los datos sobre el caballo son:");
        System.out.println("==============================");
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su raza es: "+raza);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su pelaje es: "+pelaje);
        System.out.println("Su sexo es: "+sexo);
        System.out.println("Su número de chip es: "+chip);
        System.out.println("");
    }
    
    
    
    
    
    
    
}
