/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospersonales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bombe
 */
public class Ejercicios_Arrays_Ndimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /*
        Archivo: Ejercicio 1
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 01/11/2026
        Descripción: Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores según la siguiente tabla.
        Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.
        */
        /*
        int[][] num = new int[3][6];
        int aleatorio = ((int)(Math.random()*50));
        
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*50));
            }
        }
        
        System.out.print("Array_num  ");
        
        for(int i = 0; i < num[0].length; i++){
            System.out.print("Columna"+i+" ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < num.length; i++){
            System.out.print("Fila"+i+"          ");
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j]+"       ");
            }
            System.out.println("");
        }
        */
        
        /*
        Archivo: Ejercicio 5
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 02/11/2026
        Descripción: Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos 
        entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
        */
        /*
        int[][] matriz610 = new int[6][10];
        int aleatorio = ((int)(Math.random()*1000));
        int maximo = aleatorio, minimo = aleatorio;
        
        for(int i = 0; i < matriz610.length; i++){
            for(int j = 0; j < matriz610[i].length; j++){
                matriz610[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*1000));
            }
        }
               
        
        for(int i = 0; i < matriz610.length; i++){
            for(int j = 0; j < matriz610[i].length; j++){
                if(maximo < matriz610[i][j]){
                    maximo = matriz610[i][j];
                } else if(minimo > matriz610[i][j]){
                    minimo = matriz610[i][j];
                }
            }
        }
        
        System.out.println("La matriz es: ");
        for(int i = 0; i < matriz610.length; i++){
            for(int j = 0; j < matriz610[i].length; j++){
                System.out.print(matriz610[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("El elemnto maximo de la matriz es: "+maximo);
        System.out.println("El elemnto mínimo de la matriz es: "+minimo);
        */
          
        
        /*
        Archivo: Ejercicio 6
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 02/11/2026
        Descripción: Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos 
        entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo. Que no
        se repita ningún número del array.
        */
      
        int[][] matrizmod = new int[6][10];
        int aleatorio = ((int)(Math.random()*1000));
        int maximo = aleatorio, minimo = aleatorio, repeticion = 0;
        
        for(int i = 0; i < matrizmod.length; i++){
            for(int j = 0; j < matrizmod[i].length; j++){
                matrizmod[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*1000));
            }
        }
        
        System.out.println("Matriz antes del retoque:");
        for(int i = 0; i < matrizmod.length; i++){
            for(int j = 0; j < matrizmod[i].length; j++){
                System.out.print(matrizmod[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        for(int i = 0; i < matrizmod.length; i++){
            for(int j = 0; j < matrizmod[i].length; j++){
                for(int k = 0; k < matrizmod.length; k++){
                    for(int l = 0; l < matrizmod[k].length; l++){
                        if((matrizmod[i][j] == matrizmod[k][l])&&(i != k)&&(j != l)){
                            repeticion++;
                            aleatorio = ((int)(Math.random()*1000));
                            matrizmod[k][l] = aleatorio;
                        }
                    }
                }
            }
        }
        
        System.out.println("Matriz después del retoque:");
        for(int i = 0; i < matrizmod.length; i++){
            for(int j = 0; j < matrizmod[i].length; j++){
                System.out.print(matrizmod[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println(repeticion);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
