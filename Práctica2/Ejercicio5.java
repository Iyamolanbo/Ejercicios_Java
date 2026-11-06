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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración de variables.
        int[] miArray = new int[5];
        int aleatorio = ((int)(Math.random()*(18-(-18)+1)+(-18)));
        int positivos = 0, negativos = 0, mediaPos = 0, mediaAritPos = 0;
        
        
        //Rellenar array.
        for(int i = 0; i < miArray.length; i++){
            miArray[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(18-(-18)+1)+(-18)));
        }
        
        
        //Recorrer array y contabilizar números postivos y negativos.
        for(int i = 0; i < miArray.length; i++){
            if(miArray[i] >= 0){
                positivos = positivos + miArray[i];
                mediaPos++;
            } else if(miArray[i] <= 0){
                negativos++;
            }
        }
        
        
        mediaAritPos = positivos/mediaPos;
        
        
        System.out.println("EJERCICIO 5: RECORRER ARRAY Y MOSTRAR ELEMENTOS");
        System.out.println("================================================");
        
        
        //Mostrar array y lanzar mensaje.  
        System.out.print("El array: ");
        System.out.println(Arrays.toString(miArray));
        
        System.out.println("Tiene una media de números positivos de: "+mediaAritPos);
        System.out.println("La cantidad total de números negativos es: "+negativos);
        
        
    }
    
}
