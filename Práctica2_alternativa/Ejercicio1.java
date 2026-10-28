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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Archivo: Ejercicio 1
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 27/10/2026
        Descripción: Creación del array y colocación de la bomba
        */
        
        Scanner sc = new Scanner (System.in);
        int dimension = 0, aleatorio = 0;
        
        System.out.println("Introduzca el tamaño del array: ");
        System.out.print(":>_");
        dimension = sc.nextInt();
        
        aleatorio = (int)(Math.random()*dimension);
        
        char[] arrayBomba = new char[dimension];
        
        Arrays.fill(arrayBomba, 'X');
        arrayBomba[aleatorio] ='B';
        
        System.out.println(Arrays.toString(arrayBomba));
        
    }
    
}
