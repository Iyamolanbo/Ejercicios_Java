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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración de variables.
        int[][] matriz1 = new int[3][3];
        int[][] matriz1chica = new int[2][2];
        int aleatorio = ((int)(Math.random()*(10-2+1)+2));
        int determinante = 0;
        
        
        //Rellenar matriz.
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*(10-2+1)+2));
            }
        }
            
        
        System.out.println("EJERCICIO 1: MATRIZ Y SU DETERMINANTE");
        System.out.println("======================================");
        
        
        //Mostrar matriz en forma de tabla formateada.       
        for(int i = 0; i < matriz1.length; i++){
            System.out.println(Arrays.toString(matriz1[i]));
        }
        System.out.println("");
        
        
        //Pasar términos a la matriz chica 2x2.
        for(int i = 0; i < matriz1chica.length; i++){
            for(int j = 0; j < matriz1chica[i].length; j++){
                matriz1chica[i][j] = matriz1[i+1][j+1];
            }
        }
        
        
        //Cálculo del determinante. Método rudimentario.
        determinante = ((matriz1chica[0][0]*matriz1chica[1][1])-(matriz1chica[0][1]*matriz1chica[1][0]));
        
        
        System.out.println("El determinante de la submatriz inferior derecha es: "+determinante);
 
        
    }
    
}
