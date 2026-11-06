/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iyangamolonguaprac2;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración de variables.
        Scanner sc = new Scanner(System.in);
        String miCadena = "";
        int longCadena = 0, numAsses = 0;
        
        
        System.out.println("EJERCICIO 6: RECORRER STRING Y CONTABILIZAR SUS ASUNTOS");
        System.out.println("=======================================================");
        System.out.println("");
        

        System.out.println("Escriba una frase de almenos 10 caracteres: ");
        System.out.print(":>_");
        miCadena = sc.nextLine();
        longCadena = miCadena.length();
        
        
        //Verificamos que la frase cumple con las condiciones de máximo 10 caracteres.
        while(longCadena > 10){
            System.out.println("La frase excede la longitud máxima. Inténtelo de nuevo: ");
            System.out.print(":>_");
            miCadena = sc.nextLine();
            longCadena = miCadena.length();
        }
            
        
        //Contabilizamos el número de A/a. No utilizo ni lower ni upper porque para evaluar una sola cosa... casi que no. Tú em entiendes hermano.
        for(int i = 0; i < miCadena.length(); i++){   
            if((miCadena.charAt(i) == 'a')||(miCadena.charAt(i) == 'A')){
                numAsses++;
            } 
        }
        
        
        System.out.println("Hay un total de "+numAsses+" A/a");
        

    }
    
}
