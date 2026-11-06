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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración de variables.
        Scanner sc = new Scanner(System.in);
        String miCadena = "";
        int contador = 0;
        
        
        System.out.println("EJERCICIO 4: FUNCIÓN DE CONTADOR DE CONSONANTES");
        System.out.println("================================================");
        
        
        System.out.println("Escriba la frase que desee enmarcar en mi corazón mi bebito fiu-fiu: ");
        System.out.print(":>_");
        miCadena = sc.nextLine();
        
        
        //Llamada a la función calcularPuntuacionTextoB.
        contador = calcularPuntuacionTextoB(miCadena);
        
        
        System.out.println("Su puntuación es de: "+contador);
        
        
    }

    
    //Creación de función calcularPuntuacionTextoB.
    private static int calcularPuntuacionTextoB(String LaCadena) {
        String mayus = LaCadena.toUpperCase();  //Evaluamos la frase en mayúscula.
        int contadorGen = 0; 
        for(int i = 0; i < mayus.length(); i++){   
            if((mayus.charAt(i) != 'A')&&(mayus.charAt(i) != 'E')&&(mayus.charAt(i) != 'I')&&
                    (mayus.charAt(i) != 'O')&&(mayus.charAt(i) != 'U')){
                contadorGen = contadorGen+2;
            }
        }  
        return contadorGen;
    }
    
}
