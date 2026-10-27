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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        char letra;
        char letra_maq = 'z';
        double aleatorio = ((int)(Math.random()*20));
        
        
        
        System.out.println("EJERCICIO 3:PIEDRA, PAPEL O TIJERA");
        System.out.println("=========================");
        System.out.println("");
        
        System.out.println("Introduzca una letra por favor: ");
        letra = sc.next().charAt(0);
        
        
        while ((letra != 'r')&&(letra != 'R')&&(letra != 'p')&&(letra != 'P')&&(letra != 't')&&(letra != 'T')){
            System.out.println("El valor introducido no es válido. Por favor, introduzca uno correcto: ");
            letra = sc.next().charAt(0);
        }
        
        if ((aleatorio >= 0)&&(aleatorio <= 3)){
            letra_maq = 'r';
        } else if ((aleatorio > 3)&&(aleatorio <= 6)){
            letra_maq = 'p';
        } else if ((aleatorio > 6)&&(aleatorio <= 9)){
            letra_maq = 't';
        } else if ((aleatorio >= 10)&&(aleatorio <= 13)){
            letra_maq = 'R';
        } else if ((aleatorio > 13)&&(aleatorio <= 16)){
            letra_maq = 'P';
        } else if ((aleatorio > 16)&&(aleatorio <= 20)){
            letra_maq = 'T';
        }
        
        if (letra == letra_maq){
            System.out.println("El jugador 1 ha ganado.");
        } else if ((letra == 'r' && letra_maq == 't')||(letra == 'R' && letra_maq == 'T')||(letra == 'r' && letra_maq == 'T')||(letra == 'R' && letra_maq == 't')){
            System.out.println("Has ganado");
        } else if ((letra == 't' && letra_maq == 'r')||(letra == 'T' && letra_maq == 'R')||(letra == 't' && letra_maq == 'R')||(letra == 'T' && letra_maq == 'r')){
            System.out.println("Ha ganado la máquina");
        } else if ((letra == 'p' && letra_maq == 'r')||(letra == 'P' && letra_maq == 'R')||(letra == 'p' && letra_maq == 'R')||(letra == 'P' && letra_maq == 'r')){
            System.out.println("Has ganado");
        } else if ((letra == 'R' && letra_maq == 'P')||(letra == 'R' && letra_maq == 'P')||(letra == 'r' && letra_maq == 'P')||(letra == 'R' && letra_maq == 'p')){
            System.out.println("Ha ganado la máquina");
        } else if ((letra == 't' && letra_maq == 'p')||(letra == 'T' && letra_maq == 'P')||(letra == 't' && letra_maq == 'P')||(letra == 'T' && letra_maq == 'p')){
            System.out.println("Has ganado");
        } else if ((letra == 'p' && letra_maq == 't')||(letra == 'P' && letra_maq == 'T')||(letra == 'p' && letra_maq == 'T')||(letra == 'P' && letra_maq == 'p')){
            System.out.println("Ha ganado la máquina");
        } else if ((letra == 'p' && letra_maq == 'r')||(letra == 'P' && letra_maq == 'R')||(letra == 'p' && letra_maq == 'R')||(letra == 'P' && letra_maq == 'r')){
            System.out.println("Has ganado");
        } else if ((letra == 'r' && letra_maq == 'p')||(letra == 'R' && letra_maq == 'P')||(letra == 'r' && letra_maq == 'P')||(letra == 'R' && letra_maq == 'p')){
            System.out.println("Ha ganado la máquina");
        }
            
       
    }
    
}
