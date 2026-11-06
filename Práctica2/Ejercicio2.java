/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iyangamolonguaprac2;

/**
 *
 * @author MEDAC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración de variables.
        int[] miArray = new int[4];
        int aleatorio = ((int)(Math.random()*(12-3+1)+3));
        boolean paridad = true;
        
        
        //Rellenar array.
        for(int i = 0; i < miArray.length; i++){
            miArray[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(12-3+1)+3));
        }
        
        
        System.out.println("EJERCICIO 2: FUNCIÓN DE PARIDAD");
        System.out.println("===============================");
        
        
        //Llamada a la función.
        paridad = esPar(miArray);
        
        
        //Mostrar array y lanzar mensaje.
        System.out.print("El array: ");
        for(int i = 0; i < miArray.length; i++){
            System.out.print(miArray[i]+" ");
        }
        System.out.println("");
        System.out.println("Es impar?: "+paridad);
        
        
    }

    
    //Creación de función esPar.
    private static boolean esPar(int[] ElArray) {
        boolean parity = true;
        for(int i = 0; i < ElArray.length; i++){
            if((ElArray[i] % 2) == 0){
                parity = false;
            }    
        }
        return parity;        
    }
    
}
