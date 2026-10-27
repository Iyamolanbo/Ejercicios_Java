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
public class Ejercicios_Bucles_123456789 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Archivo: Ejercicio 1
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for
        */
        final int number = 5;
        
        System.out.println("Los múltiplos de 5, entre 0 y 100 son (con bucle for):");
        
        for (int i = 0; i <= 100; i++){
            if (i%number == 0){
                System.out.println(i);
            }
        }
        
        
        /*
        Archivo: Ejercicio 2
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
        
        final int number = 5;
        int contador = 0;
        
        System.out.println("Los múltiplos de 5, entre 0 y 100 son (con bucle while):");
        
        while (contador <= 100){
            if (contador%number == 0){
                System.out.println(contador);
            }
            contador++;
        }
        */
        
        /*
        Archivo: Ejercicio 3
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while
        
        
        final int number = 5;
        int contador = 0;
        
        System.out.println("Los múltiplos de 5, entre 0 y 100 son (con bucle do-while):");
        
        do {
            if (contador%number == 0){
                System.out.println(contador);
            }
            contador++;
        } while (contador <= 100);
        */
        
        /*
        Archivo: Ejercicio 4
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for
        
        
        System.out.println("Los números del 320 al 160 hacia atrás de 20 en 20 son (con bucle for):");
        
        for (int i = 320; i >= 160; i=i-20){
            System.out.println(i);
        }
        */
        
        /*
        Archivo: Ejercicio 5
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while
        
        
        int tope_superior = 320, tope_inferior = 160;
        
        System.out.println("Los números del 320 al 160 hacia atrás de 20 en 20 son (con bucle while):");
        
        while (tope_superior >= tope_inferior){
            System.out.println(tope_superior);
            tope_superior = tope_superior - 20; 
        }
        */
        
        
        /*
        Archivo: Ejercicio 6
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while
        
        
        int tope_superior = 320, tope_inferior = 160;
        
        System.out.println("Los números del 320 al 160 hacia atrás de 20 en 20 son (con bucle do-while):");
        
        do {
            System.out.println(tope_superior);
            tope_superior = tope_superior - 20;
        } while (tope_superior >= tope_inferior);
        */
        
        
        /*
        Archivo: Ejercicio 7
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Control de acceso a una caja fuerte
        
        
        Scanner sc = new Scanner (System.in);
        int combinacion = 0, intentos = 3, codigo = 2345;
        
        
        
        while (intentos > 0){
            System.out.println("Introduzca la combinación de la caja fuerte: ");
            combinacion = sc.nextInt();
            
            if (combinacion == codigo){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                intentos = -1;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
            intentos--;   
        }
        */
        
        
        /*
        Archivo: Ejercicio 8
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Muestra la tabla de multiplicar de un número introducido por teclado
        
        
        Scanner sc = new Scanner (System.in);
        int number = 0;
        
        System.out.println("Introduzca el número cuya tabla de multiplicar quiere conocer:");
        number = sc.nextInt();
        
        System.out.println("");
        
        System.out.println("La tabla del "+number+" es: ");
        System.out.println("==================");
        
        for (int i = 1; i <= 10; i++){
            System.out.println(i+" x "+number+" = "+i*number);
        }
        */
        
        
        /*
        Archivo: Ejercicio 9
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 15/10/2026
        Descripción: Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
        
   
        Scanner sc = new Scanner(System.in);
        int numero_teclado = 0, contador = 0;
        
        System.out.println("Introduzca un número:");
        numero_teclado = sc.nextInt();
        
        while (numero_teclado != 0){
            numero_teclado = numero_teclado/10;
            contador++;
        }
        
        System.out.println("El número "+numero_teclado+" tiene "+contador+" números.");
        */
        
        
        
        
        
           
    }
    
}
