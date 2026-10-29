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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Archivo: Ejercicio 3
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 27/10/2026
        Descripción: Conteo de elementos y detección de pares e impares
        */
        
        Scanner sc = new Scanner(System.in);
        int contA = 0, contX = 0, contPar = 0, contImp = 0;
        
        char[] arrayLetras = {'A','X','A','X','X','A','B','X'};
        char[] arrayInver = new char[8];
        char[] arrayPar = new char[4];
        char[] arrayImp = new char[4];
        
        System.out.print("El array normal es: ");
        System.out.println(Arrays.toString(arrayLetras));
        
        //Conteo de letras dentro del array normal.
        for(int i = 0; i < arrayLetras.length; i++){
            if(arrayLetras[i] == 'A'){
                contA++;
            } else if(arrayLetras[i] == 'X'){
                contX++;
            }
        }
        System.out.println("Hay "+contA+" A");
        System.out.println("Hay "+contX+" X");
        
        
        Arrays.fill(arrayInver, 'B');   //Rellenar el array invertido de solo B`s.
        
        //Invertir letras dentro del array invertido, tomando como ayuda el array normal.
        for(int i = 0; i < arrayLetras.length; i++){
            if(arrayLetras[i] == 'A'){
                arrayInver[i] = 'X';
            } else if(arrayLetras[i] == 'X'){
                arrayInver[i] = 'A';
            }
        }
        
        System.out.println("El array invertido es: "+Arrays.toString(arrayInver));
        
        //Asignar las posiciones pares e impares a los distintos arrays.
        for(int i = 0; i < arrayLetras.length; i++){
            if(i%2 == 0){
                arrayPar[contPar] = arrayLetras[i];
                contPar++;
            } else{
                arrayImp[contImp] = arrayLetras[i];
                contImp++;
            }
        }
        arrayPar[arrayPar.length-1] = 'B';
        arrayImp[arrayImp.length-1] = 'B';
        

        System.out.println("El array par es: "+Arrays.toString(arrayPar));
        System.out.println("El array impar es: "+Arrays.toString(arrayImp));
        

    }
    
}
