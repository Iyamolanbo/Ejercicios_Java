/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iyangamolonguaprac2;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración de variables.
        int[] miArray = new int[5];
        int[] miArrayDespl = new int[5];
        int aleatorio = ((int)(Math.random()*(30-5+1)+5));

        
        //Rellenar array.
        for(int i = 0; i < miArray.length; i++){
            miArray[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(30-5+1)+5));
        }
        
        
        //Rellenar el array desplazado.
        miArrayDespl[0] = miArray[(miArray.length)-1];  //Asignación manual de la primera posición.
        for(int i = 1; i < miArrayDespl.length; i++){
            miArrayDespl[i] = miArray[i-1];
        }
        
        
        System.out.println("EJERCICIO 7: ROTACIÓN CIRCULAR DE ARRAY");
        System.out.println("=======================================");
        
        
        //Mostrar array normal.  
        System.out.print("El array normal: ");
        System.out.println(Arrays.toString(miArray));
        
        
        //Mostrar array desplazado.  
        System.out.print("El array desplazado: ");
        System.out.println(Arrays.toString(miArrayDespl));
        
        
    }
    
}
