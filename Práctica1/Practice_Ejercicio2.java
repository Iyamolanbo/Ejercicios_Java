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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        char letra;
        double moto = 1.50d, turismo = 3.00d, furgoneta = 5.00d;
        double importe_m = 0d, importe_t = 0d, importe_f = 0d;
        int contador_m = 0, contador_t = 0, contador_f = 0;
        
        System.out.println("EJERCICIO 2:CONTROL DE ACCESO A PARKING");
        System.out.println("=========================");
        System.out.println("");
        
        System.out.println("Introduza el tipo de vehículo: ");
        letra = sc.next().charAt(0);
        
        do{
            while ((letra != 'm')&&(letra != 'M')&&(letra != 't')&&(letra != 'T')&&(letra != 'f')&&(letra != 'F')&&(letra != 's')&&(letra != 'S')){
                System.out.println("Vehículo no reconocido. Por favor, introduzca uno válido: ");
                letra = sc.next().charAt(0);
            }
            if ((letra == 'm')||(letra == 'M')){
                importe_m = importe_m + moto;
                contador_m++;
            } else if ((letra == 't')||(letra == 'T')){
                importe_t = importe_t + turismo;
                contador_t++;
            } else if ((letra == 'f')||(letra == 'F')){
                importe_f = importe_f +furgoneta;
                contador_f++;
            }
            
            System.out.println("Introduza el tipo de vehículo: ");
            letra = sc.next().charAt(0);
                
        } while ((letra != 's')&&(letra != 'S'));
        
        System.out.println("IMPORTE TOTAL:");
        System.out.println("El número de motos es: "+contador_m+". Con un importe total de: "+importe_m);
        System.out.println("El número de turismos es: "+contador_t+". Con un importe total de: "+importe_t);
        System.out.println("El número de furgonetas es: "+contador_f+". Con un importe total de: "+importe_f);
        
    }
    
}
