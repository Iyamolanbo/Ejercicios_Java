/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iyangamolonguaprac1;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int edad = 0, precio = 0, recaudacion = 0, contador_generacion_kiko = 0;
        
        System.out.println("EJERCICIO 5: RECAUDACIÓN FUNCIÓN DE TEATRO");
        System.out.println("=========================");
        System.out.println("");
        
        System.out.println("Introduzca una edad: ");
        edad = sc.nextInt();
        
        do{
            if (edad < 18){
                precio = 6;
            } else if ((edad >= 18)&&(edad <= 65)){
                precio = 12;
            } else if (edad > 65){
                precio = 4;
                contador_generacion_kiko++;
            }
            
            recaudacion = recaudacion+precio;
            
            System.out.println("Introduzca una edad: ");
            edad = sc.nextInt();
            
        }while (edad != -1);
        
        System.out.println("La recaudación total es de: "+recaudacion+" euros.");
        System.out.println("El número total de expectadores de jubilados es: "+contador_generacion_kiko);
        
    }
    
}
