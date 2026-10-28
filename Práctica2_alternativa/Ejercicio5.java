package practica2alternativa;


import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author bombe
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Archivo: Ejercicio 5
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 28/10/2026
        Descripción: Calcular la distancia a la bomba
        */
        
        Scanner sc = new Scanner(System.in);
        
        char[] arrayBomba = new char[16];
        int[] arrayDistancia = new int[16];
        
        int contador = 0, valores = 0;
        int aleatorio = ((int)(Math.random()*16));
        
        Arrays.fill(arrayBomba, 'X');
        arrayBomba[aleatorio] = 'B';
        
        System.out.println(Arrays.toString(arrayBomba));
        
        for(int i = 0; i < arrayBomba.length; i++){
            if(arrayBomba[i] == 'B'){
                arrayDistancia[i] = 0;  
            } 
        }
        
        while(arrayBomba[contador] != 'B'){
            contador++;
        }
        
        //Rellenar el array de números antes del 0.
        valores = contador;
        for(int i = 0; i < contador; i++){
            arrayDistancia[i] = valores;
            valores--;
        }
        
        //Rellenar el array de números después del 0.
        valores = 0;
        for(int i = contador; i < arrayBomba.length; i++){
            arrayDistancia[i] = valores;
            valores++;
        }
        
        
        System.out.println(contador);
        System.out.println(Arrays.toString(arrayDistancia));
        
        
        
        
    }
    
}
