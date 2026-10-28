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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Archivo: Ejercicio 4
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 28/10/2026
        Descripción: Desplazar, de forma circular, elemento 'B' de la bomba
        */
        
        Scanner sc = new Scanner(System.in);
        
        char[] arrayBomba = {'X','X','X','X','X','X','B','X'};
        int posicion = 0, multiplicador = 0, restador = 0, newPosicion;
        
        System.out.print("Array antes del arreglo: ");
        System.out.println(Arrays.toString(arrayBomba));
        
        
        System.out.println("Introduzca cuántas posiciones quiere desplazar la bomba: ");
        System.out.print(":>_");
        posicion = sc.nextInt();
        
        //Comprobar que el usuario introduzca correctamente los valores.
        while((posicion < 0)||(posicion > 99)){
            System.out.println("El valor introducido excede el límite.");
            System.out.println("Por favor, introduzca un valor dentro del rango 0 - 99.");
            System.out.print(":>_");
            posicion = sc.nextInt();
        }
        
        Arrays.fill(arrayBomba, 'X');
        
        //Un método bastante rudimentario para "recorrer" el array y encontrar la nueva posición.
        if(posicion <= 8){
            arrayBomba[posicion-1] = 'B';
        } else{
            multiplicador = posicion/arrayBomba.length;
            restador = multiplicador*arrayBomba.length;
            newPosicion = posicion - restador;
            arrayBomba[newPosicion-1] = 'B';
        }
        
        System.out.print("Array después del arreglo: ");
        System.out.println(Arrays.toString(arrayBomba));

        
    }
    
}
