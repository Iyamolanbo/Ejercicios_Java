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
        
        /*
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
        */
        
        /*
        Archivo: Ejercicio 7
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla de distancia, el programa avise diciendo
        ¡Cuidado! ¡Hay una mina cerca!
        */
        /*
        char[][] tablero = new char[6][6];
        char[][] tableroCopia = new char[6][6];
        
        final char letra = 'U';
        
        boolean muerte = false;
        
        int contador = 0, coorx = 0, coory = 0, aleatorio = ((int)(Math.random()*36));
        
        
        for(int i = 0; i < tablero.length; i++){
            Arrays.fill(tablero[i], 'X');
        }
        
        //El tableroCopia será el que mostremos al usuario porque no queremos que vea dónde está la bomba.
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tableroCopia[i][j] = tablero[i][j];
            }
        }
        
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Colocar la bomba un lugar aleatorio del tablero.
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                if(contador == aleatorio){
                    tablero[i][j] = 'B';
                }
                contador++;
            }
        }
        
        
        do{
            System.out.println("Indique dónde quiere colocar la marca: ");
            System.out.println("Coordenada X:");
            System.out.print(":>_");
            coorx = sc.nextInt();
            System.out.println("Coordenada Y:");
            System.out.print(":>_");
            coory = sc.nextInt();
            
            while((coorx >= 6)||(coorx < 0)||(coory >= 6)||(coory < 0)){
                System.out.println("Datos incorrectos:");
                System.out.println("Coordenada X:");
                System.out.print(":>_");
                coorx = sc.nextInt();
                System.out.println("Coordenada Y:");
                System.out.print(":>_");
                coory = sc.nextInt();
            }
            
            
            //REVISAR. NO FUNCIONA CORRECTAMENTE. Evaluar posiciones a 1a casilla de distancia.
            if((tablero[coorx][coory-1] == 'B')||(tablero[coorx][coory+1] == 'B')||(tablero[coorx-1][coory-1] == 'B')
               ||(tablero[coorx-1][coory] == 'B')||(tablero[coorx-1][coory+1] == 'B')||(tablero[coorx+1][coory-1] == 'B')
               ||(tablero[coorx+1][coory] == 'B')||(tablero[coorx+1][coory+1] == 'B')){
                System.out.println("¡Cuidado! ¡Hay una mina cerca!");
            }
            
            if(tablero[coorx][coory] == 'B'){
                tablero[coorx][coory] = 'M';
                System.out.println("Ha tocado una mina.");
                muerte = true;
            } else{
                tableroCopia[coorx][coory] = letra;
            }
            
            
            
            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[i].length; j++){
                    System.out.print(tableroCopia[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();

        }while(muerte == false);
        */
        
        /*
        Archivo: Ejercicio 10
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Realiza el juego de las tres en raya
        */
        /*
        char[][] tablero = new char[3][3];
        char letraUsu = 'X', letraMaq = 'O';
        int aleatorio = ((int)(Math.random()*6));
        int contador = 0, coorx = 0, coory = 0, contUsu = 0, contMaq = 0;
        boolean vencedor = false;
        
        for(int i = 0; i < tablero.length; i++){
            Arrays.fill(tablero[i], '_');
        }
        
        do{
            System.out.println("Indique dónde quiere colocar la marca: ");
            System.out.println("Coordenada X:");
            System.out.print(":>_");
            coorx = sc.nextInt();
            System.out.println("Coordenada Y:");
            System.out.print(":>_");
            coory = sc.nextInt();

            //Verificar que el usuario pone las coordenadas.
            while((coorx >= 3)||(coorx < 0)||(coory >= 3)||(coory < 0)){
                System.out.println("Datos incorrectos:");
                System.out.println("Coordenada X:");
                System.out.print(":>_");
                coorx = sc.nextInt();
                System.out.println("Coordenada Y:");
                System.out.print(":>_");
                coory = sc.nextInt();
            }

            //Verificar que la posicón del tablero elejida esté vacía.
            while((tablero[coorx][coory] == letraUsu)||(tablero[coorx][coory] == letraMaq)){
                System.out.println("Posición ocupada. Elija otra:");
                System.out.println("Datos incorrectos:");
                System.out.println("Coordenada X:");
                System.out.print(":>_");
                coorx = sc.nextInt();
                System.out.println("Coordenada Y:");
                System.out.print(":>_");
                coory = sc.nextInt();
            }

            tablero[coorx][coory] = letraUsu;

            //Colocar eleccion de la máquina.
            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[i].length; j++){
                    if(contador == aleatorio){
                        if(tablero[i][j] == letraUsu){
                            aleatorio = ((int)(Math.random()*6));
                        } else{
                            tablero[i][j] = letraMaq;
                        }
                    }
                    contador++;
                }
            }
            aleatorio = ((int)(Math.random()*6));
            contador = 0;

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[i].length; j++){
                    System.out.print(tablero[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            
            for(int i = 0; i < tablero.length; i++){
                if(tablero[0][i] == 'x'){
                    contUsu++;
                } else if(tablero[0][i] == 'O'){
                    contMaq++;
                }
            }
            
            System.out.println(contUsu);
            System.out.println(contMaq);
            
            if(contUsu == 3){
                System.out.println("Venció el usuario.");
                vencedor = true;
            } else if(contMaq == 3){
                System.out.println("Venció la máquina.");
                vencedor = true;
            }
            
        } while(vencedor == false);
        */
        
        
        /*
        Archivo: Ejercicio 11
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios 
        entre 200 y 300. A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina superior izquierda
        a la esquina inferior derecha, así como el máximo, el mínimo y la media de los números que hay en esa diagonal
        */
        
        int[][] matriz = new int[10][10];
        int[] arrayMat = new int[10];
        int aleatorio = ((int)(Math.random()*(300-200+1)+200));
        int max = aleatorio, min = aleatorio, media = 0;
        

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio;
                aleatorio = ((int)(Math.random()*(300-200+1)+200));
            }
        }
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    arrayMat[i] = matriz[i][j];
                }
            }
        }
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.print("La diagonal está formada por: ");
        for(int i = 0; i < arrayMat.length; i++){
            System.out.print(arrayMat[i]+" ");
        }
        System.out.println();
        
        for(int i = 0; i < arrayMat.length; i++){
            if(max < arrayMat[i]){
                max = arrayMat[i];
            } else if(min > arrayMat[i]){
                min = arrayMat[i];
            }
            media = media + arrayMat[i];
        }
        
        media = media/arrayMat.length;
        
        System.out.println("El número máximo: "+max);
        System.out.println("El número mínimo: "+min);
        System.out.println("La media: "+media);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
