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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración de variables.
        char[][] miMatriz = new char[4][4];
        
        
        //Rellenar matriz.
        for(int i = 0; i < miMatriz.length; i++){
            for(int j = 0; j < miMatriz[i].length; j++){
                if(((i+j)%2) == 0){
                    miMatriz[i][j] = '+';
                }
                else{
                    miMatriz[i][j] = '-';
                }
            }
        }
        
        
        System.out.println("EJERCICIO 3: MATRIZ ESPECIAL");
        System.out.println("============================");


        //Mostrar matriz en forma de tabla formateada.       
        for(int i = 0; i < miMatriz.length; i++){
            System.out.println(Arrays.toString(miMatriz[i]));
        }
        System.out.println("");
            
        
    }
    
}
