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
public class Ejercicios_Inventados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
        Archivo: Ejercicio 1
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Declara un array de 10 enteros, rellénalo con los números del 1 al 10 usando un bucle for e imprímelos por pantalla
        */
        /*
        int[] array1 = new int[10];
        int aleatorio = (int)(Math.random()*(10-1+1)+1);
        
        for(int i = 0; i < array1.length; i++){
            array1[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(10-1+1))+1);
        }
        
        System.out.print("El array es: ");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        */
        
        
        /*
        Archivo: Ejercicio 2
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Crea un array de 5 números enteros con valores fijos, recorre el array acumulando la suma de todos sus elementos
        y muestra el resultado total.
        */
        /*
        int[] array2 = new int[5];
        int suma = 0, aleatorio = ((int)(Math.random()*(50-12+1))+12);
        
        for(int i = 0; i < array2.length; i++){
            array2[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(50-12+1))+12);
            suma = suma + array2[i];
        }
        
        System.out.print("El array es: ");
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        
        System.out.println("La suma de todos los elementos son: "+suma);
        */
        
        /*
        Archivo: Ejercicio 3
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Dado un array de 8 números enteros desordenados, diseña un algoritmo que encuentre y muestre el valor máximo
        y el valor mínimo almacenados en él.
        */
        /*
        int[] array3 = new int[8];
        int aleatorio = ((int)(Math.random()*(50-12+1))+12);
        int max = aleatorio, min = aleatorio; 
        
        for(int i = 0; i < array3.length; i++){
            array3[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(50-12+1))+12);
            
        }
        
        for(int i = 0; i < array3.length; i++){
            if(max < array3[i]){
                max = array3[i];
            } else if(min > array3[i]){
                min = array3[i];
            }
        }
        
        System.out.print("El array es: ");
        for(int i = 0; i < array3.length; i++){
            System.out.print(array3[i]+" ");
        }
        System.out.println();
        
        System.out.println("El número máximo es: "+max);
        System.out.println("El número mínimo es: "+min);
        */
        
        /*
        Archivo: Ejercicio 4
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción:  Implementa el algoritmo de búsqueda lineal para comprobar si el número 7 existe dentro de un array predefinido
        de 10 elementos, imprimiendo un mensaje de éxito o de fallo.
        */
        /*
        int[] array4 = new int[10];
        int aleatorio = ((int)(Math.random()*(15-2)+1)+2);
        final int number = 7;
        boolean ser = false;
        
        for(int i = 0; i < array4.length; i++){
            array4[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(15-2)+1)+2);
        }
        
        
        System.out.print("El array es: ");
        for(int i = 0; i < array4.length; i++){
            System.out.print(array4[i]+" ");
        }
        System.out.println();
        
        
        for(int i = 0; i < array4.length; i++){
            if(array4[i] == number){
                ser = true;
            }
        }
        
        if(ser == true){
            System.out.println("El número "+number+" está dentro del array.");
        }
        */
        
        /*
        Archivo: Ejercicio 5
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Crea un array de origen con 6 elementos y utiliza un bucle para volcar sus elementos en un segundo array
        de destino pero en orden inverso, mostrando este último.
        */
        /*
        int[] array5 = new int[6];
        int[] array5Inver = new int[6];
        int cuenta = array5.length-1;
        
        int aleatorio = ((int)(Math.random()*(34-4)+1)+4);
        
        for(int i = 0; i < array5.length; i++){
            array5[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(34-4)+1)+4);
        }
        
        for(int i = 0; i < array5.length; i++){
            array5Inver[i] = array5[cuenta];
            cuenta--;
        }
        
        System.out.print("El array normal: ");
        for(int i = 0; i < array5.length; i++){
            System.out.print(array5[i]+" ");
        }
        System.out.println();
        
        System.out.print("El array invertido: ");
        for(int i = 0; i < array5Inver.length; i++){
            System.out.print(array5Inver[i]+" ");
        }
        System.out.println();
        */
        
        
        /*
        Archivo: Ejercicio 6
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Rellena un array de 15 posiciones con números aleatorios pequeños (o fijos) y cuenta cuántas veces se repite
        un número determinado introducido por ti.
        */
        /*
        int[] array6 = new int[15];
        int numUser = 0, contador = 0, aleatorio = ((int)(Math.random()*(300-0)+1)+0);
        
        for(int i = 0; i < array6.length; i++){
            array6[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(34-4)+1)+4);
        }
        
        System.out.println("Introduzca la cifra buscar: ");
        System.out.print(":>_");
        numUser = sc.nextInt();
        
        for(int i = 0; i < array6.length; i++){
            if(numUser == array6[i]){
                contador++;
            }
        }
        
        System.out.print("El array es: ");
        for(int i = 0; i < array6.length; i++){
            System.out.print(array6[i]+" ");
        }
        System.out.println();
        
        System.out.println("El número "+numUser+" aparece "+contador+" veces.");
        */
        
        /*
        Archivo: Ejercicio 7
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 03/11/2026
        Descripción: Declara un array con las notas (números enteros del 0 al 10) de 6 alumnos, calcula la nota media de la clase
        y muestra cuántos alumnos están por encima de esa media.
        */
        
        int[] array7 = new int[6];
        int aleatorio = ((int)(Math.random()*(10-0)+1)+0);
        int contApro = 0, contSus = 0;
        
        
        for(int i = 0; i < array7.length; i++){
            array7[i] = aleatorio;
            aleatorio = ((int)(Math.random()*(10-0)+1)+0);
        }
        
        System.out.print("El array es: ");
        for(int i = 0; i < array7.length; i++){
            System.out.print(array7[i]+" ");
            if(array7[i] >= 5){
                contApro++;
            } else if(array7[i] < 5){
                contSus++;
            }
        }
        System.out.println();
        
        System.out.println("Hay "+contApro+" aprobados.");
        System.out.println("Hay "+contSus+" suspendidos.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
