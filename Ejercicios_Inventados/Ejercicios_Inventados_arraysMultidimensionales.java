/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_inventados;

import java.util.Scanner;

/**
 *
 * @author bombe
 */
public class Ejercicios_Inventados_arraysMultidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
        Archivo: Ejercicio 1
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 05/11/2026
        Descripción: Declara y crea una matriz bidimensional de enteros de 3 filas y 4 columnas y muestra sus dimensiones usando length.
        */
        /*
        int[][] matriz = new int[3][4];
        int aleatorio = ((int)(Math.random()*(98-12+1)+12));
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*(98-12+1)+12));
            }
        }
        
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        */
        
        
        
        /*
        Archivo: Ejercicio 3
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 05/11/2026
        Descripción: Crea una matriz bidimensional de 4x4 y asígnale a cada posición [i][j] el resultado de multiplicar i por j.
        */
        /*
        int[][] matriz = new int[4][4];
        //int multiplicador = 1;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i*j;
            }
        }
        
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        */
        
        
        /*
        Archivo: Ejercicio 4
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 05/11/2026
        Descripción: Recorre una matriz bidimensional de números enteros acumulando la suma de todos sus componentes en una variable global.
        */
        /*
        int[][] matriz = new int[4][4];
        int aleatorio = ((int)(Math.random()*(95-34+1)+34));
        int sumatorio = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*(95-34+1)+34));
            }
        }
        
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                sumatorio = sumatorio + matriz[i][j];
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        System.out.println("El sumatorio de todas las celdas del array son: "+sumatorio);
        */
        
        
        /*
        Archivo: Ejercicio 5
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 05/11/2026
        Descripción: Diseña un algoritmo de búsqueda lineal adaptado a matrices para encontrar en qué coordenadas exactas (fila, columna)
        se encuentra un número determinado.
        */
        /*
        int[][] matriz = new int[4][4];
        int aleatorio = ((int)(Math.random()*(298-54+1)+54));
        int numeroUsu = 0, coorx = 0, coory = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*(298-54+1)+54));
            }
        }
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        System.out.println("La coordenada de qué número desea conocer?: ");
        System.out.print(":>_");
        numeroUsu = sc.nextInt();
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(numeroUsu == matriz[i][j]){
                    coorx = i;
                    coory = j;
                }
            }
        }
        
        System.out.println("El número "+numeroUsu+", se encuentra en las coordenadas: ");
        System.out.println("X: "+coorx);
        System.out.println("Y: "+coory);
        */
        
        /*
        Archivo: Ejercicio 6
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 05/11/2026
        Descripción: Dada una matriz de 3x3, calcula y muestra de manera independiente la suma de los elementos de cada fila.
        */
        /*
        int[][] matriz = new int[3][3];
        int aleatorio = ((int)(Math.random()*(345-23+1)+23));
        int sumFila = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*(345-23+1)+23));
            }
        }
        
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                sumFila = sumFila + matriz[i][j];
            }
            System.out.println("La suma de términos en la fila "+i+" es: "+sumFila);
            sumFila = 0;
        }
        System.out.println();
        */
        
        
        /*
        Archivo: Ejercicio 7
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 05/11/2026
        Descripción: Utiliza bucles anidados para calcular y mostrar la suma total de los elementos de cada columna de una matriz dada.
        */
        /*
        int[][] matriz = new int[3][3];
        int aleatorio = ((int)(Math.random()*(10-2+1)+2));
        int sumCol = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*(10-2+1)+2));
            }
        }
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz.length; j++){
                sumCol = sumCol + matriz[j][i];
            }
            System.out.println("La suma de términos de la columna "+i+" es: "+sumCol);
            sumCol = 0;
        }
        System.out.println();
        */
        
        /*
        Archivo: Ejercicio 8
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 05/11/2026
        Descripción: Dada una matriz cuadrada (por ejemplo, 3x3), extrae y muestra únicamente los elementos de su diagonal principal.
        */
        
        int[][] matriz = new int[3][3];
        int aleatorio = ((int)(Math.random()*(234-42+1)+42));
        int diagonal = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*(234-42+1)+42));
            }
        }
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    diagonal = diagonal + matriz[i][j];
                }
            }
        }
        
        System.out.println("La suma de elementos de la diagonal principal son: "+diagonal);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
