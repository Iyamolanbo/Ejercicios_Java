/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2alternativa;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bombe
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Archivo: Ejercicio 2
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 27/10/2026
        Descripción: Creación de otro array y juego. Ampliación del ejercicio 1
        */
        
        Scanner sc = new Scanner (System.in);
        int dimension = 0, aleatorio = 0, contador = 0, respuesta = 0;
        boolean ganar = false;
        
        System.out.println("Introduzca el tamaño del array:");
        System.out.print(":>_");
        dimension = sc.nextInt();
        
        aleatorio = (int)(Math.random()*dimension);
        
        char[] arrayBomba = new char[dimension];
        
        Arrays.fill(arrayBomba, 'X');
        arrayBomba[aleatorio] ='B';
        
        
        for(int i = 0; i < arrayBomba.length; i++){
            System.out.print(i+"."+arrayBomba[i]+" ");
        }
        System.out.println("");
        
        do{
            System.out.println("Donde cree que está la bomba?:");
            System.out.print(":>_");
            respuesta = sc.nextInt();
            
            if(arrayBomba[respuesta] == 'B'){
                ganar = true;
            } else{
                arrayBomba[respuesta] = 'A';
                System.out.println("No. Inténtelo de nuevo.");
            }
            contador++; 
        }while((contador < 3)&&(ganar == false));
        
        
        if (contador == 3){
            System.out.println("Lo siento. Ha perdido.");
        } else if (contador < 3){
            System.out.println("Ha ganado!");
        }
        
        System.out.println(Arrays.toString(arrayBomba));
   
        
    }
    
}
