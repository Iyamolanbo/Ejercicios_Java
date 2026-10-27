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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        final double tarifa_base = 4.00d;
        double coste_total = 0d;
        int minutos_restantes = 0, minutos_usuario = 0;
        
        System.out.println("EJERCICIO 4: TARIFA DE BONO DE GIMNASIO");
        System.out.println("=========================");
        System.out.println("");

        System.out.println("Cuánto tiempo ha estado?: ");
        minutos_usuario = sc.nextInt();
        
        while (minutos_usuario < 0){
            System.out.println("Tiempo incorrecto. Por favor, introduzca un dato válido: ");
            minutos_usuario = sc.nextInt();
        }
        
        if (minutos_usuario < 60){
            coste_total = ((minutos_usuario*0.10)+tarifa_base);
        }else if (minutos_usuario >= 60){
            minutos_restantes = minutos_usuario - 60;
            coste_total =((60*0.10)+(minutos_restantes*0.60)+tarifa_base);
        }
        
        System.out.println("Usted ha jugado durante: "+minutos_usuario+ " minutos.");
        System.out.println("La pista le ha costado un total de: "+coste_total+" euros.");
        System.out.println("");
        System.out.println("DESGLOSE:");
        System.out.println("Tarifa base: "+tarifa_base+" euros.");
        System.out.println("coste por minutos: ");
        
        if (minutos_usuario < 60){
            System.out.println(minutos_usuario+" x 0.10 = "+minutos_usuario*0.10);
        }else if (minutos_usuario >= 60){
            System.out.println("60 x 0.10 = "+60*0.10);
            System.out.println(minutos_restantes+" x 0.06 = "+minutos_restantes*0.60);
        }
  
    }
    
}
