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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double temperatura = 0d;
        double grados_usuario = 0d;
        final double centinela = -50.0d;
        int contador = 0;
        double temperatura_media = 0;
        double temperatura_mas_baja = 0;
        
        System.out.println("EJERCICIO 1: REGISTRO DE TEMPERATURAS");
        System.out.println("=====================================");
        System.out.println("");
        
        System.out.println("Introduza el valor de la temperatura: ");
        grados_usuario = sc.nextDouble();
        temperatura_mas_baja = grados_usuario;
        
        
        while (grados_usuario > centinela){
            if (grados_usuario < temperatura_mas_baja){
                temperatura_mas_baja = grados_usuario;
            }
            temperatura = temperatura + grados_usuario;
            contador++;
            System.out.println("Introduza el valor de la temperatura: ");
            grados_usuario = sc.nextDouble();
        }
        
        temperatura_media = temperatura/contador;
        
        System.out.println("El número total de lecturas válidas es: "+contador);
        System.out.println("La temperatura media es de: "+temperatura_media);
        System.out.println("La temperatura más baja ha sido: "+temperatura_mas_baja);
         
    }
    
}
