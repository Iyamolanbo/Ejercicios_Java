/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospersonales;

import java.util.Scanner;

/**
 *
 * @author bombe
 */
public class Ejercicios_Arrays_12356781013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
        
        /*
        Archivo: Ejercicio 1
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a continuación.
        Muestra el contenido de todos los elementos del array
        */
        
        int[] num = new int[12];

        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[5] = 14;
        num[7] = 5;
        num[8] = 120;
        
        System.out.println("Los valores del array son num: ");
        
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        
        
        
        /*
        Archivo: Ejercicio 2
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos según la tabla que se muestra
        a continuación. Muestra el contenido de todos los elementos del array
        
        
        char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        
        System.out.println("Los valores del array son simbolo: ");
        
        for(int i = 0; i < simbolo.length; i++){
            System.out.println(simbolo[i]);
        }
        */
        
         
        /*
        Archivo: Ejercicio 3
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir,
        el primero que se introduce es el último en mostrarse y viceversa
        
        
        int numero = 0;
        int[] arrayNum = new int[10];
        
        for(int i = 0; i < arrayNum.length; i++){
            System.out.println("Introduzca el número "+i+" del array: ");
            numero = sc.nextInt();
            arrayNum[i] = numero;
        }

            System.out.println("tamaño "+arrayNum.length);
        
        
        System.out.println("Los valores del array son: ");
        
        for(int i = arrayNum.length - 1; i >= 0; i--){
            System.out.println(arrayNum[i]);
        }
        */
        
        /*
        Archivo: Ejercicio 5
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto
        con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
        
        
        int[] arrayNum = new int[3];
        int numero = 0, maximo = arrayNum[0], minimo = arrayNum[0];
        
        for(int i = 0; i < arrayNum.length; i++){
            System.out.println("Introduzca un número del array: ");
            numero = sc.nextInt();
            arrayNum[i] = numero;
            
            if (maximo < arrayNum[i]){
                maximo = arrayNum[i];
            }
            
            if (minimo > arrayNum[i]){
                minimo = arrayNum[i];
            } 
        }

        
        System.out.println("El maximo valor dentro del array es: "+maximo);
        System.out.println("El minimo valor dentro del array es "+minimo);
        */
        
        /*
        Archivo: Ejercicio 6
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los elementos de ese array, 
        es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc
        
        
        int[] array_normal = new int[15];
        int[] array_rota = new int[15];
        
        int numero = 0;
        
        for(int i = 0; i < array_normal.length; i++){
            System.out.print("Introduzca un valor dentro del array: ");
            numero = sc.nextInt();
            array_normal[i] = numero;
        }
        
        System.out.println("");
        
        System.out.println("El array normal es: ");
        
        for(int i = 0; i < array_normal.length; i++){
            System.out.print(array_normal[i]+" ");
        }
        
        System.out.println("");
        
        array_rota[0] = array_normal[array_normal.length-1];
        
        for(int i = 0; i < array_rota.length-1; i++){
            array_rota[i+1] = array_normal[i];
        }
        
        System.out.println("");
        
        System.out.println("El array rotado es: ");
        
        for(int i = 0; i < array_rota.length; i++){
            System.out.print(array_rota[i]+" ");
        }
        */
        
        /*
        Archivo: Ejercicio 7
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios.
        El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del primer valor por el segundo 
        en la lista generada anteriormente.
        
        
        int[] array_lista = new int[10];
        int aleatorio = ((int)(Math.random()*20));
        int numero_uno = 0, numero_dos;
        
        
        for(int i = 0; i < array_lista.length; i++){
            array_lista[i] = aleatorio;
            aleatorio = ((int)(Math.random()*20));
        }
        
        System.out.println("");
              
        System.out.println("Los valores del array son: ");
        
        for(int i = 0; i < array_lista.length; i++){
            System.out.print(array_lista[i]+" ");
        }
        
        System.out.println("");
        
        System.out.print("Introduzca el valor de la lista que quiera cambiar: ");
        numero_uno = sc.nextInt();
        
        System.out.print("Introduzca el nuevo valor que quiere añadir: ");
        numero_dos = sc.nextInt();
        
        for(int i = 0; i < array_lista.length; i++){
            if(array_lista[i] == numero_uno){
                array_lista[i] = numero_dos;
            }
        }
        
        System.out.println("Los valores del array con los cambios son: ");
        
        for(int i = 0; i < array_lista.length; i++){
            System.out.print(array_lista[i]+" ");
        }
        */
        
        /*
        Archivo: Ejercicio 8
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y que muestre
        a continuación un diagrama de barras horizontales con esos datos.
        
        
        double[] array_temp = new double[5];
        double[] array = {12,2,21,4,5};
                
        double temp_mes = 0;
        
        for(int i = 0; i < array_temp.length; i++){
            System.out.print("Introduzca la temperatura del mes: ");
            temp_mes = sc.nextDouble();
            array_temp[i] = temp_mes;
        }
        
        System.out.println("");
        System.out.println("Diagrama:");
        System.out.println("");
        
        
        for(int i = 0; i < array_temp.length; i++){
            System.out.print(array_temp[i]+": ");
            for(int j = 0; j < array_temp[i]; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
        */
        

        /*
        Archivo: Ejercicio 10
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. 
        El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos
        los números impares a las celdas restantes.
        */
        /*
        int[] array_normal = new int[20];
        int[] array_auxPar = new int[20];
        int[] array_auxImp = new int[20];
        final int paridad = 2;
        int contadorPar = 0, contadorImp = 0, cuentaLastArray = 0;
        
        int aleatorio = ((int)(Math.random()*100));
        
        for(int i = 0; i < array_normal.length; i++){
            array_normal[i] = aleatorio;
            aleatorio = ((int)(Math.random()*100));
        }
        
        System.out.print("El array normal es: ");
        
        for(int i = 0; i < array_normal.length; i++){
            System.out.print(array_normal[i]+" ");
        }
        System.out.println("");
        
        //Separar pares de impares y guardarlos en sus respectivos arrays.
        for(int i = 0; i < array_normal.length; i++){
            if((array_normal[i]%paridad) == 0){
                array_auxPar[contadorPar] = array_normal[i];
                contadorPar++;
            } else{
                array_auxImp[contadorImp] = array_normal[i];
                contadorImp++;
            }
        }
        
        //Rellenar de nuevo el array inicial con la suma de los dos auxiliares (a base de machacar los datos anteriores).
        for(int i = 0; i < contadorPar; i++){
            array_normal[i] = array_auxPar[i];
        }
        
        for(int i = contadorPar; i < array_normal.length; i++){
            array_normal[i] = array_auxImp[cuentaLastArray];
            cuentaLastArray++;
        }
        
        
        System.out.print("El array recolocado es: ");
        
        for(int i = 0; i < array_normal.length; i++){
            System.out.print(array_normal[i]+" ");
        }
        System.out.println("");
        */


        /*
        Archivo: Ejercicio 13
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 27/10/2026
        Descripción: Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500
        (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el máximo o el mínimo.
        Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.
        */
        
        /*
        int[] arrayde100 = new int[100];
        int aleatorio = ((int)(Math.random()*500));
        int mayor = aleatorio, menor = aleatorio, salto = 0, respuesta = 0;
        
        for(int i = 0; i < arrayde100.length; i++){
            arrayde100[i] = aleatorio;
            aleatorio = ((int)(Math.random()*501));
        }
        
        for(int i = 0; i < arrayde100.length; i++){
            if(mayor < arrayde100[i]){
                mayor = arrayde100[i];
            } else if (menor > arrayde100[i]){
                menor = arrayde100[i];
            }
        }
        
        
        for(int i = 0; i < arrayde100.length; i++){
            System.out.print(arrayde100[i]+" ");
            if(salto == 20){
                System.out.println("");
                salto = 0;
            }
            salto++;
        }
        salto = 0;
        System.out.println("");
        
        
        System.out.println("Qué desea ver?:");
        System.out.println("1 - Mayor.");
        System.out.println("2 - Menor.");
        System.out.print(":>_");
        respuesta = sc.nextInt();
        
        
        if(respuesta == 1){
            for(int i = 0; i < arrayde100.length; i++){
                if(arrayde100[i] == mayor){
                    System.out.print(" **"+arrayde100[i]+"** ");
                } else{
                    System.out.print(arrayde100[i]+" ");
                }
                if(salto == 20){
                    System.out.println("");
                    salto = 0;
                }
                salto++;
            }
        } else if(respuesta == 2){
            for(int i = 0; i < arrayde100.length; i++){
                if(arrayde100[i] == menor){
                    System.out.print(" **"+arrayde100[i]+"** ");
                } else{
                    System.out.print(arrayde100[i]+" ");
                }
                if(salto == 20){
                    System.out.println("");
                    salto = 0;
                }
                salto++;
            }
        }
        System.out.println("");
        */
         
    }
    
}
